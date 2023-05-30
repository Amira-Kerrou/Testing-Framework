package pages.HR.collaborators;


import base.BaseSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CollabLocators extends BaseSetup {
    public CollabLocators() {
    }

    @FindBy(xpath = "//a[contains(., 'HR space') and .//i[contains(@class, 'nav-icon') and contains(@class, 'icon-people')]]")
    public WebElement HRSpace;

    @FindBy(xpath = "//li/a[contains(@href,'payroll/employee')]")
    public WebElement collaborator;

    @FindBy(xpath = "//button[i[contains(@class,'AddIcon')]]")
    public WebElement addButton;
    @FindBy(xpath = "//input[@formcontrolname='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@formcontrolname='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@formcontrolname='Email']")
    public WebElement professionalEmail;

    @FindBy(xpath = "//kendo-combobox[@formcontrolname='Sex']/span/kendo-searchbar/input")
    public WebElement gender;

    @FindBy(xpath = "//kendo-combobox[@name='idCountryColName']/span/kendo-searchbar/input")
    public WebElement nationality;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-save mx-1' and @type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-save mr-1']/i[@class='fa fa-floppy-o mr-1']")
    public WebElement yesButton;

    @FindBy(xpath = "//input[@placeholder='Search employee']")
    public WebElement search;
    @FindBy(xpath = "//div[@class='col pl-0 name-style']//a[text()='Amira KERROU']//ancestor::div[@class='card-body p-2']//i[@class='fa fa-trash-o trash-icon cursor-pointer la-lg']")
    public WebElement deleteButton;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled' and text()='Yes']")
    public WebElement yesDeleteButton;

    @FindBy(xpath = "//kendo-searchbar[@class='k-searchbar']/input[@id='k-7c1abd16-2b89-4031-af0a-e4fc72fc8adc']")
    public WebElement status;

    // Locator Map/Line mode
    @FindBy(xpath = "//div[@class='col-auto p-1']/i[@class='fa fa-list fa-2x']")
    public WebElement mode;

    @FindBy(xpath = "//img[@id='dropdownMenuButton']")
    public WebElement exportExel;

    @FindBy(xpath = "//div[@id='action_grid_toggle' and contains(@class,'show')]")
    public WebElement downloadFile;


    public void navigateToHRSpacePage() {
        HRSpace.click();
    }

    public void navigateToCollaboratorPage() {
        collaborator.click();

    }

}
















