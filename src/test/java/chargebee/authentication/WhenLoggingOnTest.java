package chargebee.authentication;


import chargebee.authentication.inventory.HomePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenLoggingOnTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    LoginActions login;

    HomePage home;

    @Test
    public void usersCanLogOnWithValidCredentials() {
        //driver.get("https://app.devcb.in/login");

        login.navigateToTheLoginPage();

        login.asUser();

        Serenity.reportThat("User should be presented with the dashboard",
                () -> assertThat(home.getHeading()).isEqualTo("qa-prism-xyz-1644238619514-test.devcb.in")
        );
    }

    //@Test
    public void usersCanLogOnWithInValidCredentials() {
        //driver.get("https://app.devcb.in/login");

        login.navigateToTheLoginPage();

        login.asUser();

        Serenity.reportThat("User should be presented with the dashboard",
                () -> assertThat(home.getHeading()).isEqualTo("qa-prism-xyz-1644238619514-test.devcb.in")
        );
    }
}
