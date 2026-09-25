import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public static void main(String[] args) {
//
//    //Lunch a new chrome browser and stores it the WebDriver variable.
//    WebDriver driver = new ChromeDriver();
//    //WebDriver driver = new FireFoxDriver();
//    //WebDriver driver = new WdgeDriver();
//
//
//    //Maximize the browser window.
//    driver.manage().window().maximize();
//
//    //Delete all cookies f4rom the browser before startinf the test.
//    driver.manage().deleteAllCookies();
//    driver.get("https://www.automationexercise.com/");
//
//
////        driver.navigate().to("https://www.automationexercise.com/");
////        driver.navigate().back();
////        driver.navigate().forward();
////        driver.navigate().refresh();
//
//
//    WebElement homePage = driver.findElement(By.xpath("//h2[normalize-space()='Category']"));
//    String actualResults = homePage.getText();
//    Assert.assertEquals(actualResults, "CATEGORY");
//
//
//    WebElement SignLogin = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
//    SignLogin.click();
//
//
//    WebElement verify1 = driver.findElement(By.cssSelector("div[class='login-form'] h2"));
//    String actualResults1 = verify1.getText();
//    Assert.assertEquals(actualResults1, "Login to your account");
//
//
//    WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
//    email.sendKeys("aarceen@gmail.com");
//
//    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//    password.sendKeys("aarceen1234");
//
//    WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//    loginBtn.click();
//
//    WebElement verify2 = driver.findElement(By.xpath("//b[normalize-space()='aarceen Lx']"));
//    String actualResult2 = verify2.getText();
//    Assert.assertEquals(actualResult2, " aarceen Lx");
//
//    WebElement logout = driver.findElement(By.cssSelector("a[href='/logout']"));
//    logout.click();
//
//    try {
//
//        WebElement verify3 = driver.findElement(By.cssSelector("div.login-form h2"));
//        String actualResults3 = verify3.getText();
//        Assert.assertEquals(actualResults3, "Login to your account");
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    }
//
//    driver.quit();

}

