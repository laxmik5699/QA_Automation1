package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountPage {

    WebDriver driver;

    By accountInformation = By.xpath("//b[contains(text(),'Enter Account Information')]");

    By titleMrs = By.id("id_gender1");
    By password = By.id("password");

    By day = By.id("days");
    By month = By.id("months");
    By year = By.id("years");

    By newsletter = By.id("newsletter");
    By offers = By.id("optin");

    By firstName = By.id("first_name");
    By lastName = By.id("last_name");
    By company = By.id("company");
    By address = By.id("address1");
    By address2 = By.id("address2");

//    driver.findElement(zipcode).sendKeys("800001");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobileNumber = By.id("mobile_number");

    By createAccount = By.xpath("//button[@data-qa='create-account']");
    By accountCreated = By.xpath("//b[contains(text(),'Account Created!')]");
    By continueButton = By.xpath("//a[@data-qa='continue-button']");
    By accountDeleted = By.xpath("//b[contains(text(),'Account Deleted!')]");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isAccountInformationVisible() {
        return driver.
                findElement(accountInformation).isDisplayed();
    }
    public void fillAccountDetails() {

        driver.findElement(titleMrs).click();

        driver.findElement(password).sendKeys("aarcin@1234");

        new Select(driver.findElement(day)).selectByValue("10");
        new Select(driver.findElement(month)).selectByValue("10");
        new Select(driver.findElement(year)).selectByValue("2000");

        driver.findElement(newsletter).click();
        driver.findElement(offers).click();

        driver.findElement(firstName).sendKeys("Aarcin");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(company).sendKeys("Test Company");
        driver.findElement(address).sendKeys("Test Address1");
        driver.findElement(address2).sendKeys("Test Address2");

        new Select(driver.findElement(country)).selectByVisibleText("India");

        driver.findElement(state).sendKeys("Bihar");
        driver.findElement(city).sendKeys("Patna");
        driver.findElement(zipcode).sendKeys("800001");
        driver.findElement(mobileNumber).sendKeys("9876543210");
    }

    public void clickCreateAccount() {
        driver.findElement(createAccount).click();
    }
    public boolean isAccountCreated() {
        return driver.findElement(accountCreated).isDisplayed();
    }
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
    public boolean isAccountDeleted() {
        return driver.findElement(accountDeleted).isDisplayed();
    }
}
