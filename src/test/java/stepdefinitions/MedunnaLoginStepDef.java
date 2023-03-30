package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaLoginStepDef {

MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();


    @Given("kullanici medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }
    @When("kullanici insan ikonuna tiklar")
    public void kullanici_insan_ikonuna_tiklar() {
       medunnaLoginPage.ikon.click();



    }
    @Then("kullanici sign in yazisina tiklar")
    public void kullanici_sign_in_yazisina_tiklar() {
        ReusableMethods.clickByJS(medunnaLoginPage.signInText);


    }
    @Then("kullanici username alanina username girer")
    public void kullanici_username_alanina_username_girer() {
        medunnaLoginPage.username.sendKeys(ConfigReader.getProperty("username"));



    }
    @Then("kullanici password alanina password girer")
    public void kullanici_password_alanina_password_girer() {
        medunnaLoginPage.password.sendKeys(ConfigReader.getProperty("password"));


    }
    @Then("kullanici Remember me kutusunu tiklar")
    public void kullanici_remember_me_kutusunu_tiklar() {
        ReusableMethods.clickByJS(medunnaLoginPage.rememberMe);


    }
    @Then("kullanici Sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        medunnaLoginPage.signInButon.click();


    }
    @Then("kullanici ikonun yaninda ismini gorur")
    public void kullanici_ikonun_yaninda_ismini_gorur() {
        Assert.assertTrue(medunnaLoginPage.isim.isDisplayed());


    }

}
