package someTest;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.CoursePage;
public class PageObjectTest extends BaseClass {

    static CoursePage coursePage;

    @BeforeClass
    public static void iniTPage() {
        driver.get("https://ithillel.ua/courses/java-basic");
        coursePage = new CoursePage(driver);
    }

    @Test
    public void testCourse() {
        System.out.println(coursePage.getCourseTitle());
        System.out.println(coursePage.getCourseRate());
        System.out.println(coursePage.getCourseDescription());

    }



}
