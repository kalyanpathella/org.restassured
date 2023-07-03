package gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef2
{
    Shared sh;
    public Stepdef2(Shared x)
    {
        this.sh=x;
    }

    @Given("uri of rest api in {string} environment")
    public void uri_of_rest_api_in_environment(String env)
    {

    }

    @Given("define HTTP request")
    public void define_http_request()
    {

    }

    @When("submit request for id {string} via GET method")
    public void submit_request_for_id_via_get_method(String string)
    {

    }

    @Then("status code is {string} as per {string} in json response body")
    public void status_code_is_as_per_in_json_response_body(String string, String string2)
    {

    }

    @When("submit request via POST with")
    public void submit_request_via_post_with(String docString)
    {

    }

    @Then("status code is {string} as per {string} and content type is {string}")
    public void status_code_is_as_per_and_content_type_is(String string, String string2, String string3)
    {

    }

}
