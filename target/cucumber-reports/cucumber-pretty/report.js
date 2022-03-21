$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/stepdefinitionpackage/FacebookLoginScreen.feature");
formatter.feature({
  "name": "Facebook Login Screen",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Facebook"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Entering Username \u0026 Password for facebook web application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Fb"
    }
  ]
});
formatter.step({
  "name": "Launch Facebook on browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I want to enter username \u003cname\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I want to enter Password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "password"
      ]
    },
    {
      "cells": [
        "\"karthik\"",
        "\"123456karthik\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Entering Username \u0026 Password for facebook web application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@Fb"
    }
  ]
});
formatter.step({
  "name": "Launch Facebook on browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginScreen.launch_Facebook_on_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to enter username \"karthik\"",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginScreen.i_want_to_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to enter Password \"123456karthik\"",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginScreen.i_want_to_enter_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginScreen.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
});