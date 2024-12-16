package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPageUpdated {

    WebDriver driver;

    public RegisterSuccessPageUpdated(WebDriver driver){
        this.driver=driver;
    }
    By checkSuccess_Loc= By.xpath("//b[contains(text(),'Dear')]");

    public String registerSuccessText(){
        String successText=driver.findElement(checkSuccess_Loc).getText();
        return successText;
    }
}
