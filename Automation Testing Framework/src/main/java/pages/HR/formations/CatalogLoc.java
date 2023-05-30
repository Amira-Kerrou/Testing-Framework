package pages.HR.formations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*@FindBy(xpath = "")
    public WebElement ;*/
public class CatalogLoc {
    @FindBy(xpath = "//input[@formcontrolname='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@formcontrolname='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//ul/li/a[i[@class='nav-icon icon-people']]")
    public WebElement HRSpace;

    @FindBy(xpath = "//a[normalize-space()='Formations']")
    public WebElement formationsButton;

    @FindBy(xpath = "//a[@routerlinkactive='active' and @href='/main/rh/training/catalog']")
    public WebElement catalog;

    @FindBy(xpath = " //button[@class='btn btn-sm' and @type='button']")
    public WebElement addCatalog;

    @FindBy(xpath = "//input[@formcontrolname='Name']")
    public WebElement title;

    @FindBy(xpath = "//textarea[@formcontrolname='Description']")

    public WebElement description;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-save mx-1' and @type='submit']")
    public WebElement saveCatalog;


    @FindBy(xpath = " //div[@class='col-lg-2 col-md-4 col-sm-12 align-items-stretch'][1]//i[contains(@class,'edit-button')]")
    public WebElement editButton;

    @FindBy(xpath = " //div[@class='col-lg-2 col-md-4 col-sm-12 align-items-stretch'][1]//i[contains(@class,'fa-trash-o')]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled' and text()='Yes']")
    public WebElement yesButton;

    @FindBy(xpath = "//input[@class='form-control-search ng-pristine ng-valid ng-touched' and @placeholder='Search training']")
    public WebElement searchCatalog;


    @FindBy(xpath = "//div[@class='col-lg-2 col-md-4 col-sm-12 align-items-stretch' and @style='min-height: 225px; min-width: 325px;'][1]//a[b[text()='Planify session']]")
    public WebElement planify;

    @FindBy(xpath = " //input[@class='form-control ng-pristine ng-invalid has-error ng-touched' and @formcontrolname='Name' and @type='text']")
    public WebElement nameOfSession;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-success' and @type='submit']")
    public WebElement saveSession;


    @FindBy(xpath = " //div[@class='col-lg-2 col-md-4 col-sm-12 align-items-stretch' and @style='min-height: 225px; min-width: 325px;'][1]//a[b[text()='Request']]")
    public WebElement request;


    @FindBy(xpath = "//button[contains(@class, 'btn-save') and contains(@class, 'btn-sm') and contains(@class, 'mx-1')]")
    public WebElement saveRequest;









}
