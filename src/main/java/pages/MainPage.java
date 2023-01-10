package pages;

import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import util.Scrolling;

import java.util.List;

public class MainPage extends BaseClass {

    By coaches = By.id("coachesSection");
    By coachesList = By.className("coach-card_group");


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void openCoaches() {
        Scrolling.scrollToElementVisibilityOf(driver, coaches);
    }

    public void getCoachesData() throws Exception {
        List<WebElement> coaches = driver.findElements(coachesList);
        if (coaches.size()==0) throw new Exception("List of coaches is empty");
        for (WebElement el : coaches) {
            System.out.println(el.findElement(By.className("coach-card_name")).getText() + " - "
                    + el.findElement(By.className("coach-card_spec")).getText());
        }
     }
}
