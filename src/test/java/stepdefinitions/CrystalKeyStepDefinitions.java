package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CrystalKeyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CrystalKeyStepDefinitions {
    CrystalKeyPage crystalKeyPage = new CrystalKeyPage();

    @Given("kullanici crystalkey sayfasina gider")
    public void kullnici_crystalkey_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("crystalkey_url"));

    }

    @Given("login butonuna tiklar")
    public void login_butonuna_tiklar() {
        crystalKeyPage.ilkLogIn.click();
    }

    @Then("kulanici adini girer")
    public void kulanici_adini_girer() {
        crystalKeyPage.userNameTextBox.sendKeys(ConfigReader.getProperty("valid_user"));
    }

    @Then("kullanici sifresini girer")
    public void kullanici_sifresini_girer() {
        crystalKeyPage.passwordTextBox.sendKeys(ConfigReader.getProperty("valid_password"));
    }

    @Then("ikinci login butonuna tiklar")
    public void ikinci_login_butonuna_tiklar(){
        crystalKeyPage.ikinciLoginButonu.click();
    }



}
