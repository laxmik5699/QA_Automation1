package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage7 {

        WebDriver driver;

        // Test Cases page heading
        By testCasesHeading = By.xpath("//b[contains(text(),'Test Cases')]");

        public TestCasesPage7(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isTestCasesPageDisplayed() {
            return driver.findElement(testCasesHeading).isDisplayed();
        }
    }


