package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolling {

    public static void scrollToElementVisibilityOf(WebDriver driver, By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean bool = true;
        while (bool) {
            try {
                driver.findElement(by);
                bool = false;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,10)");
            }
        }
    }


}
