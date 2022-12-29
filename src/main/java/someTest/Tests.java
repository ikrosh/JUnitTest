package someTest;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;



public class Tests extends BaseClass {

    @BeforeClass
    public static void iniTPage() {
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void test1() {
        driver.findElement(By.id("userName")).sendKeys("Tom" );
        driver.findElement(By.id("userEmail")).sendKeys("some@test.co" );
        driver.findElement(By.id("currentAddress")).sendKeys("Some current address" );
        driver.findElement(By.id("permanentAddress")).sendKeys("Some permanent address");
        driver.findElement(By.id("submit")).click();
    }
}
