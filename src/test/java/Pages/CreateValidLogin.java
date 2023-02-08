package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateValidLogin {
    public int random;

    @FindBy(how = How.LINK_TEXT, using ="Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using ="email")
    public static WebElement ValidLoginEmail;

    @FindBy(how = How.ID_OR_NAME, using ="passwd")
    public static WebElement ValidLoginPassword;

    @FindBy(how = How.XPATH, using ="//*[@id=\"SubmitLogin\"]")
    public static WebElement ValidLoginButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"center_column\"]/div[1]/ol/li")
    public static WebElement ValidLoginSuccessMessage;

    public void ClickHomepageSignIn(){
        SignInLink.click();
    }

    public void EnterValidLoginEmail() {
        ValidLoginEmail.sendKeys();
    }

    public void EnterValidLoginPassword() {
        ValidLoginPassword.sendKeys();
    }

    public void ClickValidLoginButton() {
        ValidLoginButton.click();
    }

    public void DisplayLoginSuccessMessage() {
        String ExpectedLoggedInUser = "Dorice Mbonde";
        String ActualLoggedInUser  = ValidLoginSuccessMessage.getText();
        Assert.assertEquals(ExpectedLoggedInUser, ActualLoggedInUser);
        System.out.println(ActualLoggedInUser);

    }


}
