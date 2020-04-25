package steps.page_objects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login")
public class OpenBrowserPage extends PageObject {

    @Managed
    WebDriver driver;

    @WhenPageOpens
    public void maximiseScreen() {
        getDriver().manage().window().maximize();
    }

}
