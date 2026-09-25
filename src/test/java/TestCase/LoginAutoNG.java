package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAutoNG {
    //        // Global driver so all methods can use it
       WebDriver driver;

//        @BeforeClass
//        public void before(){
//            System.out.println("@BeforeCl");
//        }
//
        // Runs ONCE before any test method
        @BeforeMethod
        public void setupBrowser() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://automationexercise.com/");
        }

    // Actual Test Case
    @Test(priority = 1)
    public void validloginTest() {

        //Verify Test Case
        WebElement homePage = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        String actualResult = homePage.getText();
        Assert.assertEquals(actualResult, "Home");

        // Click Signup/Login
        WebElement signLogin = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        signLogin.click();

        // Verify Login page heading
        WebElement verifyLogin = driver.findElement(By.cssSelector("div.login-form h2"));
        String loginHeading = verifyLogin.getText();
        Assert.assertEquals(loginHeading, "Login to your account");

        // Enter Email
        WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        email.sendKeys("aarceen@gmail.com");

        // Enter Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("aarceen1234");

        // Click Login
        WebElement loginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        loginButton.click();

        // Verify Logged In User
        WebElement userName = driver.findElement(By.xpath("//b[normalize-space()='aarceen lx']"));
        String actualUser = userName.getText();
        Assert.assertEquals(actualUser, "aarceen lx");

        // Logout
        WebElement logout = driver.findElement(By.cssSelector("a[href='/logout']"));
        logout.click();

        // Verify Logout successful
        WebElement verifyLogout = driver.findElement(By.cssSelector("div.login-form h2"));
        String logoutHeading = verifyLogout.getText();
        Assert.assertEquals(logoutHeading, "Login to your account");
    }

    @Test(priority = 2)
    public void invalidloginTest() {
        // Verify Home page
        WebElement homePage = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        String actualResult = homePage.getText();
        Assert.assertEquals(actualResult, "Home");

        // Click Signup/Login
        WebElement signLogin = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        signLogin.click();

        // Verify Login page heading
        WebElement verifyLogin = driver.findElement(By.cssSelector("div.login-form h2"));
        String loginHeading = verifyLogin.getText();
        Assert.assertEquals(loginHeading, "Login to your account");

        // Enter Email
        WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        email.sendKeys("aar@gmail.com");

        // Enter Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("aar1234");

        // Click Login
        WebElement loginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        loginButton.click();

        // Invalid Error
        WebElement verifyLogout = driver.findElement(By.cssSelector("div.login-form h2"));
        String logoutHeading = verifyLogout.getText();
        Assert.assertEquals(logoutHeading, "Login to your account");
    }

    @Test(priority = 3)
    public void emptyloginTest() {
        //Verify Test Case
        WebElement homePage = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        String actualResult = homePage.getText();
        Assert.assertEquals(actualResult, "Home");

        // Click Signup/Login
        WebElement signLogin = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        signLogin.click();

        // Verify Login page heading
        WebElement verifyLogin = driver.findElement(By.cssSelector("div.login-form h2"));
        String loginHeading = verifyLogin.getText();
        Assert.assertEquals(loginHeading, "Login to your account");

        // Enter Email
        WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        email.sendKeys("");

        // Enter Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("");

        // Click Login
        WebElement loginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        loginButton.click();

        // Verify Logged In User
        WebElement userName = driver.findElement(By.xpath("//b[normalize-space()='aarceen lx']"));
        String actualUser = userName.getText();
        Assert.assertEquals(actualUser, "aarceen lx");

        // Logout
        WebElement logout = driver.findElement(By.cssSelector("a[href='/logout']"));
        logout.click();

        // Verify Logout successful
        WebElement verifyLogout = driver.findElement(By.cssSelector("div.login-form h2"));
        String logoutHeading = verifyLogout.getText();
        Assert.assertEquals(logoutHeading, "Login to your account");
    }

    @Test(priority = 4)
    public void validEmailWithInvalidPassword(){
        //Verify Test Case
        WebElement homePage = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        String actualResult = homePage.getText();
        Assert.assertEquals(actualResult, "Home");

        // Click Signup/Login
        WebElement signLogin = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        signLogin.click();

        // Verify Login page heading
        WebElement verifyLogin = driver.findElement(By.cssSelector("div.login-form h2"));
        String loginHeading = verifyLogin.getText();
        Assert.assertEquals(loginHeading, "Login to your account");

        // Enter Email
        WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        email.sendKeys("aarceen@gmail.com");

        // Enter Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("aar1234");

        // Click Login
        WebElement loginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        loginButton.click();

        // Verify Logged In User
        WebElement userName = driver.findElement(By.xpath("//b[normalize-space()='aarceen lx']"));
        String actualUser = userName.getText();
        Assert.assertEquals(actualUser, "aarceen lx");

        // Logout
        WebElement logout = driver.findElement(By.cssSelector("a[href='/logout']"));
        logout.click();

        // Verify Logout successful
        WebElement verifyLogout = driver.findElement(By.cssSelector("div.login-form h2"));
        String logoutHeading = verifyLogout.getText();
        Assert.assertEquals(logoutHeading, "Login to your account");
    }

    }

    // Runs AFTER every test method
//        @AfterMethod
//        public void closeBrowser() {
//
//            driver.quit();
//        }
//
//        @AfterClass
//        public void after(){
//            System.out.println("@AfterCl");
//
//
//    }


