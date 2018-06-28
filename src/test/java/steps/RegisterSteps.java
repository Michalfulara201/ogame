package steps;

import assertions.RegisterAssertions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps extends MainSteps {




    @When("^User set login as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void userSetLoginAsAndPasswordAs (String arg0, String arg1)     {
        indexPage.setYourEmail(arg0)
                .setYourPassword(arg1)
                .selectRegisterButton();
    }

    @Given("^System display start page$")
    public void systemDisplayStartPage()  {
        indexPage.openOgamePage();
    }

    @Then("^User is registered$")
    public void userIsRegistered()   {
        userIsRegistered();
    }

    @Then("^User is not registered$")
    public void userIsNotRegistered()  {
        userIsNotRegistered();

    }
}