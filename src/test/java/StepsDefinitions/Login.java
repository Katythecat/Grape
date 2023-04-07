package StepsDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Login extends CommonMethods {
    @Given("open the browser and launch HRM application")
    public void open_the_browser_and_hrm_application() throws IOException {
        openBrowserAndLaunchApplication();

    }
    @When("enter valid username and password")
    public void enter_valid_username_and_password() {
        WebElement userName=driver.findElement(By.id("txtUsername"));
        CommonMethods.sendText(userName, ConfigReader.getValueOfProp("username"));

        WebElement passWord=driver.findElement(By.id("txtPassword"));
        CommonMethods.sendText(passWord,ConfigReader.getValueOfProp("password"));

    }
    @When("user clicks on log in button")
    public void user_clicks_on_log_in_button() {
        WebElement clickBtn=driver.findElement(By.id("btnLogin"));
        doClick(clickBtn);


    }
    @Then("user successfully logged in to the page")
    public void user_successfully_logged_in_to_the_page() {
        boolean expectedText=driver.findElement(By.id("welcome")).isDisplayed();
        if(expectedText){
            System.out.println("use logged in successfully");
        }


    }
    @Then("close the browser")
    public void close_the_browser() {
        closeBrowser();

    }

}
