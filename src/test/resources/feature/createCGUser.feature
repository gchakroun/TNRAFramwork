@createCGUser
Feature: Login Test

  Scenario: get started
    Given Connect to the url "https://jitney-client-stg-01.azurewebsites.net/signup/client-credentials"
    And Set the value "kajivannist@gmail.com" in the xpath "//input[@type='emaillll']"
    And Set the value "Azerty123." in the xpath "//input[@name='password']"
    And Set the value "Azerty123." in the xpath "//input[@name='confirmPassword']"
    And Click normal the webElement with xpath "//button[@class='btn btn-card-primary']"
    And Get coockies
    And Open new tab
    And Connect to the url "https://temp-mail.org/en/"
    And Wait for "10" seconds
    #  And Click normal the webElement with xpath "//input[@class='form-control ng-pristine ng-invalid ng-touched']"
    Then Close the web drivr and quit

    
    