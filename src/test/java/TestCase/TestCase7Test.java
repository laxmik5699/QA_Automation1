package TestCase;

import Pages.HomePage;
import Pages.TestCasesPage7;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7Test {

        @Test
        public void verifyTestCasesPage(WebDriver driver) {

            HomePage homePage = new HomePage(driver);
            TestCasesPage7 testCasesPage = new TestCasesPage7(driver);

            // Step 3: Verify Home Page
            String homeTitle = driver.getTitle();

            Assert.assertEquals(
                    homeTitle,
                    "Automation Exercise",
                    "Home page is not displayed"
            );

            // Step 4: Click Test Cases button
            homePage.clickTestCases();

            // Step 5: Verify Test Cases page is displayed
            Assert.assertTrue(
                    testCasesPage.isTestCasesPageDisplayed(),
                    "Test Cases page is not displayed"
            );
        }
    }

