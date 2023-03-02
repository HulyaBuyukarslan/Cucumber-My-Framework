package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorShippingAddressPage {

    public VendorShippingAddressPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Sign Out")
    public WebElement signOutButon;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccount;

    @FindBy(xpath = "(//*[text()='Addresses'])[2]")
    public WebElement address;

    @FindBy(xpath = ("(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]"))
    public WebElement editButton;

    @FindBy(xpath = "//*[@name='shipping_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='shipping_last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='shipping_company']")
    public WebElement companyName;

    @FindBy(id = "select2-shipping_country-container")
    public WebElement countryRegion;

    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement dropdown;
    @FindBy(xpath = "//*[@name='shipping_address_1']")
    public WebElement streetAddress;

    @FindBy(xpath = "//*[@name='shipping_address_2']")
    public WebElement streetAddress2;

    @FindBy(id = "shipping_city")
    public WebElement townCity;

    @FindBy(id = "shipping_postcode")
    public WebElement zipCode;

    @FindBy(id = "select2-shipping_state-container")
    public WebElement province;

    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement dropdown2;

    @FindBy(id = "shipping_state")
    public WebElement state;

    @FindBy(xpath = "//*[@name='save_address']")
    public WebElement saveAddress;

    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signout;

    @FindBy(partialLinkText = "Log out")
    public WebElement logout;

}


