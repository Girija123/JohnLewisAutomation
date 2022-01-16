package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginTestSteps extends CommonFunctions {

    @When("I click on My Account link")
    public void i_click_on_my_account_link() {
        driver.findElement(By.linkText("My Account")).click();
       // Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pri\"]/div/div/div/h1")).isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("Sign In"));
    }

    @When("I enter invalid username")
    public void i_enter_invalid_username() throws IOException {
        String usernameVal = readPropertyFile("username");
        driver.findElement(By.id("EmailOrAccountNumber")).sendKeys(usernameVal);
    }

    @When("I enter invalid password")
    public void i_enter_invalid_password() throws IOException {
        String passwordVal = readPropertyFile("passwordVal");
        driver.findElement(By.id("Password")).sendKeys(passwordVal);
    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("SignInNow")).click();
    }

    @Then("I should get {string} message.")
    public void i_should_get_message(String expectedLoginFailedMsg) {
        String actualLoginFailedTest = driver.findElement(By.xpath("//div[@class='SignInTo']/div/div/span")).getText();
        Assert.assertEquals(expectedLoginFailedMsg, actualLoginFailedTest);
    }
}
