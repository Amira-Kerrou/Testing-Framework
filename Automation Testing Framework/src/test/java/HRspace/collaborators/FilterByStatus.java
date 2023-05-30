package HRspace.collaborators;

import pages.authentification.Authentification;
import base.BaseSetup;
import pages.HR.collaborators.CollabLocators;
import tasks.collaborators.CollabTasks;
import utils.ScreenshotUtils;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;



@Epic("Stark HRM")
@Feature("Collaborators")


public class FilterByStatus extends CollabLocators {

    @BeforeClass(alwaysRun = true)
    public void crendentials(){
        Authentification  authLocators = PageFactory.initElements(BaseSetup.getDriver(), Authentification.class);
        authLocators.login();
    }

    @Test

    public void filter() {
        CollabTasks tasks = PageFactory.initElements(BaseSetup.getDriver(), CollabTasks.class);
        }



    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            ScreenshotUtils.takeScreenshot(BaseSetup.getDriver());
        }
    }
}
