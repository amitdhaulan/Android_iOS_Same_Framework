package Common;

import PageObjects_Methods.Android.Methods.SignUpPageMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    ExtentReports reports = new ExtentReports(System.getProperty("user.dir") + "\\src\\main\\resources\\Reports\\ReportResults.html", true);
    ExtentTest test;

    @Override
    public void onFinish(ITestContext arg0) {
        reports.endTest(test);
        reports.flush();
    }

    @Override
    public void onStart(ITestContext arg0) {

        test = reports.startTest(arg0.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        test.log(LogStatus.FAIL, arg0.getTestContext().toString());
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        test.log(LogStatus.SKIP, arg0.getTestContext().toString());
    }

    @Override
    public void onTestStart(ITestResult arg0) {
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        if (arg0.getName().equals("SignupTest")) {
            //clicking back button of signup page
            SignUpPageMethods signUpPageMethods = new SignUpPageMethods();
            signUpPageMethods.clickBackButton();
        }
        test.log(LogStatus.PASS, arg0.getName() + " is passed");
    }
}
