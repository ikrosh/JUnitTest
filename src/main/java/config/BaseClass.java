package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    public static WebDriver driver;

    @BeforeClass
    public static void starT() {
        driver = DriverConfig.getWebDriver(Browsers.CHROME);
    }

    @AfterClass
    public static void enD() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }







}