package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginSuccessPage {

    WebDriver driver;

    public LoginSuccessPage(WebDriver driver){
        this.driver=driver;
    }

    By loginSuccessful_Loc= By.xpath("//h3[normalize-space()='Login Successfully']");

    public String checkLoginSuccess(){
        String successMessage= driver.findElement(loginSuccessful_Loc).getText();
        return successMessage;
    }
}
