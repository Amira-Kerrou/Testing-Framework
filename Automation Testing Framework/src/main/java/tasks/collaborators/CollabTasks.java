package tasks.collaborators;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import pages.HR.collaborators.CollabLocators;
import base.BaseSetup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;

public class CollabTasks extends BaseSetup {
    public CollabTasks() {
    }
    CollabLocators collaboratorWebElements = new CollabLocators();
    public void addNewCollaborator() {
        JSONParser parser = new JSONParser();

        try {
            // Read the JSON file
            FileReader reader = new FileReader("src/main/resources/collaboratorData.json");
            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;

            // Extract the data from the JSON file
            String firstName = (String) jsonObject.get("firstName");
            String lastName = (String) jsonObject.get("lastName");
            String email = (String) jsonObject.get("email");
            String nationality = (String) jsonObject.get("nationality");
            String gender = (String) jsonObject.get("gender");

            // Perform the desired actions using the extracted data
            collaboratorWebElements.addButton.click();
            collaboratorWebElements.firstName.sendKeys(firstName);
            collaboratorWebElements.lastName.sendKeys(lastName);
            collaboratorWebElements.professionalEmail.sendKeys(email);
            collaboratorWebElements.nationality.sendKeys(nationality);
            collaboratorWebElements.nationality.sendKeys(Keys.RETURN);
            collaboratorWebElements.gender.sendKeys(gender);
            collaboratorWebElements.gender.sendKeys(Keys.RETURN);
            collaboratorWebElements.saveButton.click();
            collaboratorWebElements.yesButton.click();

            // Close the reader
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCollaborator() {
        collaboratorWebElements.deleteButton.click();
        collaboratorWebElements.yesDeleteButton.click();
    }

    public void searchCollaborator(String collaboratorName) {
        collaboratorWebElements.search.click();
        collaboratorWebElements.search.sendKeys(collaboratorName);
        collaboratorWebElements.search.sendKeys(Keys.RETURN);
    }

    public void goToHRSpacePage() {
        collaboratorWebElements.navigateToHRSpacePage();
    }

    public void goToCollaboratorPage() {
        collaboratorWebElements.navigateToCollaboratorPage();

    }
    public void exportExel(){
        collaboratorWebElements.exportExel.click();
        collaboratorWebElements.downloadFile.click();

    }
    public void changeMode(){
        collaboratorWebElements.mode.click();
    }
}
