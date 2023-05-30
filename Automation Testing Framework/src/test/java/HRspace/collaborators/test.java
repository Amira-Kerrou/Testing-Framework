package HRspace.collaborators;

import base.BaseSetup;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HR.collaborators.CollabLocators;
import pages.authentification.Authentification;
import tasks.collaborators.CollabTasks;
import utils.ScreenshotUtils;


@Epic("Stark HRM")
@Feature("Collaborators")
public class test extends CollabLocators {

    @BeforeClass(alwaysRun = true)
    public void crendentials(){
        Authentification authLocators = PageFactory.initElements(BaseSetup.getDriver(), Authentification.class);
        authLocators.login();
    }

    @Test(description = "Test to add a new collaborator and deleteCollaborator it")
    public void collaboratorPage() {
        CollabLocators  collaboratorLocators = PageFactory.initElements(BaseSetup.getDriver(), CollabLocators.class);

        collaboratorLocators.navigateToHRSpacePage();
        collaboratorLocators.navigateToCollaboratorPage();}
    @Test
    public void add(){
        CollabTasks tasks = PageFactory.initElements(BaseSetup.getDriver(), CollabTasks.class);
        tasks.addNewCollaborator();
        System.out.println("Collaborator has successfully been added");
    }
    @Test
    public void deleteCollaborator(){

        CollabTasks tasks = PageFactory.initElements(BaseSetup.getDriver(), CollabTasks.class);
        tasks.deleteCollaborator();
        System.out.println("Collaborator has successfully been deleted");

    }
    @Test
    public void exportExel(){
        CollabTasks tasks = PageFactory.initElements(BaseSetup.getDriver(), CollabTasks.class);
        tasks.exportExel();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) throws Exception {
        if (!result.isSuccess()) {
            ScreenshotUtils.takeScreenshot(BaseSetup.getDriver());
        } }
}
