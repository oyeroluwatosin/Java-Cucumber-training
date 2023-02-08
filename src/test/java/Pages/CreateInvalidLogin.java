package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class CreateInvalidLogin {
    public int random;
    // Declare your locators
    @FindBy(how = How.LINK_TEXT, using ="Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using ="email")
    public static WebElement LoginEmail;

    @FindBy(how = How.ID_OR_NAME, using ="passwd")
    public static WebElement LoginPassword;

    @FindBy(how = How.XPATH, using ="//*[@id=\"SubmitLogin\"]")
    public static WebElement LoginButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/div[1]/ol/li")
    public static WebElement LoginExpectedErrorMessage;

    public void ClickHomepageSignIn(){
        SignInLink.click();
    }

    public void EnterLoginEmail(String Username) {
        LoginEmail.sendKeys(Username);
    }

    public void EnterLoginPassword(String Password) {
        LoginPassword.sendKeys(Password);
    }

    public void ClickLoginButton() {
        LoginButton.click();
    }

    public void DisplayExpectedErrorMessage(String error) {
        String ExpectedErrorMessage = error;
        String ActualErrorMessage  = LoginExpectedErrorMessage.getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
    }


}
