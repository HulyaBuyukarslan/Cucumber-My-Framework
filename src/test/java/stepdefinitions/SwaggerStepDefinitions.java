package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwaggerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SwaggerStepDefinitions {
    SwaggerPage swaggerPage = new SwaggerPage();
    @Given("kullanici ilgili adrese gider")
    public void kullanici_ilgili_adrese_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("swagger_url"));
    }
    @When("post yazisina tiklar")
    public void post_yazisina_tiklar() {
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.clickByJS(swaggerPage.postButton);
    }
    @Then("try it out  yazisina tiklar")
    public void try_it_out_yazisina_tiklar() {
        ReusableMethods.clickByJS(swaggerPage.tryItOut);
    }


}
