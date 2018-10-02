package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class stepdefs {
 //testing

    @Given("^test one$")
    public void test_one() throws Throwable {
        System.out.println("line 1");
        System.out.println("first one");

    }

    @Given("^test two$")
    public void test_two() throws Throwable {
        System.out.println("line 2");
    }

}
