package pages.HR.formations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestsLoc {

    /*@FindBy(xpath = "")
    public WebElement ;*/

    @FindBy(xpath = "//input[@formcontrolname='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@formcontrolname='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//ul/li/a[i[@class='nav-icon icon-people']]")
    public WebElement HRSpace;

    @FindBy(xpath = "//li[@class='nav-item nav-dropdown open' and @id='1']/a[@class='nav-link nav-dropdown-toggle']")
    public WebElement formationsButton;



    @FindBy(xpath = "//a[@routerlinkactive='active' and @href='/main/rh/training/request']")
    public WebElement requests ;


    @FindBy(xpath = "//tr[@data-kendo-grid-item-index='2']//td[@class='k-command-cell']/i[@class='las la-pen edit-pencil cursor-pointer la-lg']")
    public WebElement editRequest;



    @FindBy(xpath = " //button[normalize-space()='Save']")
    public WebElement saveEditionRequest;

    @FindBy(xpath = "//tr[@data-kendo-grid-item-index='2']//td[@class='k-command-cell']/i[@class='fa fa-trash-o trash-icon  la-lg cursor-pointer mx-2']")
    public WebElement deleteRequest;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled' and @type='button' and text()='Yes']")
    public WebElement yesDeleteRequest;



}
