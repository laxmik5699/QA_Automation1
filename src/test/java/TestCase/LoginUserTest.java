package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUserTest {

        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void loginWithCorrectEmailAndPassword() {

            // 1. Launch browser
            // Already launched in @BeforeMethod

            // 2. Navigate to URL
            driver.get("https://automationexercise.com");

            // 3. Verify home page is visible
            String homePageTitle = driver.getTitle();
            Assert.assertEquals(homePageTitle, "Automation Exercise");

            // 4. Click Signup / Login
            driver.findElement(By.linkText("Signup / Login")).click();

            // 5. Verify Login to your account is visible
            boolean loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']"))
                    .isDisplayed();
            Assert.assertTrue(loginText);

            // 6. Enter correct email and password
            driver.findElement(By.name("email")).sendKeys("aarcin@gmail.com");

            driver.findElement(By.name("password")).sendKeys("aarcin@1234");

            // 7. Click Login
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            // 8. Verify Logged in as username is visible
            boolean loggedIn = driver.findElement(By.xpath(
                    "//a[contains(text(),'Logged in as')]")).isDisplayed();

            Assert.assertTrue(loggedIn);

            // 9. Click Delete Account
            driver.findElement(By.linkText("Delete Account")).click();

            // 10. Verify ACCOUNT DELETED! is visible
            boolean accountDeleted = driver
                    .findElement(By.xpath("//b[text()='Account Deleted!']"))
                    .isDisplayed();

            Assert.assertTrue(accountDeleted);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }
