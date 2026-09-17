package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By signupLogin = By.xpath("//a[contains(text(),'Signup / Login')]");
    By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");
    By deleteAccount = By.xpath("//a[contains(text(),'Delete Account')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignupLogin() {
        driver.findElement(signupLogin).click();
    }

    public boolean isLoggedIn() {
        return driver.findElement(loggedInUser).isDisplayed();
    }

    public void deleteAccount() {
        driver.findElement(deleteAccount).click();
    }
}
