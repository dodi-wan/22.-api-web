package pages.web.log.logout;

import org.openqa.selenium.By;

import static helper.driver.Utilities.driver;

public class LogoutPages {
    By logoutButton = By.id("logout_sidebar_link");

    public void logoutButton(){
        driver.findElement(logoutButton).click();
    }
}
