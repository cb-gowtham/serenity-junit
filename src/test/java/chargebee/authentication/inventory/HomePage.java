package chargebee.authentication.inventory;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    public String getHeading() {
        return $(".cv-block__desc").getText();
    }

}
