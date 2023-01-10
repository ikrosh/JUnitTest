package someTest;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPage;


public class HillelCoachTest extends BaseClass {

    static MainPage mainPage;


    @BeforeClass
    public static void iniTPage() {
        driver.get("https://dnipro.ithillel.ua/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void testCoaches() throws Exception {
        mainPage.openCoaches();
        mainPage.getCoachesData();
    }
}
