package listnerTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class GoogleTest extends BaseClass {

    @Test
    void titleTest() {

        setup();

        String actual =
                driver.getTitle();

        Assert.assertEquals(actual,
                "Incorrect Title");
    }
}