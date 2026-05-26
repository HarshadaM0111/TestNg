package listnerTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public void setup() {

        driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }
}