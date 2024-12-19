package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdated {

    WebDriver driver;

    public RegisterPageUpdated(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName_ele;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName_ele;
    @FindBy(xpath = "//input[@id='userName']")
    public WebElement email_ele;
    @FindBy(xpath = "//select[@name='country']")
    public WebElement country_ele;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement userName_ele;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_ele;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword_ele;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitBtn_ele;


    public void setFirstName(String firstName){
        firstName_ele.sendKeys(firstName);
    }
    public void setLastName(String lastName){
        lastName_ele.sendKeys(lastName);
    }
    public void setEmail(String email){
        email_ele.sendKeys(email);
    }
    public void setCountry(){
        Select dropDownCountry = new Select(country_ele);
        dropDownCountry.selectByIndex(2);
    }
    public void setUserName(String userName){
        userName_ele.sendKeys(userName);
    }
    public void setPassword(String password){
        password_ele.sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword){
        confirmPassword_ele.sendKeys(confirmPassword);
    }

    public void clickSubmitBtn(){
        submitBtn_ele.click();
    }
}
