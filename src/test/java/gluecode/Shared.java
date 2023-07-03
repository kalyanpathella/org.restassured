package gluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Shared
{
    //common objects which are used for all step definition classes
    public RequestSpecification request;
    public Response response;
    public Scenario s;
    @Before
    public void method1(Scenario scobj)
    {
        s=scobj;
        SimpleDateFormat sf = new SimpleDateFormat("hh/mm/ss dd/MMM/yyyy");
        Date d = new Date();
        s.log("Hi, "+s.getName()+"is login to run");

    }
    @After
    public void method2(Scenario scobj)
    {
       s=scobj;
       s.log(s.getName()+" is"+s.getStatus().name());
    }

}
