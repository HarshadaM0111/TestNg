package listnerTestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    // Executes before test starts
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started : " + result.getName());
    }

    // Executes when test passes
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed : " + result.getName());
    }

    // Executes when test fails
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed : " + result.getName());
    }

    // Executes when test gets skipped
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped : " + result.getName());
    }
}