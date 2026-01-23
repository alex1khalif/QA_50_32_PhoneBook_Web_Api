package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ContactPage extends BasePage{

    public ContactPage(WebDriver driver)
    {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//a[text()='ADD']")
    WebElement btnAdd;
    @FindBy(xpath = "//a[text()='CONTACTS']")
    WebElement btnContacts;
    @FindBy(xpath = "//button[text()='Sign Out']")
    WebElement btnSignOut;
    @FindBy(xpath = "//h1[text()=' No Contacts here!']")
    WebElement contactPageMessage;


    public boolean isTextInContactPageMessagePresent(String text){
        return isTextInElementPresent(contactPageMessage, text);
    }

    public void clickBtnContacts()
    {
        btnContacts.click();
    }

    public void clickBtnAdd()
    {
        btnAdd.click();
    }

    public void clickBtnSignOut()
    {
        btnSignOut.click();
    }

    public boolean isAddInDisplayed()
    {
        return isElementDisplayed(btnAdd);
    }

    public boolean isContactsInDisplayed()
    {
        return isElementDisplayed(btnContacts);
    }

    public boolean isTextInBtnSignOutPresent(String text){
        return isTextInElementPresent(btnSignOut, text);
    }

    public boolean isTextInBtnAddPresent(String text){
        return isTextInElementPresent(btnAdd, text);
    }


}
