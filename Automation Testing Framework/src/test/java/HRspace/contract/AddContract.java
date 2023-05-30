package HRspace.contract;

import pages.HR.contract.Contract;
import base.BaseSetup;
import pages.authentification.Authentification;
import tasks.contract.ContractTasks;
import utils.ScreenshotUtils;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

@Epic("Stark HRM")
    @Feature("Contract")
    public class AddContract extends Contract {


        @BeforeClass(alwaysRun = true)
        public void crendentials(){
            Authentification authLocators = PageFactory.initElements(BaseSetup.getDriver(), Authentification.class);
            authLocators.login();
        }

        @Test
        public void ContractPage() {
            Contract contractLocators = PageFactory.initElements(BaseSetup.getDriver(), Contract.class);
            contractLocators.navigateToHRSpacePage();
            contractLocators.navigateToContractPage();
        }
        public void add(){
            ContractTasks tasks = PageFactory.initElements(BaseSetup.getDriver(), ContractTasks.class);
            tasks.addNewContract();
        }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            ScreenshotUtils.takeScreenshot(BaseSetup.getDriver());
        }
    }
}
