package Test.Android;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.DashboardPageObjects;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;

import static Common.ExcelUtils.getSignUpUserDetails;

/*****To verify that the RoadL request should be in unaccepted state once we click on undo button after accepting a request*******/
/*****To verify after clicking on location map button of available opportunity, map should be displayed****/
/*****To verify hide button is hiding the Roadl request or not*****/
public class RoadLRequestUndoTest extends AppiumController {
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
    public void roadLRequest(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        DashboardPageObjects dashboardPageObjects = PageFactory.initElements(AppiumController.getDriver(), DashboardPageObjects.class);
        initializeObjects();
        loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
        String beforeClick=dashboardPageObjects.getBtn_availableOpportuniriesAccept().getText();
        System.out.println("before click value = "+beforeClick);
        dashboardPageObjects.getBtn_availableOpportuniriesAccept().click();
        String afterClick=dashboardPageObjects.getBtn_availableOpportuniriesAccept().getText();
        System.out.println("After clicking accept button = "+afterClick);
        if(afterClick.equalsIgnoreCase("Accepted"))
        {
            System.out.println("Request Accepted successfully");
        }
        WebElement undo=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
        String undoText= undo.getText();
        if(undoText.equalsIgnoreCase("undo"))
        {
            undo.click();
        }
        String afterUndo=dashboardPageObjects.getBtn_availableOpportuniriesAccept().getText();
        if(afterUndo.equalsIgnoreCase("$120: Accept"))
        {
            System.out.println("Undo button is clicked and request unaccepted successfully");
        }
        Assert.assertEquals(undo.isDisplayed(), true);
        dashboardPageObjects.getBtn_availableOpportuniriesMap().click();
        if(driver.getPageSource().contains("map"))
        {
            System.out.println("map is displayed");
        }
       Assert.assertEquals(driver.getPageSource().contains("com.google.android.apps.maps"), true);

        //Verifying hide button
        String before_hide_click=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        dashboardPageObjects.getBtn_availableOpportuniriesHide().click();
        driver.findElement(By.id("android:id/button1")).click();
        String after_clicking_hide=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        if(!before_hide_click.contains(after_clicking_hide))
        {
            System.out.println("RoadL request hidden successfully");
        }
        Assert.assertEquals(!before_hide_click.contains(after_clicking_hide), true);
    }
    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "SignupDetails";
        return getSignUpUserDetails(file, sheetName);
    }
}