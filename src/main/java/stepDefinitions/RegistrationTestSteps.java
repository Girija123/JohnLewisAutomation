package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegistrationTestSteps extends CommonFunctions {

    @Given("I'm on Home Page {string}")
    public void i_m_on_home_page(String url) throws IOException {
        driver.get(url);
        waitForTime(2);
        takeScreenshot("/homepage.png");
       // driver.findElement(By.xpath("//button[@data-test='allow-all']")).click();
    }

    @When("I click on sign in link")
    public void i_click_on_sign_in_link() {
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
    }

    @When("I click on Create account button")
    public void i_click_on_create_account_button() throws IOException {
        takeScreenshot("/signUpPage.png");
        driver.findElement(By.xpath("//button[@data-test='create-account-button']")).click();
        waitForTime(3);
    }

    @When("I enter email address {string}")
    public void i_enter_email_address(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I opt for subscription")
    public void i_opt_for_subscription() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/form/div[4]/fieldset/div/div[1]/label/div")).click();
    }

    @When("I click sign up button")
    public void i_click_sign_up_button() {
        driver.findElement(By.id("registerForm")).click();
    }

    @Then("I should get re-directed to profile page")
    public void i_should_get_re_directed_to_profile_page() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/a")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/h1")).isDisplayed());
    }

    @When("I don't opt for subscription")
    public void i_don_t_opt_for_subscription() {

    }

    @Then("I should get email validation failed message as {string}")
    public void i_should_get_email_validation_failed_message_as(String expectedEmailValidationMsg) {

    }


}
