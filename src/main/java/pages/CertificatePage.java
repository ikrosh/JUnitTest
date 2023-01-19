package pages;

import config.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Scrolling;

import java.util.List;

public class CertificatePage extends BaseClass {

    @FindBy(name="certificate")
    private WebElement certificate;
    @FindBy(xpath = "//form[@id=\"certificateCheckForm\"]//button")
    private WebElement button;
    @FindBy(css = "p[class=\"certificate-check_message\"]")
    private WebElement error;
    @FindBy(css = "h1")
    private WebElement title;


    public boolean buttonIsDisabled() {
        return button.isDisplayed();
    }

    private boolean buttonIsEnabled() {
        return button.isEnabled();
    }

    public void sendCertForm(String id) {
        certificate.sendKeys(id);
        buttonIsEnabled();
        button.click();
    }

    public void verifyError() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Сертифікат не знайдено", error.getText());
    }

    public void verifyTitle() {
        Assert.assertEquals("Перевірка сертифікату", title.getText());
    }





}
