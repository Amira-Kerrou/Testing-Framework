package HRspace.collaborators;

import pages.authentification.Authentification;
import base.BaseSetup;
import pages.HR.collaborators.CollabLocators;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tasks.collaborators.CollabTasks;

import java.io.IOException;


@Epic("Stark HRM")
@Feature("Collaborators")
public class MapLineMode extends CollabLocators {

    @BeforeClass(alwaysRun = true)
    public void crendentials(){
        Authentification  authLocators = PageFactory.initElements(BaseSetup.getDriver(), Authentification.class);
        authLocators.login();
    }

    @Test

    public void mapLineMode() {
        CollabTasks tasks = PageFactory.initElements(BaseSetup.getDriver(), CollabTasks.class);
        tasks.changeMode();

    }}
