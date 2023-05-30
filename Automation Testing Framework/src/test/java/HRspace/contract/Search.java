package HRspace.contract;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.HR.contract.Contract;
import base.BaseSetup;
import pages.authentification.Authentification;
import tasks.contract.ContractTasks;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import utils.ScreenshotUtils;

import java.io.IOException;

@Epic("Stark HRM")
@Feature("Contract")
public class Search extends Contract {

    @BeforeClass(alwaysRun = true)
    public void crendentials(){
        Authentification authLocators = PageFactory.initElements(BaseSetup.getDriver(), Authentification.class);
        authLocators.login();
    }


    @Test
    @Story("Update a contract")
    @Description("Test to update a  contract")
    public void search() {
        ContractTasks tasks = PageFactory.initElements(BaseSetup.getDriver(), ContractTasks.class);
        tasks.search();
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            ScreenshotUtils.takeScreenshot(BaseSetup.getDriver());
        }
    }

    }

