package pages.authentification;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import pages.HR.collaborators.CollabLocators;
import base.BaseSetup;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class Authentification extends BaseSetup {

    public Authentification() {
    }

    @FindBy(xpath = "//input[@formcontrolname='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@formcontrolname='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn' and normalize-space()='Login']")
    public WebElement loginButton;

    public void login() {
        email.sendKeys("akerrou@spark-it.fr");
        password.sendKeys("Azerty123**");
        loginButton.click();
    }






















}





   /* @FindBy(xpath = "//input[@formcontrolname='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@formcontrolname='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn' and normalize-space()='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[contains(@class, 'border border-secondary rounded-circle')]")
    public WebElement userButton;

    @FindBy(xpath = "//button[contains(@class, 'dropdown-item') and text()='Logout']")
    public WebElement logOut;

    public void login() {
        email.sendKeys("akerrou@spark-it.fr");
        password.sendKeys("Azerty123**");
        loginButton.click();
    }*/

