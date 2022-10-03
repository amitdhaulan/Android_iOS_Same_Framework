package Test.Android;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.DashboardPageObjects;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;

import static Common.ExcelUtils.getSignUpUserDetails;
/*****To verify after accepting Road request in available opportunities it should display in active opportunity section*******/
public class RoadLRequestTest extends AppiumController {
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
        String availableOpportunityPresence= AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        implicitWait();
        String activeOpportunityPresence=AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        if( availableOpportunityPresence.equalsIgnoreCase(activeOpportunityPresence))
        {
            System.out.println("Opportunity activated for patient: "+activeOpportunityPresence);
        }
    }
    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "SignupDetails";
        return getSignUpUserDetails(file, sheetName);
    }
}
