
@Facebook
Feature: Facebook Login Screen
  


  @Fb
  Scenario Outline: Entering Username & Password for facebook web application
  	Given Launch Facebook on browser
    Then I want to enter username <name>
    When  I want to enter Password <password>
    Then I click on login button

    Examples: 
      | name      | password            |  
      | "karthik" |  "123456karthik"  |
      #| "vamsi"   |  "3453434vamsi"   |
