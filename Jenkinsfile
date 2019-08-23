def defineEnvironment() {
    def branchName = "${env.BRANCH_NAME}"
    echo 'we are building on ' + env.BRANCH_NAME + ' branch'
    echo 'ecr credentials ID: ' + ECR_CREDENTIALS_ID

	 if (branchName == 'dev') {
        DEPLOYMENT_DIR_NAME='dev'
        CURRENT_KUBERNETES_NAMESPACE=KUBERNETES_NAMESPACE_dev
        echo 'we are building on dev environment'
		TAG_PREFIX='dev.' + '${VERSION}'
    }else if (branchName == 'test') {
        DEPLOYMENT_DIR_NAME='test'
        CURRENT_KUBERNETES_NAMESPACE=KUBERNETES_NAMESPACE_test
        echo 'we are building on test environment'
		TAG_PREFIX='test.' + '${VERSION}'
    }else if(branchName =='staging'){
		DEPLOYMENT_DIR_NAME='staging'
        CURRENT_KUBERNETES_NAMESPACE=KUBERNETES_NAMESPACE_staging
        echo 'we are building on staging environment'
		TAG_PREFIX='test.' + '${VERSION}'
	}else if(branchName =='stagingref'){
		DEPLOYMENT_DIR_NAME='stagingref'
        CURRENT_KUBERNETES_NAMESPACE=KUBERNETES_NAMESPACE_stagingref
        echo 'we are building on stagingref environment'
		TAG_PREFIX='rc.' + '${VERSION}'
	}else if(branchName =='stagingref2'){
		DEPLOYMENT_DIR_NAME='stagingref2'
        CURRENT_KUBERNETES_NAMESPACE=KUBERNETES_NAMESPACE_stagingref2
        echo 'we are building on stagingref2 environment'
		TAG_PREFIX='rc.' + '${VERSION}'
	}else if(branchName =='prod'){
		DEPLOYMENT_DIR_NAME='prod'
        CURRENT_KUBERNETES_NAMESPACE=KUBERNETES_NAMESPACE_prod
        echo 'we are building on production environment'
		TAG_PREFIX='ga'
	}else {
		DEPLOYMENT_DIR_NAME ='undefined'
        echo 'not recognized any deployment environments'
    }
    FINAL_IMAGE_NAME='${DOCKER_GREECE_URL}:' + TAG_PREFIX + '-${DOCKER_PROJECT_NAME}-' + '${SEMVER_VERSION}'
	DEPLOYMENT_CONFIG_DIR_PATH='./Deployment/' + DEPLOYMENT_DIR_NAME
	echo 'final image name' + FINAL_IMAGE_NAME
	echo 'deployment config dir path' + DEPLOYMENT_CONFIG_DIR_PATH
}
pipeline {
  environment {    
		  SEMVER_VERSION = '1.0.0'
		  VERSION = VersionNumber([projectStartDate: '2018-04-12',versionNumberString: '${BUILDS_ALL_TIME}', versionPrefix: '']);
          ECR_CREDENTIALS_ID = 'ecr:eu-central-1:jenkins-dxl-gr-ecr'
          DOCKER_GREECE_URL = '805276130606.dkr.ecr.eu-central-1.amazonaws.com/dxl-gr-myvodafone'
		  DOCKER_PROJECT_NAME = 'makemyplan'
          KUBERNETES_NAMESPACE_dev='dxl-dev-gr'
          KUBERNETES_NAMESPACE_test='dxl-test-gr'
		  KUBERNETES_NAMESPACE_staging='dxl-staging-gr'
		  KUBERNETES_NAMESPACE_stagingref='dxl-stagingref-gr'
		  KUBERNETES_NAMESPACE_stagingref2='dxl-stagingref2-gr'
		  KUBERNETES_NAMESPACE_prod='dxl-prod-gr'
        }
  options {
       buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
     }
   agent {
  label "docker"
  }
    stages {
      stage('Set environment') {
            steps {
                script {
                    defineEnvironment()
                }
            }
        }
      stage('Print result of environment setting') {
            steps {
                sh """
        echo build environment: $DEPLOYMENT_DIR_NAME
        echo final image name: $FINAL_IMAGE_NAME
        echo deployment config folder: $DEPLOYMENT_CONFIG_DIR_PATH
                """
            }
        }
      stage ('Java Build') {
        
         steps{
          configFileProvider([configFile(fileId: '3095fbce-dab3-45d3-8e42-adbd1303abc0', variable: 'MAVEN_SETTINGS')]) {
          container('docker') {
                     withCredentials([usernamePassword(credentialsId: 'nexus-functional-gr-user', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
          sh """
            echo "$VERSION"
            cd Code/MakeMyPlan
            mvn clean package -B -X -e -s $MAVEN_SETTINGS -Dtest=!vis.greece.makemyplan.karate*
             """   
              }
            }
          }
        }
      }
      stage ('Docker build'){
            steps{        
                  container('docker') {
                     withDockerRegistry([credentialsId: ECR_CREDENTIALS_ID, url: "https://${DOCKER_GREECE_URL}"]) {
                       sh """
                           cd Code/MakeMyPlan/src/main/docker/
                           cp ${WORKSPACE}/Code/MakeMyPlan/target/MakeMyPlan-0.0.1-SNAPSHOT.jar .
                           docker build -t ${FINAL_IMAGE_NAME} .            
                           docker push ${FINAL_IMAGE_NAME}
                       """
                   }
           }
       }
     } 
    stage ('Deployment'){
            when {
                expression { DEPLOYMENT_DIR_NAME != 'prod' &&  DEPLOYMENT_DIR_NAME != 'undefined'}
            }
       agent {
         label "kubectl"
            }
       steps{
       container('kubectl') {
         sh """
		  sed -i s/VERSION_NO/${VERSION}/ ${DEPLOYMENT_CONFIG_DIR_PATH}/makemyplan-deployment.yaml
          sed -i 's~DOCKER_GREECE_URL~${DOCKER_GREECE_URL}~' ${DEPLOYMENT_CONFIG_DIR_PATH}/makemyplan-deployment.yaml
          sed -i s/TAG_PREFIX/${TAG_PREFIX}/ ${DEPLOYMENT_CONFIG_DIR_PATH}/makemyplan-deployment.yaml
          sed -i s/DOCKER_PROJECT_NAME/${DOCKER_PROJECT_NAME}/ ${DEPLOYMENT_CONFIG_DIR_PATH}/makemyplan-deployment.yaml
		  sed -i s/SEMVER_VERSION/${SEMVER_VERSION}/ ${DEPLOYMENT_CONFIG_DIR_PATH}/makemyplan-deployment.yaml
          kubectl apply -f ${DEPLOYMENT_CONFIG_DIR_PATH} -n ${CURRENT_KUBERNETES_NAMESPACE}
         """
     }
    }
    }
   }
}
