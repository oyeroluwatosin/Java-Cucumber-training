package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class CreateAssertLogo {
    public int random;
    // Declare your locators

    @FindBy(how = How.ID_OR_NAME, using ="header_logo")
    public static WebElement HeaderLogo;

    @FindBy(how = How.CLASS_NAME, using ="shopping_cart")
    public static WebElement ShoppingCart;

    public void ConfirmHeaderLogo(){
        HeaderLogo.isDisplayed();
    }

    public void ConfirmShoppingList() {
        ShoppingCart.isDisplayed();
    }

}
