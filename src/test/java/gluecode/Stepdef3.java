package gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdef3
{
    Shared sh;
    public Stepdef3(Shared x)
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

    @Then("validate that restful service with content type as {string}")
    public void validate_that_restful_service_with_content_type_as(String string, io.cucumber.datatable.DataTable dataTable)
    {

    }

}
