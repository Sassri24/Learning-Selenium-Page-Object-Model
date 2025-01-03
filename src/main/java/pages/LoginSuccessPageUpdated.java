package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPageUpdated {

    WebDriver driver;

    public LoginSuccessPageUpdated(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[normalize-space()='Login Successfully']")
    public WebElement loginSuccessful_ele;


    public String checkLoginSuccess(){
        String successMessage= loginSuccessful_ele.getText();
        return successMessage;
    }
}
