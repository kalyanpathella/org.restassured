package gluecode;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.testng.Assert;
import pojos.MyPojo;
import utilities.PropertiesFileUtility;

public class Stepdef1
{
    Shared sh;
    public Stepdef1(Shared x)
    {
        this.sh=x;
    }
    @Given("uri of rest api in {string} environment")
    public void uri_of_rest_api_in_environment(String env)throws Exception
    {
        String u;
        if(env.equalsIgnoreCase("QA"))
        {
            u= PropertiesFileUtility.getValueInPropertiesFile("devuri");

        }
        else  if(env.equalsIgnoreCase("DEV"))
        {
            u=PropertiesFileUtility.getValueInPropertiesFile("devuri");
        }
        else
        {
            u=PropertiesFileUtility.getValueInPropertiesFile("stguri");
        }
    }
    @Given("define HTTP request")
    public void define_http_request()
    {
        sh.request= RestAssured.given();
    }
    @Given("submit request via HTTP GET method")
    public void submit_request_via_http_get_method()
    {
        sh.response=sh.request.when().get();
    }
    @Then("status code is {int} and Content-Type is {string}")
    public void status_code_is_and_content_type_is(Integer esc, String ect)
    {
           try
           {
                sh.response.then().statusCode(esc).contentType(ect);
                sh.s.log("Test Passed"); // cucumber reports
               Assert.assertTrue(true); // TestNg reports
           }
           catch(Exception ex)
           {
               sh.s.log("Test Failed"); // cucumber report
               Assert.assertTrue(false);
           }
    }
    @When("submit request for id {string} via GET method")
    public void submit_request_for_id_via_get_method(String id)
    {
       sh.response=sh.request.get(id); // x as parameter
    }
    @Then("status code is {string} and id is {string} in json response body")
    public void status_code_is_and_id_is_in_json_response_body(String esc, String eid)throws Exception
    {
        int x= Integer.parseInt(esc);
        int y = Integer.parseInt(eid);
        ObjectMapper om = new ObjectMapper();
        MyPojo mp = om.readValue(sh.response.getBody().asString(), MyPojo.class);
        if(sh.response.getStatusCode()==x && mp.getId()==y)
        {
            sh.s.log("Test Passed");
            Assert.assertTrue(true);
        }
        else
        {
            sh.s.log("Test Failed");
            Assert.assertTrue(false);
        }

    }
}
