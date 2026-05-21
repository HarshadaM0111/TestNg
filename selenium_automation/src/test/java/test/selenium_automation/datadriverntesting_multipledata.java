
package test.selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriverntesting_multipledata {

    @Test(dataProvider = "data")
    public void swaglab_login_logout(String uname, String pass) {

        EdgeDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pass);

        driver.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click menu button
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("react-burger-menu-btn"))).click();

        // Wait for logout button and click
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("logout_sidebar_link"))).click();

        driver.quit();
    }

    @DataProvider
    public Object[][] data() {

        return new Object[][] {

                { "standard_user", "secret_sauce" },
                { "problem_user", "secret_sauce" },
                { "performance_glitch_user", "secret_sauce" },
                { "error_user", "secret_sauce" },
                { "visual_user", "secret_sauce" }

        };
    }
}