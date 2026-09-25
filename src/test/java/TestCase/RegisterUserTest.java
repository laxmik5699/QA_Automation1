package TestCase;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterUserTest {
        WebDriver driver;

        HomePage homePage;
        LoginPage loginPage;
        AccountPage accountPage;

        @BeforeMethod
        public void setup() {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://automationexercise.com/");

            homePage = new HomePage(driver);
            loginPage = new LoginPage(driver);
            accountPage = new AccountPage(driver);
        }

        @Test
        public void registerUser() {

            // Step 1-3: Home Page
            Assert.assertTrue(driver.getTitle().contains("Automation Exercise"));

            // Step 4: Click Signup / Login
            homePage.clickSignupLogin();

            // Step 5: Verify New User Signup
            Assert.assertTrue(loginPage.isNewUserSignupVisible());

            // Step 6: Enter Name and Email
            String username = "aarcinlx";
            String email = "test" + System.currentTimeMillis() + "aarcin@gmail.com";

            loginPage.enterSignupDetails(username, email);

            // Step 7: Click Signup
            loginPage.clickSignup();

            // Step 8: Verify Account Information
            Assert.assertTrue(accountPage.isAccountInformationVisible());

            // Step 9-12: Fill account information
            accountPage.fillAccountDetails();

            // Step 13: Create Account
            accountPage.clickCreateAccount();

            // Step 14: Verify Account Created
            Assert.assertTrue(accountPage.isAccountCreated());

            // Step 15: Continue
            accountPage.clickContinue();

            // Step 16: Verify Logged In
            Assert.assertTrue(homePage.isLoggedIn());

            // Step 17: Delete Account
            homePage.deleteAccount();

            // Step 18: Verify Account Deleted
            Assert.assertTrue(accountPage.isAccountDeleted());

            accountPage.clickContinue();
        }

        @AfterMethod
        public void tearDown() {

            if (driver != null) {
                driver.quit();
            }
        }
}