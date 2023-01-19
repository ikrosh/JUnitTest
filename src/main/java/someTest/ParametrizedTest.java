package someTest;

import config.BaseCertificate;
import data.CertEnum;
import data.CertLanguage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.CertificatePage;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class ParametrizedTest extends BaseCertificate {


    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(CertEnum.values());
    }


    public void iniTPage() {
        if (bundle==null||!bundle.getString("type").equals(certEnum.getType())) {
            driver.get("https://certificate.ithillel.ua/");
            bundle = ResourceBundle.getBundle(certEnum.getType());
            certificatePage = PageFactory.initElements(driver, CertificatePage.class);
        }

    }

    @Test
    public void verifyCheckButtonIsDisabled()  {
        certificatePage.buttonIsDisabled();
    }

    @Test
    public void verifyInvalidCertificate() throws InterruptedException {
  //      certificatePage.sendCertForm(bundle.getString("id"));
        certificatePage.sendCertForm("11111");
        certificatePage.verifyError();
    }

    @Test
    public void verifyPageTitle()  {
        Assert.assertEquals("Перевірка сертифіката Випускника Комп'ютерної школи Hillel", driver.getTitle());
    }

    @Test
    public void verifyTitle()  {
        certificatePage.verifyTitle();
    }
}
