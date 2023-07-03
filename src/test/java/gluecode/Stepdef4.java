package gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef4
{
    Shared sh;
    public Stepdef4(Shared x)
    {
        this.sh=x;
    }
    @Given("uri of rest api in {string} environment")
    public void uri_of_rest_api_in_environment(String string)
    {

    }

    @Given("define HTTP request")
    public void define_http_request()
    {

    }

    @When("submit request for id {int} via DELETE method")
    public void submit_request_for_id_via_delete_method(Integer int1)
    {

    }

    @Then("status code is {int}")
    public void status_code_is(Integer int1)
    {

    }

    @When("submit request via DELETE to service by taking data from text file")
    public void submit_request_via_delete_to_service_by_taking_data_from_text_file()
    {

    }

    @Then("validate response as per in text file")
    public void validate_response_as_per_in_text_file()
    {

    }
}
