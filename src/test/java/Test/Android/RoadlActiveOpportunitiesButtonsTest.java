package Test.Android;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.DashboardPageObjects;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;

import static Common.ExcelUtils.getSignUpUserDetails;


/*****To verify that open map button in Active Opportunities section is opening map or not*****/
/*****To verify that cancel button is canceling request or not*****/
/*****To verify that after clicking arrived button, that request is not visible in Active Opportunities section anymore *****/
public class RoadlActiveOpportunitiesButtonsTest extends AppiumController {
    LoginPageMethods loginPageMethods;
    SignUpPageMethods signUpPageMethods;
    SignUpPageObjects signUpPageObjects;
    ProfileDetailsMethods profileDetailsMethods;
    CreateProfileMethods createProfileMethods;
    LoginAndChangePasscodeMethods loginAndChangePasscodeMethods;
    boolean negativeSwitch = true;
    public void initializeObjects() {
        profileDetailsMethods = new ProfileDetailsMethods();
        createProfileMethods = new CreateProfileMethods();
        loginPageMethods = new LoginPageMethods();
        signUpPageMethods = new SignUpPageMethods();
        signUpPageObjects = new SignUpPageObjects();
        loginAndChangePasscodeMethods = new LoginAndChangePasscodeMethods();
    }
    @Test(dataProvider = "signupData")
    public void roadlActiveOpportunitiesButtons(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        DashboardPageObjects dashboardPageObjects = PageFactory.initElements(AppiumController.getDriver(), DashboardPageObjects.class);
        initializeObjects();
        //Logging into application
        loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());

        //Clicking on map button
        dashboardPageObjects.getBtn_activeOpportuniriesOpenMap1().click();

        //verifying map is opened or not
        if(driver.getPageSource().contains("map"))
        {
            System.out.println("map is displayed");
        }
        Assert.assertEquals(driver.getPageSource().contains("map"), true);

        //Verifying cancel button
        String patient_before_cancel= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        System.out.println(patient_before_cancel+" patient cancellation starts...");
        Thread.sleep(5000);
        dashboardPageObjects.getBtn_activeOpportuniriesCancel1().click();
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("com.doral.clinician.android:id/edtReason")).sendKeys("cancel request");
        driver.findElement(By.id("com.doral.clinician.android:id/btnDone")).click();
        String patient1= driver.findElement(By.id("com.doral.clinician.android:id/text_user1")).getText();
        if(!patient_before_cancel.equalsIgnoreCase(patient1))
            System.out.println(patient_before_cancel+" request is cancelled");
        else
            System.out.println(patient_before_cancel+" request not cancelled");
        Assert.assertEquals(!patient_before_cancel.equalsIgnoreCase(patient1), true);

        //Verifying arrived button
        String patient_before_arrived= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        System.out.println(patient_before_arrived+" patient arrived button not clicked");
        Thread.sleep(5000);
        dashboardPageObjects.getBtn_activeOpportuniriesArrived1().click();
        String patient2= driver.findElement(By.id("com.doral.clinician.android:id/text_user1")).getText();
        if(!patient_before_arrived.equalsIgnoreCase(patient2))
            System.out.println(patient_before_arrived+" request is cancelled");
        else
            System.out.println(patient_before_arrived+" request not cancelled");
        Assert.assertEquals(!patient_before_arrived.equalsIgnoreCase(patient2), true);

    }
    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "SignupDetails";
        return getSignUpUserDetails(file, sheetName);
    }

}
