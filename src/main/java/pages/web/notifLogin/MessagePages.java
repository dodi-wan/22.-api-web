package pages.web.notifLogin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static helper.driver.Utilities.driver;
public class MessagePages {

    private WebElement element;

    By messageWrongUsername (String message){
        return By.xpath("//*[contains (text (), '" + message + "' )]");
    }


    public void wrongUsername(String message){
        driver.findElement(messageWrongUsername(message)).isDisplayed();
    }


    public String messageError(String message){
        element = driver.findElement(messageWrongUsername(message));
        return element.getText();
    }


}
