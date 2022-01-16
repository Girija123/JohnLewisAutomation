package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;
    private String scrShotFilePath = new File("src/main/resources/srcShots").getAbsolutePath();
    private String configFilePath = new File("src/main/resources/testData/config.properties").getAbsolutePath();

    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void waitForTime(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

    }

   public void takeScreenshot(String filename) throws IOException
   {
       TakesScreenshot screenshot = ((TakesScreenshot) driver);
       File virtualFile = screenshot.getScreenshotAs(OutputType.FILE);
       File physicalFile = new File(scrShotFilePath+filename);
       FileUtils.copyFile(virtualFile, physicalFile);
   }

   public String readPropertyFile(String key) throws IOException {
       FileInputStream inputStream = new FileInputStream(configFilePath);
       Properties properties = new Properties();
       properties.load(inputStream);
       String value =  properties.getProperty(key);
       return value;
   }

}
