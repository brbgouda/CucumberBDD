$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login3.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM Login",
  "description": "",
  "id": "free-crm-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@fclogin3"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Test",
  "description": "",
  "id": "free-crm-login;login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "free-crm-login;login-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "free-crm-login;login-test;;1"
    },
    {
      "cells": [
        "brbgouda",
        "fc@123"
      ],
      "line": 12,
      "id": "free-crm-login;login-test;;2"
    },
    {
      "cells": [
        "brbgouda",
        "fc@123"
      ],
      "line": 13,
      "id": "free-crm-login;login-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 24018386222,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Test",
  "description": "",
  "id": "free-crm-login;login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@fclogin3"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"brbgouda\" and \"fc@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_on_login_page()"
});
formatter.result({
  "duration": 1733231414,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "brbgouda",
      "offset": 13
    },
    {
      "val": "fc@123",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 3145138201,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 14699102610,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 42280637,
  "status": "passed"
});
formatter.after({
  "duration": 717586092,
  "status": "passed"
});
formatter.before({
  "duration": 11724757007,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Test",
  "description": "",
  "id": "free-crm-login;login-test;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@fclogin3"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"brbgouda\" and \"fc@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_on_login_page()"
});
formatter.result({
  "duration": 36092105,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "brbgouda",
      "offset": 13
    },
    {
      "val": "fc@123",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 275221488,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 14777191389,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 44760545,
  "status": "passed"
});
formatter.after({
  "duration": 724924648,
  "status": "passed"
});
});