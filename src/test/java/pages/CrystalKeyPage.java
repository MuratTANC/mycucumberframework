package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CrystalKeyPage {
    public CrystalKeyPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Log in")
    public WebElement ilkLogIn;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
    public WebElement ikinciLoginButonu;
}
