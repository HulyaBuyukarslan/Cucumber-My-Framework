package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HubcomfyLoginPage {


    public HubcomfyLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Sign In")
    public WebElement signInButon;

    @FindBy(xpath = "//*[@name='username'][1]")
    public WebElement emailAddress;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement signInLogin;

    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signout;

}
