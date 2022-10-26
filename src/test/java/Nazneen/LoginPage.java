package Nazneen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "username")
    public
    WebElement txtUsername;
    @FindBy(id = "password")
    public
    WebElement txtPassword;
    @FindBy(id = "login")
    public
    WebElement btnLogin;
    @FindBy(className = "pt-2")
    public
    WebElement txtTitle;

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean DoLogin(String email, String password)
    {
        txtUsername.sendKeys(email);
        txtPassword.sendKeys(password);
        btnLogin.click();
        return txtTitle.isDisplayed();
    }
}
