package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HubcomfyLoginPage;
import pages.VendorBillingAddressPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HubcomfyLoginStepDefinitions {
    HubcomfyLoginPage hubcomfyLoginPage = new HubcomfyLoginPage();
    VendorBillingAddressPage vendorBillingAddressPage = new VendorBillingAddressPage();

    @Given("Kullanici Hubcomfy sayfasina gider")
    public void kullanici_hubcomfy_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @Then("Kullanici signin butonuna tiklar")
    public void kullanici_signin_butonuna_tiklar() {
        ReusableMethods.clickByJS(hubcomfyLoginPage.signInButon);

    }
    @Then("Kullanici email girer")
    public void kullanici_email_girer() {
        hubcomfyLoginPage.emailAddress.sendKeys(ConfigReader.getProperty("vendor_email"));

    }
    @Then("Kullanici password girer")
    public void kullanici_password_girer() {
        hubcomfyLoginPage.password.sendKeys(ConfigReader.getProperty("vendor_password"));

    }
    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        ReusableMethods.clickByJS(hubcomfyLoginPage.signInLogin);


    }
    @Then("Kullanici anasayfada oldugunu dogrular")
    public void kullanici_anasayfada_oldugunu_dogrular() {
        Assert.assertTrue(hubcomfyLoginPage.signout.isDisplayed());


    }

    @Then("Kullanici my account yazisina tiklar")
    public void kullanici_my_account_yazisina_tiklar() {
        ReusableMethods.scrollEndJS();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(vendorBillingAddressPage.myAccount);


    }
    @Then("Kullanici address yazisina tiklar")
    public void kullanici_address_yazisina_tiklar() {
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(vendorBillingAddressPage.address);

    }
    @Then("Kullanici edit buton yazisina tiklar")
    public void kullanici_edit_buton_yazisina_tiklar() {
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(vendorBillingAddressPage.editbuton);

    }



}


