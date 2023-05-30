package HRspace.contract;

import pages.HR.contract.Contract;
import base.BaseSetup;
import tasks.contract.ContractTasks;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

@Epic("Stark HRM")
@Feature("Contract")
public class DeleteContract extends Contract {


    /*@AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            ScreenshotUtils.takeScreenshot(BaseSetup.getDriver());
        }
    }*/

}

