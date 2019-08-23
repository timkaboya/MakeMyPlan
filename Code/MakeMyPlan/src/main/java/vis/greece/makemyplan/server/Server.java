package vis.greece.makemyplan.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class })
@SpringBootApplication
@ComponentScan({ "vis.greece", "com.vis" })
@Configuration
@EnableSwagger2
@EnableCaching
@EnableMongoRepositories(basePackages = { "vis.greece.mongo.repositories", "vis.greece.makemyplan.repository" })
public class Server {

	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args Program arguments - ignored.
	 */
	

	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }

	public static void main(String[] args) {
		// Tell server to look for accounts-server.properties or
		// accounts-server.yml
//		System.setProperty("spring.config.name", "server");
		SpringApplication.run(Server.class, args);
	}
}
