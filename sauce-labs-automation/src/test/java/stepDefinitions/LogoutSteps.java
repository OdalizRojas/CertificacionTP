package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.Homepage;
import utilities.DriverManager;

public class LogoutSteps {

    Homepage homepage = new Homepage(DriverManager.getDriver().driver);

    @Given("I set the user name field with {string}")
    public void setUserName(String userName){
        loginPage.setUserNameTextBox(userName);
    }
}
