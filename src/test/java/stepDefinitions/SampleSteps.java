package stepDefinitions;

import com.sun.codemodel.JCase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ResponseBody;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleSteps {
    private WebDriver driver;

    public SampleSteps() {
        this.driver = Hooks.driver;
    }


    @Given("^As a user I check base url$")
    public void asAUserIMakeGetRequestWithOwners() {
        RestAssured.baseURI = "http://localhost:9966/petclinic/";

    }

    @When("^As a user I test status code$")
    public void asAUserIAddANewOwner() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/api/owners/1");
        int status = response.getStatusCode();
        Assert.assertEquals(status, 200);
    }

    @And("^As a user I test header$")
    public void asAUserIAddNewLastNameForOwner() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/api/owners/1");
        String contentType = response.header("content-type");
        Assert.assertEquals(contentType, "application/json");
    }

    @And("^As a user I test body$")
    public void asAUserIAddNewOwnerId() {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/api/owners/1");

        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        Assert.assertTrue(bodyAsString.contains("George"));
    }


   @Then("^As a user I add new pet$")
    public void asAUserIDeleteNewOwner() {
        RequestSpecification request = RestAssured.given();
       JSONObject requestParams = new JSONObject();
        requestParams.put("id", "27");
       requestParams.put("name", "tiger");
       request.header("content-type", "application/json");
       request.body(requestParams.toJSONString());
        Response response = request.post("/api/pettypes");

       int statusCode = response.getStatusCode();
       Assert.assertEquals(statusCode, 201);
       String petName = response.jsonPath().get("name");
       Assert.assertEquals( petName, "tiger");
   }


    }


