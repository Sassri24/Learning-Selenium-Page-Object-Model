package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import java.time.Duration;

public class TC001_RegisterUserTest {

    WebDriver driver;

    @BeforeMethod
    public void openGoogle(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.guru99.com/test/newtours/index.php");

    }

    @Test
    public void TC001(){
        HomePage homePage=new HomePage(driver);
        homePage.selectRegisterMenu();

        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.setFirstName("chamod");
        registerPage.setLastName("ganegoda");
        registerPage.setEmail("123@gmail.com");
        registerPage.setCountry();
        registerPage.setUserName("chamod");
        registerPage.setPassword("12345678");
        registerPage.setConfirmPassword("12345678");

        registerPage.clickSubmitBtn();

        RegisterSuccessPage registerSuccessPage=new RegisterSuccessPage(driver);
        String actualText=registerSuccessPage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Dear"),"Registration attempt failed");
    }

    @AfterMethod
    public void closeGoogle(){
        driver.quit();
    }
}