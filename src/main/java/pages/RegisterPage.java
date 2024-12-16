package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    By firstName_loc= By.xpath("//input[@name='firstName']");
    By lastName_loc= By.xpath("//input[@name='lastName']");
    By email_loc= By.xpath("//input[@id='userName']");
    By country_loc= By.xpath("//select[@name='country']");
    By userNameName_loc= By.xpath("//input[@id='email']");
    By password_loc= By.xpath("//input[@name='password']");
    By confirmPassword_loc= By.xpath("//input[@name='confirmPassword']");
    By submitBtn_loc= By.xpath("//input[@name='submit']");

    public void setFirstName(String firstName){
        driver.findElement(firstName_loc).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        driver.findElement(lastName_loc).sendKeys(lastName);
    }
    public void setEmail(String email){
        driver.findElement(email_loc).sendKeys(email);
    }
    public void setCountry(){
        WebElement countrySelect_ele= driver.findElement(country_loc);
        Select dropDownCountry = new Select(countrySelect_ele);
        dropDownCountry.selectByIndex(2);
    }
    public void setUserName(String userName){
        driver.findElement(userNameName_loc).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(password_loc).sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword){
        driver.findElement(confirmPassword_loc).sendKeys(confirmPassword);
    }

    public void clickSubmitBtn(){
        driver.findElement(submitBtn_loc).click();
    }
}
