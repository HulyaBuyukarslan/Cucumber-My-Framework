package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorBillingAddressPage {
    public VendorBillingAddressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccount;

    @FindBy(xpath = "(//*[text()='Addresses'])[2]")
    public WebElement address;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement editbuton;

    @FindBy(id = "billing_first_name")
    public WebElement firstname;

    @FindBy(id = "billing_last_name")
    public WebElement lastname;

    @FindBy(xpath = "//*[@name='billing_company']")
    public WebElement companyname;

    @FindBy(xpath = "//*[@class='select2-selection__rendered']")
    public WebElement countryRegion;

    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement dropdown;

    @FindBy(id = "billing_address_1")
    public WebElement street1;

    @FindBy(id = "billing_address_2")
    public WebElement street2;

    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement zipcode;

    @FindBy(id = "billing_city")
    public WebElement towncity;

    @FindBy(id = "select2-billing_state-container")
    public WebElement province;

    @FindBy(className = "select2-search__field")
    public WebElement dropdown2;

    @FindBy(id = "billing_phone")
    public WebElement phone;

    @FindBy(name = "save_address")
    public WebElement savebuton;

    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signout;

    @FindBy(partialLinkText = "Log out")
    public WebElement logout;

}
