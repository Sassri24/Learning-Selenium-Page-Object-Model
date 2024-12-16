package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By signIn_Loc= By.linkText("sign-in");
    By userName_Loc=By.xpath("//input[@name='userName']");
    By password_Loc=By.xpath("//input[@name='password']");
    By submitBtn_Loc=By.xpath("//input[@name='submit']");


    public void clickSignIn(){
        driver.findElement(signIn_Loc).click();
    }
    public void setUserName(String userName){
        driver.findElement(userName_Loc).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(password_Loc).sendKeys(password);
    }
    public void clickSubmitBtn(){
        driver.findElement(submitBtn_Loc).click();
    }
}
