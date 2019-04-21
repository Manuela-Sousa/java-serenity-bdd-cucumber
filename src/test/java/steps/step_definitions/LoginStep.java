package steps.step_definitions;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import steps.step_implementation.LoginLogic;

public class LoginStep {

    @Steps
    LoginLogic loginLogic;

    @Given("I open prozis website")
    public void openWebsite() {
        loginLogic.open_browser();
    }

}
