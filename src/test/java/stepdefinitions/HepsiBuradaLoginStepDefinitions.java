package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.HepsiBuradaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HepsiBuradaLoginStepDefinitions {

HepsiBuradaLoginPage hepsiBuradaLoginPage = new HepsiBuradaLoginPage();
    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
       Driver.getDriver().get(ConfigReader.getProperty("rentacar_url"));
        ReusableMethods.waitFor(3);

    }
    @When("kullanici Giris Yap yazisinin ustune gelir ve bekler")
    public void kullanici_giris_yap_yazisinin_ustune_gelir_ve_bekler() {
        ReusableMethods.hover(hepsiBuradaLoginPage.girisYapTitle);
        ReusableMethods.waitFor(3);

    }
    @Then("kullanici cikan dropdowndan giris yap' tiklar")
    public void kullanici_cikan_dropdowndan_giris_yap_tiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.girisYapButton);
        ReusableMethods.waitFor(3);


    }
    @Then("kullanici e-posta alanina e-posta girer")
    public void kullanici_e_posta_alanina_e_posta_girer() {
        hepsiBuradaLoginPage.e_posta.sendKeys(ConfigReader.getProperty("hepsiburada_eposta"),Keys.ENTER);
        ReusableMethods.waitFor(3);


    }
    @Then("kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.btnLogin);
        ReusableMethods.waitFor(3);
    }
    @Then("kullanici sifre alanina sifre girer")
    public void kullanici_sifre_alanina_sifre_girer() {
        hepsiBuradaLoginPage.sifre.sendKeys(ConfigReader.getProperty("hepsiburada_sifre")+ Keys.ENTER,Keys.TAB);
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollDownActions();

    }
    @Then("kullanici Giris yap butonuna tiklar")
    public void kullanici_Giris_yap_butonuna_tiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.btnLogin2);
        ReusableMethods.waitFor(3);

    }
    @Then("kullanici arama butonuna kitaplik yazar")
    public void kullanici_arama_butonuna_kitaplik_yazar() {
        hepsiBuradaLoginPage.aramaKutusu.sendKeys("kitaplık", Keys.ENTER);
        ReusableMethods.waitFor(3);

    }
    @Then("cikan ilk urun icin sepete ekle tiklar")
    public void cikan_ilk_urun_icin_sepete_ekle_tiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.sepeteEkle);
        ReusableMethods.waitFor(3);

    }
    @Then("cikan pop-up ta sepete git tiklar")
    public void cikan_pop_up_ta_sepete_git_tiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.sepeteGit);
        ReusableMethods.waitFor(3);

    }
    @Then("alis-veris tamamla tiklar")
    public void alis_veris_tamamla_tiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.alisverisTamamla);
        ReusableMethods.waitFor(3);

    }
    @Then("cikan sayfada diger odeme seceneklerine tiklar")
    public void cikan_sayfada_diger_odeme_seceneklerine_tiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.odemesec);
        ReusableMethods.waitFor(3);

    }
    @Then("coklu kredi kartina tiklar")
    public void coklu_kredi_kartina_tiklar() {
        ReusableMethods.clickByJS(hepsiBuradaLoginPage.cokluKrediKarti);
        ReusableMethods.waitFor(3);

    }


}
