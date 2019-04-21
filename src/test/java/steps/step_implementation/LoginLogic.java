package steps.step_implementation;

import net.thucydides.core.annotations.Step;
import steps.page_objects.OpenBrowserPage;

public class LoginLogic {

    OpenBrowserPage openBrowserPage;


    @Step
    public void open_browser() {
        openBrowserPage.open();
    }

}
