package gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef5 {
    Shared sh;

    public Stepdef5(Shared x)
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

    @When("submit request for id {int} via PUT method")
    public void submit_request_for_id_via_put_method(Integer int1, io.cucumber.datatable.DataTable dataTable)
    {

    }

    @When("submit request via PUT to service by taking data from excel file")
    public void submit_request_via_put_to_service_by_taking_data_from_excel_file()
    {

    }

    @Then("validate response as data in excel file")
    public void validate_response_as_data_in_excel_file()
    {

    }
}
