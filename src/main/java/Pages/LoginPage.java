package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By newUserSignup = By.xpath("//h2[contains(text(),'New User Signup!')]");
    By name = By.name("name");
    By email = By.xpath("//input[@data-qa='signup-email']");
    By signupButton = By.xpath("//button[@data-qa='signup-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isNewUserSignupVisible() {
        return driver.findElement(newUserSignup).isDisplayed();
    }

    public void enterSignupDetails(String username, String emailAddress) {
        driver.findElement(name).sendKeys(username);
        driver.findElement(email).sendKeys(emailAddress);
    }

    public void clickSignup() {
        driver.findElement(signupButton).click();
    }
}
