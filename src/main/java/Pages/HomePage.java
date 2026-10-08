package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By signupLogin = By.xpath("//a[contains(text(),'Signup / Login')]");
    By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");
    By deleteAccount = By.xpath("//a[contains(text(),'Delete Account')]");
    By testCasesButton = By.xpath("//a[contains(text(),'Test Cases')]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Click SignUp
    public void clickSignupLogin() {
        driver.findElement(signupLogin).click();
    }

     // Click LoggedIn
    public boolean isLoggedIn() {
        return driver.findElement(loggedInUser).isDisplayed();
    }

    // Click Delete Account
    public void deleteAccount() {
        driver.findElement(deleteAccount).click();
    }

    // Click Test Cases
    public void clickTestCases() {
        driver.findElement(testCasesButton).click();
    }
}

//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class HomePage {
//
//    WebDriver driver;
//
//    // Test Cases button
//    By testCasesButton = By.xpath("//a[contains(text(),'Test Cases')]");
//
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    // Click Test Cases
//    public void clickTestCases() {
//        driver.findElement(testCasesButton).click();
//    }
//}