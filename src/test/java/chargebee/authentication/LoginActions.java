package chargebee.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginActions extends UIInteractionSteps {

    @Step("Navigate to the Login page")
    public void navigateToTheLoginPage() {
        openUrl("https://app.devcb.in/login");
    }

    @Step("")
    public void asUser() {
        //openUrl("https://app.devcb.in/login");
        find(By.id("email")).sendKeys("gowtham42@mailinator.com");
        find(By.id("password")).sendKeys("Test123$");
        find(By.id("sign-in-submit")).click();
        $("//*[text()='TEST Site']").click();
    }




}
