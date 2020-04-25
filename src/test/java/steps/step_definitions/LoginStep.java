package steps.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.step_implementation.LoginLogic;

public class LoginStep {

    @Steps
    LoginLogic loginLogic;

    @Given("I open opensourcecms website")
    public void openWebsite() {
        loginLogic.open_browser();
    }

    @When("^Makes login with valid (.*) and (.*)$")
    public void makesLoginWithValidUserAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Sees user logged in menu$")
    public void seesUserLoggedInMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
