package pages.web.order;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.driver.Utilities.driver;

public class CheckoutPages {


    private WebDriverWait wait;
    private WebElement element;

    By checkoutButton = By.id("checkout");

    By firstnameInput = By.xpath("//input[@placeholder='First Name']");
    By lastnameInput = By.xpath("//input[@placeholder='Last Name']");
    By zipCodeInput = By.xpath("//input[@placeholder='Zip/Postal Code']");

    By continueButton = By.id("continue");
    By finishButton = By.id("finish");

    By orderSuccess = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

    By orderMessage (String message) {
        return By.xpath("//*[contains (text (), '" + message + "' )]");
    }



    public CheckoutPages(){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void checkoutButton(){
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
            element.click();
        } catch (TimeoutException e) {
            System.out.println("Timeout: element not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error element" + e.getMessage());
        }
    }



    public void firstNameInput(String firstname){
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(firstnameInput));
            element.sendKeys(firstname);
        } catch (TimeoutException t){
            System.out.println("Timeout not found element " + t.getMessage());
        } catch (Exception e){
            System.out.println("error others");
        }
    }



    public void lastNameInput(String lastname){
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(lastnameInput));
            element.sendKeys(lastname);
        } catch (TimeoutException e){
            System.out.println("\nTimeout element not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unexpected error " + e.getMessage());
        }
    }



    public void zipCodeInput(String zipCode){
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(zipCodeInput));
            element.sendKeys(zipCode);
        } catch (TimeoutException e){
            System.out.println("\nTimeout element not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unexpected error " + e.getMessage());
        }
    }


    public void continueButton(){
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
            element.click();
        } catch (TimeoutException e){
            System.out.println("\nTimeout element not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unexpected error " + e.getMessage());
        }
    }


    public void finishButton(){
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(finishButton));
            element.click();
        } catch (TimeoutException e){
            System.out.println("\nTimeout element not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unexpected error " + e.getMessage());
        }
    }



    public void orderSuccess(){
        driver.findElement(orderSuccess).isDisplayed();
    }


    public String messageOrder(String message){
        String text;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(orderMessage(message)));
        text = element.getText();

        return text;
    }
}

