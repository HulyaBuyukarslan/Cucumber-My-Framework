package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.VendorShippingAddressPage;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class ExcelShippingStepDefinitions {
    VendorShippingAddressPage vendorShippingAddressPage;
    ExcelUtils excelUtils;
    List<Map<String,String >> excelData;
    @Then("{string} ile giris yapildi")
    public void ileGirisYapildi(String string) {

        String path = "./src/test/resources/testdata/hubcomfy.xlsx";
        String sayfa = "vendor_info";
        excelUtils = new ExcelUtils(path,sayfa);
        excelData= excelUtils.getDataList();

        for (Map<String ,String> data:excelData){

            vendorShippingAddressPage = new VendorShippingAddressPage();
            ReusableMethods.scrollDownActions();
            ReusableMethods.clearMethodShipping();
            ReusableMethods.waitFor(2);

            vendorShippingAddressPage.firstName.sendKeys(data.get("firstname"));
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.lastName.sendKeys(data.get("lastname"));
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.companyName.sendKeys(data.get("companyname"));
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.countryRegion.click();
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.dropdown.click();
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.dropdown.sendKeys("Turkey" + Keys.ENTER,Keys.TAB);
            ReusableMethods.waitFor(3);
            vendorShippingAddressPage.streetAddress.sendKeys(data.get("street1"));
            ReusableMethods.waitFor(3);
            vendorShippingAddressPage.streetAddress2.sendKeys(data.get("street2"));
            ReusableMethods.waitFor(3);
            vendorShippingAddressPage.zipCode.sendKeys(data.get("zipcode"));
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.townCity.sendKeys(data.get("towncity"));
            ReusableMethods.waitFor(3);
            vendorShippingAddressPage.province.click();
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.dropdown2.click();
            ReusableMethods.waitFor(2);
            vendorShippingAddressPage.dropdown2.sendKeys("Adana"+Keys.ENTER,Keys.TAB);
            ReusableMethods.waitFor(2);
            ReusableMethods.clickByJS(vendorShippingAddressPage.saveAddress);
            ReusableMethods.waitFor(2);
            ReusableMethods.scrollDownActions();
            ReusableMethods.clickByJS(vendorShippingAddressPage.editButton);

        }

    }
}
