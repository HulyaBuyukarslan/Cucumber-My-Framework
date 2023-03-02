package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalHomePage;
import pages.BlueRentalLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentalCarStepDefinitions {

    BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();
    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();


    @Given("kullanici Blue Rental Car sayfasina gider")
    public void kullanici_blue_rental_car_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("rentacar_url"));
    }
    @When("kullanici login yazisina tiklar")
    public void kullanici_login_yazisina_tiklar() {
       blueRentalHomePage.loginLink.click();

    }
    @Then("kullanici login sayfasinda oldugunu dogrular")
    public void kullanici_login_sayfasinda_oldugunu_dogrular() {
        Assert.assertTrue(blueRentalLoginPage.loginYazisi.isDisplayed());

    }
    @Then("kullanici email address alanina {string} girer")
    public void kullanici_email_address_alanina_girer(String string) {
        blueRentalLoginPage.emailBox.sendKeys(string);

    }
    @Then("kullanici password alanina {string} girer")
    public void kullanici_password_alanina_girer(String string) {
        blueRentalLoginPage.passwordBox.sendKeys(string);

    }
    @Then("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        blueRentalLoginPage.loginButton.click();

    }
    @Then("kullanici sag ust kosede ismini gordugunu dogrular")
    public void kullanici_sag_ust_kosede_ismini_gordugunu_dogrular() {
        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());


    }
    @Then("kullanici ismine tiklar")
    public void kullanici_ismine_tiklar() {
        blueRentalHomePage.userID.click();


    }
    @Then("kullanici dropdowndan logout secenegine tiklar")
    public void kullanici_dropdowndan_logout_secenegine_tiklar() {
        blueRentalHomePage.logOutLink.click();

    }
    @Then("kullanici ok butonuna tiklar")
    public void kullanici_ok_butonuna_tiklar() {
        blueRentalHomePage.OK.click();

}
    @Then("kullanici ana sayfada oldugunu dogrular")
    public void kullaniciAnaSayfadaOldugunuDogrular() {
        Assert.assertTrue(blueRentalHomePage.loginLink.isDisplayed());
    }

    @Then("kullanici driver kapatir")
    public void kullanici_driver_kapatir() {
        Driver.closeDriver();

    }


}
