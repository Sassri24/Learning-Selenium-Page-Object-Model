package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUpdated {

    WebDriver driver;

    public LoginPageUpdated(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "sign-in")
    public WebElement signIn_ele;

    @FindBy(xpath = "//input[@name='userName']")
    public WebElement userName_ele;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_ele;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitBtn_ele;


    public void clickSignIn(){
        signIn_ele.click();
    }
    public void setUserName(String userName){
        userName_ele.sendKeys(userName);
    }
    public void setPassword(String password){
        password_ele.sendKeys(password);
    }
    public void clickSubmitBtn(){
        submitBtn_ele.click();
    }
}
