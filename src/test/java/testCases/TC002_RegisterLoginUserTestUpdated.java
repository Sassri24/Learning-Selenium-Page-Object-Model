package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC002_RegisterLoginUserTestUpdated {

    WebDriver driver;

    @BeforeMethod
    public void openGoogle(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC002(){
        HomePageUpdated homePage= new HomePageUpdated(driver);
        homePage.selectRegisterMenu();

        RegisterPageUpdated registerPage= new RegisterPageUpdated(driver);
        registerPage.setFirstName("chamod");
        registerPage.setLastName("ganegoda");
        registerPage.setEmail("123@gmail.com");
        registerPage.setCountry();
        registerPage.setUserName("chamod");
        registerPage.setPassword("12345678");
        registerPage.setConfirmPassword("12345678");

        registerPage.clickSubmitBtn();

        RegisterSuccessPageUpdated registerSuccessPage= new RegisterSuccessPageUpdated(driver);
        String actualText=registerSuccessPage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Dear"),"Registration attempt failed");

        LoginPageUpdated loginPage= new LoginPageUpdated(driver);
        loginPage.clickSignIn();
        loginPage.setUserName("chamod");
        loginPage.setPassword("12345678");
        loginPage.clickSubmitBtn();

        LoginSuccessPageUpdated loginSuccessPage= new LoginSuccessPageUpdated(driver);
        String successMessage= loginSuccessPage.checkLoginSuccess();
        Assert.assertTrue(successMessage.contains("Login Successfully"),"Login attempt failed");

    }

    @AfterMethod
    public void closeGoogle(){
        driver.quit();
    }
}
