package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.VendorBillingAddressPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class VendorBillingAddressStepDefinitions {
    VendorBillingAddressPage vendorBillingAddressPage = new VendorBillingAddressPage();
    @Given("Kullanici var olan onceki bilgileri siler")
    public void kullanici_var_olan_onceki_bilgileri_siler() {
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(3);
        ReusableMethods.clearMethodBilling();
        ReusableMethods.waitFor(3);


    }

    @Then("Kullanici first name alanina {string} girer")
    public void kullanici_first_name_alanina_girer(String string) {
        vendorBillingAddressPage.firstname.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici last name alanina {string} girer")
    public void kullanici_last_name_alanina_girer(String string) {
        vendorBillingAddressPage.lastname.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici company name alanina {string} girer")
    public void kullanici_company_name_alanina_girer(String string) {
        vendorBillingAddressPage.companyname.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici country alanini tiklar")
    public void kullanici_country_alanini_tiklar() {
        vendorBillingAddressPage.countryRegion.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici dropdown alanini tiklar")
    public void kullanici_dropdown_alanini_tiklar() {
        vendorBillingAddressPage.dropdown.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici country alanina Turkey girer")
    public void kullaniciCountryAlaninaTurkeyGirer() {
        vendorBillingAddressPage.dropdown.sendKeys("Turkey" + Keys.ENTER,Keys.TAB);
        ReusableMethods.waitFor(3);
    }



    @Then("Kullanici street1 alanina {string} girer")
    public void kullanici_street1_alanina_girer(String string) {
        vendorBillingAddressPage.street1.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici street2 alanina {string} girer")
    public void kullanici_street2_alanina_girer(String string) {
        vendorBillingAddressPage.street2.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici zipcode alanina {string} girer")
    public void kullanici_zipcode_alanina_girer(String string) {
        vendorBillingAddressPage.zipcode.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici town city alanina {string} girer")
    public void kullanici_town_city_alanina_girer(String string) {
        vendorBillingAddressPage.towncity.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici province alanini tiklar")
    public void kullanici_province_alanini_tiklar() {
      vendorBillingAddressPage.province.click();
      ReusableMethods.waitFor(5);
    }

    @Then("Kullanici province dropdownu tiklar")
    public void kullanici_province_dropdownu_tiklar() {
        vendorBillingAddressPage.dropdown2.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici province alanina Adana girer")
    public void kullaniciProvinceAlaninaAdanaGirer() {
        vendorBillingAddressPage.dropdown2.sendKeys("Adana",Keys.ENTER);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici phone alanina {string} girer")
    public void kullanici_phone_alanina_girer(String string) {
        vendorBillingAddressPage.phone.sendKeys(string);
        ReusableMethods.waitFor(3);
    }

    @Then("Kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() throws IOException {
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(vendorBillingAddressPage.savebuton);
        ReusableMethods.waitFor(3);
        ReusableMethods.takeScreenShotOfPage();
    }
    @Then("Kullanici driveri kapatir")
    public void kullaniciDriveriKapatir() throws IOException {
        Driver.closeDriver();

    }
}
