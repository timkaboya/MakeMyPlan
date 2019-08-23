Feature: Test Get Sales Order

Background:    
    Given url "https://authenticate-stagingref-gr.myvdf.aws.cps.vodafone.com/gr/v1/authentication"
    And request '{"username":"pre_6946487740","password":"test1234", "scope":""}'
    Given header Content-Type = 'application/json'
    When method POST
    And def jwt = response.jws

Scenario: get success output   
    Given url "https://makemyplan-gr-dev.myvdf.aws.cps.vodafone.com/gr/v1/sales/order"
    And param cli = '2193100665'
    Given header Authorization = 'Bearer '+ jwt
    And header Content-Type = 'application/json'
    And header Accept-Language = 'en'
    When method GET
    And match response != '#null'
    And match response.orders[0].id != '#null'
    Then status 200
    
Scenario: get success output with cli 
    Given url "https://makemyplan-gr-dev.myvdf.aws.cps.vodafone.com/gr/v1/sales/order"
    And param cli = '2193100665'
    Given header Authorization = 'Bearer '+ jwt
    And header Content-Type = 'application/json'
    And header Accept-Language = 'en'
    When method GET
    And match response != '#null'
    And match response.orders[0].id != '#null'
    Then status 200
    
Scenario: get success output with orderid 
    Given url "https://makemyplan-gr-dev.myvdf.aws.cps.vodafone.com/gr/v1/sales/order"
    And param orderId = '1-11090677875'
    Given header Authorization = 'Bearer '+ jwt
    And header Content-Type = 'application/json'
    And header Accept-Language = 'en'
    When method GET
    And match response != '#null'
    And match response.orders[0].id != '#null'
    Then status 200
    
Scenario: get success output without Authorization header
    Given url "https://makemyplan-gr-dev.myvdf.aws.cps.vodafone.com/gr/v1/sales/order"
    And param orderId = '1-11090677875'
    And header Content-Type = 'application/json'
    And header Accept-Language = 'en'
    When method GET
    And match response != '#null'
    And match response.orders[0].id != '#null'
    Then status 200
    
Scenario: get error output missing header Accept-Language
    Given url "https://makemyplan-gr-dev.myvdf.aws.cps.vodafone.com/gr/v1/sales/order"
    And param orderId = '1-11090677875'
    Given header Authorization = 'Bearer '+ jwt
    And header Content-Type = 'application/json'
    When method GET
    Then status 400

    


    
Scenario: get error output missing input param cli or orderId
    Given url "https://makemyplan-gr-dev.myvdf.aws.cps.vodafone.com/gr/v1/sales/order"
    And header Content-Type = 'application/json'
    When method GET
    Then status 400