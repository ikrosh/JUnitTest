package pages;

import config.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage extends BaseClass {


    @FindBy(xpath = "//span[@class='course-descriptor_header-text']")
    private WebElement courseTitle;
    @FindBy(xpath = "//div[@class='course-rating']")
    private WebElement courseRating;
    @FindBy(xpath = "//div[@class='introduction_info introduction-info']")
    private WebElement courseDescription;

    public CoursePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getCourseTitle() {
        return courseTitle.getText();
    }

    public String getCourseRate() {
        return courseRating.getText();
    }

    public String getCourseDescription() {
        return courseDescription.getText();
    }






}
