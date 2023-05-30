package pages.HR.contract;

import base.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contract extends BaseSetup {


    public Contract (){}
    @FindBy(xpath = "//ul/li/a[i[@class='nav-icon icon-people']]")
    public WebElement HRSpace;
    public void navigateToHRSpacePage(){
        HRSpace.click();
    }

    @FindBy(xpath = "//li[@class='nav-item']/a[@href='/main/payroll/contract']")
    public WebElement contractnav;
    public void navigateToContractPage() {
        contractnav.click();
    }

    @FindBy(xpath = "//button[@class='btn btn-sm' and @type='button']//span[@style='color: white']")
    public WebElement addButton ;

    @FindBy(xpath = "//kendo-combobox[@name='idEmployeeColName']//input[@id='k-c2298244-fc4e-4ed6-8067-b28ba2edb42f']")
    public WebElement employee;
    @FindBy(xpath = "//input[@id='k-ee271b93-d816-4d16-af19-fb9ff8c0aa6d']")
    public WebElement type;

    @FindBy(xpath = "//tr[@role='row' and @aria-rowindex='2']//i[@class='las la-pen cursor-pointer edit-pencil la-lg']")
    public WebElement updateButton;

    @FindBy(xpath = "//input[@id='k-72ee07d3-8d6c-4770-84df-535343ca2e5a']")
    public WebElement updateType;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-save mx-1'][@type='submit']")
    public WebElement saveButton;


    @FindBy(xpath = "//input[@placeholder='Search employee']")
    public WebElement searchContact;

    @FindBy(xpath = "//img[@id='dropdownMenuButton']")
    public WebElement exelButton;

    @FindBy(xpath = "//a[@class='dropdown-item dpItem']")
    public WebElement downloadExelFile;

}

