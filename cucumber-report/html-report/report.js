$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PetClinic.feature");
formatter.feature({
  "line": 1,
  "name": "testing web service",
  "description": "",
  "id": "testing-web-service",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14461518300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I test API",
  "description": "",
  "id": "testing-web-service;as-a-user-i-test-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "As a user I check base url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "As a user I test status code",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "As a user I test header",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "As a user I test body",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "As a user I add new pet",
  "keyword": "And "
});
formatter.match({
  "location": "SampleSteps.asAUserIMakeGetRequestWithOwners()"
});
formatter.result({
  "duration": 929674300,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.asAUserIAddANewOwner()"
});
formatter.result({
  "duration": 1760454100,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.asAUserIAddNewLastNameForOwner()"
});
formatter.result({
  "duration": 31388200,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.asAUserIAddNewOwnerId()"
});
formatter.result({
  "duration": 72049300,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.asAUserIDeleteNewOwner()"
});
formatter.result({
  "duration": 1156698600,
  "status": "passed"
});
formatter.after({
  "duration": 946722500,
  "status": "passed"
});
});