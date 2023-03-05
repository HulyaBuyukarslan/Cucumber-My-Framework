package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HubcomfyLoginPage;
import pages.VendorShippingAddressPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class VendorShippingAddressStepDefinitions {
    HubcomfyLoginPage hubcomfyLoginPage = new HubcomfyLoginPage();
    VendorShippingAddressPage vendorShippingAddressPage = new VendorShippingAddressPage();
    @Given("Hubcomfy sayfasina gidildi")
    public void hubcomfySayfasinaGidildi() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("signin butonuna tiklandi")
    public void signinButonunaTiklandi() {
        ReusableMethods.clickByJS(hubcomfyLoginPage.signInButon);
    }

    @Then("email girildi")
    public void emailGirildi() {
        hubcomfyLoginPage.emailAddress.sendKeys(ConfigReader.getProperty("vendor_email"));
    }

    @Then("password girildi")
    public void passwordGirildi() {
        hubcomfyLoginPage.password.sendKeys(ConfigReader.getProperty("vendor_password"));
    }

    @Then("login butonuna tiklandi")
    public void loginButonunaTiklandi() {
       ReusableMethods.clickByJS(hubcomfyLoginPage.signInLogin);
    }

    @Then("anasayfada oldugu dogrulandi")
    public void anasayfadaOlduguDogrulandi() {
        Assert.assertTrue(hubcomfyLoginPage.signout.isDisplayed());
    }

    @Then("my account yazisina tiklandi")
    public void myAccountYazisinaTiklandi() {
        ReusableMethods.scrollEndJS();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(vendorShippingAddressPage.myAccount);
    }

    @Then("address yazisina tiklandi")
    public void addressYazisinaTiklandi() {
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(vendorShippingAddressPage.address);
        ReusableMethods.waitFor(2);
    }

    @Then("edit buton yazisina tiklandi")
    public void editButonYazisinaTiklandi() {
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(vendorShippingAddressPage.editButton);
        ReusableMethods.waitFor(2);
    }

    @Then("var olan bilgiler silindi")
    public void varOlanBilgilerSilindi() {
        ReusableMethods.scrollDownActions();
        ReusableMethods.clearMethodShipping();
        ReusableMethods.waitFor(2);

    }

    @Then("first name alanina {string} girildi")
    public void firstNameAlaninaGirildi(String string) {
        vendorShippingAddressPage.firstName.sendKeys(string);
        ReusableMethods.waitFor(2);

    }

    @Then("last name alanina {string} girildi")
    public void lastNameAlaninaGirildi(String string) {
        vendorShippingAddressPage.lastName.sendKeys(string);
        ReusableMethods.waitFor(2);
    }

    @Then("company name alanina {string} girildi")
    public void companyNameAlaninaGirildi(String string) {
        vendorShippingAddressPage.companyName.sendKeys(string);
        ReusableMethods.waitFor(2);
    }

    @Then("country alani tiklandi")
    public void countryAlaniTiklandi() {
        vendorShippingAddressPage.countryRegion.click();
        ReusableMethods.waitFor(2);
    }

    @Then("dropdown alani tiklandi")
    public void dropdownAlaniniTiklandi() {
        vendorShippingAddressPage.dropdown.click();
        ReusableMethods.waitFor(2);
    }

    @Then("country alanina Turkey girildi")
    public void countryAlaninaTurkeyGirildi() {
        vendorShippingAddressPage.dropdown.sendKeys("Turkey" + Keys.ENTER,Keys.TAB);
        ReusableMethods.waitFor(3);
    }

    @Then("street alanina {string} girildi")
    public void streetAlaninaGirildi(String string) {
        vendorShippingAddressPage.streetAddress.sendKeys(string);
        ReusableMethods.waitFor(2);

    }


    @Then("streett alanina {string} girildi")
    public void streettAlaninaGirildi(String string) {
        vendorShippingAddressPage.streetAddress2.sendKeys(string);
        ReusableMethods.waitFor(2);
    }
    @Then("town city alanina {string} girildi")
    public void townCityAlaninaGirildi(String string) {
        vendorShippingAddressPage.townCity.sendKeys(string);
        ReusableMethods.waitFor(2);
    }


    @Then("province alani tiklandi")
    public void provinceAlaniniTiklandi() {
    vendorShippingAddressPage.province.click();
        ReusableMethods.waitFor(2);
    }

    @Then("province dropdownu tiklandi")
    public void provinceDropdownuTiklandi() {
    vendorShippingAddressPage.dropdown2.click();
        ReusableMethods.waitFor(2);
    }

    @Then("province alanina Adana girildi")
    public void provinceAlaninaAdanaGirildi() {
    vendorShippingAddressPage.dropdown2.sendKeys("Adana"+Keys.ENTER,Keys.TAB);
        ReusableMethods.waitFor(3);
    }

    @Then("zipcode alanina {string} girildi")
    public void zipcodeAlaninaGirildi(String string) {
    vendorShippingAddressPage.zipCode.sendKeys(string);
        ReusableMethods.waitFor(2);
    }

    @Then("save butonuna tiklandi")
    public void saveButonunaTiklandi() throws IOException {
    ReusableMethods.clickByJS(vendorShippingAddressPage.saveAddress);
        ReusableMethods.waitFor(2);
        ReusableMethods.takeScreenShotOfPage();
    }

    @And("driver kapatildi")
    public void driverKapatildi()  {
    Driver.closeDriver();


    }


}
