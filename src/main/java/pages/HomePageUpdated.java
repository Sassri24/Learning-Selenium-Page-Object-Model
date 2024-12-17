package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageUpdated {

    WebDriver driver;

    public HomePageUpdated(WebDriver driver){
        this.driver=driver;
    }
//comment
    //coment
    //coment
    By registerBtn_Loc =By.linkText("REGISTER");

    public void selectRegisterMenu(){
        driver.findElement(registerBtn_Loc).click();
    }
}
