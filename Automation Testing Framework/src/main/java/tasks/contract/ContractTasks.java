package tasks.contract;


import java.io.FileReader;
import java.util.Properties;

import base.BaseSetup;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import pages.HR.contract.Contract;

public class ContractTasks extends BaseSetup {

    public ContractTasks () {

    }
    Contract contractWebElements = new Contract();

    public void addNewContract() {
        JSONParser parser = new JSONParser();

        try {
            // Read the JSON file
            FileReader reader = new FileReader("src/main/resources/contractData.json");
            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) obj;
            // Extract the data from the JSON file
            String employee = (String) jsonObject.get("employee");
            String type = (String) jsonObject.get("type");

            contractWebElements.addButton.click();
            contractWebElements.employee.sendKeys(employee);
            contractWebElements.type.sendKeys(type);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } }

        public void updateContract(){
        contractWebElements.updateButton.click();
        contractWebElements.updateType.sendKeys("CDI");
        contractWebElements.saveButton.click();
    }

    public void exportExel (){
        contractWebElements.exelButton.click();
        contractWebElements.downloadExelFile.click();

    }
    public void search (){
        contractWebElements.searchContact.click();
    }

    }










