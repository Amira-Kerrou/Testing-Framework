package pages.HR.formations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SessionsLoc {

    @FindBy(xpath = "//input[@formcontrolname='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@formcontrolname='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//ul/li/a[i[@class='nav-icon icon-people']]")
    public WebElement HRSpace;

    @FindBy(xpath = "//li[@class='nav-item nav-dropdown open' and @id='1']/a[@class='nav-link nav-dropdown-toggle']")
    public WebElement FormationsButton;


    @FindBy(xpath = "//a[@routerlinkactive='active' and @href='/main/rh/training/session']")
    public WebElement sessions;


    @FindBy(xpath = "//tr[@role='row' and @aria-rowindex='2']//i[@class='las la-pen cursor-pointer edit-pencil la-lg']")
    public WebElement editSession;

    @FindBy(xpath = "//input[@formcontrolname='Name']")
    public WebElement editName;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-success' and @type='submit']")
    public WebElement saveButton;


    @FindBy(xpath = "//tr[@role='row'][@aria-rowindex='2']/td[@class='k-command-cell']/i[@class='fa fa-trash-o trash-icon  la-lg cursor-pointer mx-2']")
    public WebElement deleteSession;

    @FindBy(xpath = "//button[contains(@class,'swal2-confirm') and contains(@style,'background-color: var(--green)')]")
    public WebElement yesDeleteSession;





}
