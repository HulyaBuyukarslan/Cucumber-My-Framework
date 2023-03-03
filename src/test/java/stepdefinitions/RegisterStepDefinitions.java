package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RegisterStepDefinitions {
    RegisterPage registerPage = new RegisterPage();
    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(string);
    }
    @Then("user click register button")
    public void user_click_register_button(io.cucumber.datatable.DataTable dataTable) throws IOException {
        ReusableMethods.clickByJS(registerPage.register);
        ReusableMethods.waitFor(1);
     List<Map<String ,String>> registerInfo =  dataTable.asMaps(String.class,String.class);
     for (Map<String ,String > register : registerInfo){
         registerPage.username.sendKeys(register.get("username"));
         ReusableMethods.waitFor(1);
         registerPage.emailAddress.sendKeys(register.get("email"));
         ReusableMethods.waitFor(1);
         registerPage.password.sendKeys(register.get("password"));
         ReusableMethods.waitFor(1);
         ReusableMethods.clickByJS(registerPage.policy);
         ReusableMethods.waitFor(1);
         ReusableMethods.clickByJS(registerPage.signUp);
         ReusableMethods.waitFor(1);
         ReusableMethods.scrollDownActions();
         ReusableMethods.waitFor(1);
         ReusableMethods.takeScreenShotOfPage();
         ReusableMethods.clearMethodRegister();
     }

    }

    @Then("user verify error message")
    public void userVerifyErrorMessage() {
        Assert.assertTrue(registerPage.error_message.isDisplayed());
    }
    @Then("user close driver")
    public void userCloseDriver() {
        Driver.closeDriver();
    }


}

