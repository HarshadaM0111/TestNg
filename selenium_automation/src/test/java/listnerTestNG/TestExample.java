package listnerTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScreenshotListener.class)
public class TestExample extends BaseClass {

    @Test
    void passTest() {

        setup();

        System.out.println("Pass Test Executed");

        Assert.assertEquals("ABC", "ABC");
    }

    @Test
    void failTest() {

        setup();

        System.out.println("Fail Test Executed");

        Assert.assertEquals("ABC", "XYZ");
    }
}