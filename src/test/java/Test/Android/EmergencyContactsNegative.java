package Test.Android;

import AppiumSupport.*;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.ProfileDetailsObjects;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;

import static Common.ExcelUtils.getSignUpUserDetails;

public class EmergencyContactsNegative extends AppiumController {
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
    public void emergencyContactsNegative(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ProfileDetailsObjects.class);
        if (negativeSwitch) {
            //Initialize objects
            initializeObjects();

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
            negativeSwitch = false;

        }
        //Clicking on emergency contacts button
        createProfileMethods.BtnEmergencyContactClick();

        //Clicking on add contact button
        profileDetailsObjects.getBtn_emergencyContactAddContact().click();

        //Completing emergency contacts page
        profileDetailsObjects.getTxt_emergencyContact1Name().sendKeys(signupDetailsPOJO.getEmergencyName());
        profileDetailsObjects.getTxt_emergencyContact1PhNumber().sendKeys(signupDetailsPOJO.getEmergencyPhone());
        profileDetailsObjects.getTxt_emergencyContact1AddressLine1();
        profileDetailsObjects.getTxt_emergencyContact1AddressLine2().sendKeys(signupDetailsPOJO.getEmergencyAddress());
        profileDetailsObjects.getTxt_emergencyContact1Apt().sendKeys(signupDetailsPOJO.getEmergencyApt());
        profileDetailsObjects.getDd_emergencyContact1Relationship();
        profileDetailsObjects.getBtn_emergencyContact1Submit().click();
    }

    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "emergency_contacts_negative";
        return getSignUpUserDetails(file, sheetName);
    }
}
