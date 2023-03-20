package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SwaggerPage {
    /*
   "https://petstore.swagger.io/" dökümanını kullanarak 'user' oluşturacak bir otomasyon testi yazınız
    Not: Test Case'i gherkin language ile yazınız.
*/
    public SwaggerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "(//*[text()='POST'])[7]")
    public WebElement postButton;



    @FindBy (className = "//*[@class='btn try-out__btn']")
    public WebElement tryItOut;

}
