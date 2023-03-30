package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaLoginPage {

 public MedunnaLoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy (xpath = "//*[@data-icon='user']")
    public WebElement ikon;

    @FindBy (xpath = "//*[@id='login-item']")
    public WebElement signInText;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@id='rememberMe']")
    public WebElement rememberMe;

    @FindBy (xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signInButon;

    @FindBy (xpath = "//*[text()='Wirginia Woolf']")
    public WebElement isim;






















}
