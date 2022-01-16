package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSteps extends CommonFunctions {

    @When("I click on Register now button")
    public void i_click_on_register_now_button() {
        driver.findElement(By.xpath("//span[text()='Register Now']")).click();
    }
    @When("I select title {string}")
    public void i_select_title(String title) {
        new Select(driver.findElement(By.id("Title"))).selectByVisibleText(title);
    }
    @When("I enter firstname {string}")
    public void i_enter_firstname(String firstname) {
        driver.findElement(By.id("FirstName")).sendKeys(firstname);
    }
}
