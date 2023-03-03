package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(id = "reg_username")
    public WebElement username;

    @FindBy(id = "reg_email")
    public WebElement emailAddress;

    @FindBy(id = "reg_password")
    public WebElement password;

    @FindBy(id = "register-policy")
    public WebElement policy;

    @FindBy(xpath = "//*[@name='register']")
    public WebElement signUp;


@FindBy (xpath = "(//*[@class='submit-status'])[2]")
    public WebElement error_message;

}
