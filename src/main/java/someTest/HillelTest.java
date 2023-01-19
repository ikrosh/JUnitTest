package someTest;

import config.BaseClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;
import pages.MainPage;


public class HillelTest extends BaseClass {

    static CertificatePage certificatePage;


    @BeforeClass
    public static void iniTPage() {
        driver.get("https://certificate.ithillel.ua/");
        certificatePage = PageFactory.initElements(driver, CertificatePage.class);
    }

    @Test
    public void testCoaches() throws Exception {
        certificatePage.sendCertForm("11111");
        certificatePage.verifyError();
    }
}
