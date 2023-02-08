package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

// Page Object Model is when a fucntional action is written elsewhere abd later called where needed
public class CreateNewUserPage {
    public int random;
    // Declare your locators
    @FindBy(how = How.LINK_TEXT, using ="Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID_OR_NAME, using ="email_create")
    public static WebElement CreateNewUserEmailField;

    @FindBy(how = How.ID_OR_NAME, using ="SubmitCreate")
    public static WebElement CreateSubmitButton;

    @FindBy(how = How.ID_OR_NAME, using ="id_gender")
    public static WebElement FemaleGenderButton;

    @FindBy(how = How.ID_OR_NAME, using ="customer_firstname")
    public static WebElement CustomerFirstname;

    @FindBy(how = How.ID_OR_NAME, using ="customer_lastname")
    public static WebElement CustomerLastname;

    @FindBy(how = How.ID_OR_NAME, using ="passwd")
    public static WebElement Password;

     @FindBy(how = How.ID_OR_NAME, using ="days")
    public static WebElement DobDays;

    @FindBy(how = How.ID_OR_NAME, using ="months")
    public static WebElement DobMonths;

    @FindBy(how = How.ID_OR_NAME, using ="years")
    public static WebElement DobYears;

    @FindBy(how = How.ID_OR_NAME, using ="address1")
    public static WebElement Address;

    @FindBy(how = How.ID_OR_NAME, using ="city")
    public static WebElement City;

    @FindBy(how = How.XPATH, using ="//*[@id=\"id_state\"]")
    public static WebElement SelectedState;

    @FindBy(how = How.ID_OR_NAME, using ="postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID_OR_NAME, using ="phone_mobile")
    public static WebElement PhoneNumber;

    @FindBy(how = How.ID_OR_NAME, using ="alias")
    public static WebElement AddressAlias;

    @FindBy(how = How.XPATH, using ="//span[text() = 'Register']")
    public static WebElement RegisterButton;

    @FindBy(how = How.XPATH, using ="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedUser;

    // Declare your methods
    public void ClickHomepageSignIn(){
        SignInLink.click();
    }

    public void EnterEmailToCreateNewUser(){
        random = 100 + (int)(Math.random()* (1000-1) +1);
        CreateNewUserEmailField.sendKeys("lanre_july2022" + random + "@gmail.com");
    }

    public void ClickCreateAccButton() throws InterruptedException {
        CreateSubmitButton.click();
        Thread.sleep(6000);
    }

    public void SelectGender(){
        FemaleGenderButton.click();
    }

    public void EnterUserFirstName(){
        CustomerFirstname.sendKeys("Lola");
    }

    public void EnterUserLastName(){
        CustomerLastname.sendKeys("Gold");
    }

    public void EnterPassword(){
        Password.sendKeys("testing");
    }

    public void SelectDobDay(){
        Select day = new Select(DobDays);
        day.selectByIndex(10);
    }

    public void SelectDobMonth(){
        Select Month = new Select(DobMonths);
        Month.selectByValue("9");
    }

    public void SelectDobYears(){
        Select Year = new Select(DobYears);
        Year.selectByValue("1990");
    }

    public void EnterAddress(){
        Address.sendKeys("No 1 testing street");
    }

    public void EnterCity(){
        City.sendKeys("Chicago");
    }

    public void SelectState(){
        Select State = new Select(SelectedState);
        State.selectByValue("16");
    }

    public void AreaPostcode(){
        Postcode.sendKeys("00000");
    }

    public void CustomerPhoneNumber(){
        PhoneNumber.sendKeys("040123456789");
    }

    public void HouseNickName(){
        AddressAlias.sendKeys("QA House");
    }

    public void RegistrationButton(){
        RegisterButton.click();
    }

    public void ConfirmationRequest(){
        String ExpectedErrorMessage = "Lola Gold";
        String ActualErrorMessage  = LoggedUser.getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
    }
}