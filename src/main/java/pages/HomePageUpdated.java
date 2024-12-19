package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageUpdated {

    WebDriver driver;

    public HomePageUpdated(WebDriver driver){
        this.driver=driver;                              //this is for other (Ex: driver.findElement)
        PageFactory.initElements(driver,this);     //this is for @FindBy
    }

    //first way
    @FindBy(how=How.LINK_TEXT,using = "REGISTER")
    public WebElement registerBtn_firstWay;

    //second way
    @FindBy(linkText = "REGISTER")
    public WebElement getRegisterBtn_secondWay;

    public void selectRegisterMenu(){
        getRegisterBtn_secondWay.click();          //we can use any way for this.I recommend second way because it easy.
    }
}
