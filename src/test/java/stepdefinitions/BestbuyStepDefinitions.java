package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class BestbuyStepDefinitions {



    @When("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));

        //(ConfigReader.getProperty(string)) ile hangi srin url gönderirsem onun karşısındaki
        //key value'i getir.
        //driver.get("https://www.bestbuy.com") demek yukarıdaki kod eski dilde
    }

    @Then("{string} de oldugunu test eder")
    public void de_oldugunu_test_eder(String istenenUrl) {  //amazon_url
        // current_url : driver.getCurrentUrl
        Assert.assertEquals(ConfigReader.getProperty(istenenUrl), Driver.getDriver().getCurrentUrl());
    }

}
