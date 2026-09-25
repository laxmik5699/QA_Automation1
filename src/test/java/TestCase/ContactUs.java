package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactUs {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {

        // 1. Launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 2. Navigate to URL
        driver.get("https://automationexercise.com/");
    }

    @Test
    public void contactUsTest() {

        // 3. Verify Home page is visible
        String homeTitle = driver.getTitle();

        Assert.assertEquals(
                homeTitle, "Automation Exercise", "Home page is not displayed");

        // 4. Click Contact Us
        driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();

        // 5. Verify GET IN TOUCH is visible
        boolean getInTouch = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h2[normalize-space()='Get In Touch']"))
        ).isDisplayed();

        Assert.assertTrue(
                getInTouch, "GET IN TOUCH is not visible"
        );

        // 6. Enter name
        driver.findElement(By.name("name")).sendKeys("Aarceen Lx");

        // Enter email
        driver.findElement(By.name("email")).sendKeys("aarceen@gmail.com");

        // Enter subject
        driver.findElement(By.name("subject")).sendKeys("Testing Contact Us");

        // Enter message
        driver.findElement(By.id("message")).sendKeys("This is a test message.");

        // 7. Upload file
        driver.findElement(By.name("upload_file"))
                .sendKeys("C:\\Users\\laxmi\\OneDrive\\Desktop\\QA COURSE\\Timer-836189.pdf");

        // 8. Click Submit
        driver.findElement(By.name("submit")).click();

        // 9. Handle confirmation alert
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        // 10. Verify success message
        boolean successMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@class='status alert alert-success']"))
        ).isDisplayed();

        Assert.assertTrue(
                successMessage, "Success message is not visible"
        );

        // 11. Click Home
        driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();

        // Verify Home page
        Assert.assertEquals(
                driver.getTitle(), "Automation Exercise",
                "User did not return to Home page"
        );
    }

    @AfterMethod
    public void tearDown() {

        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}
