package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MedunnaCreateRoomPage;
import utilities.ReusableMethods;

public class MedunnaCreateRoomStepDefs {

    MedunnaCreateRoomPage medunnaCreateRoomPage = new MedunnaCreateRoomPage();

    @Given("kullanici Items Titles yazisina tiklar")
    public void kullaniciItemsTitlesYazisinaTiklar() {

       medunnaCreateRoomPage.items_titles.click();
       ReusableMethods.waitFor(3);
    }

    @When("kullanici cikan dropdowndan Room secer")
    public void kullanici_cikan_dropdowndan_room_secer() {
        ReusableMethods.clickByJS(medunnaCreateRoomPage.room);

    }

    @Then("kullanici Create a new Room yazisina tiklar")
    public void kullanici_create_a_new_room_yazisina_tiklar() {
        ReusableMethods.clickByJS(medunnaCreateRoomPage.create_room);

    }

    @Then("kullanici Room Number alanina room number girer")
    public void kullanici_room_number_alanina_room_number_girer() {
        medunnaCreateRoomPage.room_number.sendKeys("12398756");

    }

    @Then("kullanici Room Type dropdowndan room type secer")
    public void kullanici_room_type_dropdowndan_room_type_secer() {
        medunnaCreateRoomPage.room_type.sendKeys("SUITE");

    }

    @Then("kullanici status kutusuna tiklar")
    public void kullanici_status_kutusuna_tiklar() {
        ReusableMethods.clickByJS(medunnaCreateRoomPage.status);

    }

    @Then("kullanici Price alanina price girer")
    public void kullanici_price_alanina_price_girer() {
        medunnaCreateRoomPage.room_price.sendKeys("333");

    }

    @Then("kullanici Description alanina description girer")
    public void kullanici_description_alanina_description_girer() {
        medunnaCreateRoomPage.description.sendKeys("Kendine Ait Bir Oda");

    }

    @Then("kullanici Save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        ReusableMethods.clickByJS(medunnaCreateRoomPage.save_button);

    }

}
