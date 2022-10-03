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

public class WorkHistoryNegative extends AppiumController {
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
    public void workHistoryNegative(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(),  ProfileDetailsObjects.class);

        if (negativeSwitch) {
            //Initialize objects
            initializeObjects();
            // this.signupDetailsPOJO = signupDetailsPOJO1;

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
            negativeSwitch = false;
        }

        //Clicking on work history button
        createProfileMethods.BtnWorkHistoryClick();

        //Completing work history
        implicitWait();
        implicitWait();
        profileDetailsObjects.getBtn_areYouCurrentlyEmployed_Yes().click();
        profileDetailsObjects.getBtn_addCurrentEmployer().click();
        profileDetailsObjects.getTxt_addCurrentEmployerName().sendKeys(signupDetailsPOJO.getWorkHistoryName());
        profileDetailsObjects.getTxt_addCurrentEmployerPosition().sendKeys(signupDetailsPOJO.getWorkHistoryPosition());
        profileDetailsObjects.getTxt_addCurrentEmployerAddress1();
        profileDetailsObjects.getTxt_addCurrentEmployerAddress2().sendKeys(signupDetailsPOJO.getWorkHistoryAddress2());
        profileDetailsObjects.getTxt_addCurrentEmployerApt().sendKeys(signupDetailsPOJO.getWorkHistoryApt());
        profileDetailsObjects.getBtn_addCurrentEmployerSubmit().click();
        profileDetailsObjects.getBtn_applicantDetailsErrorOkClick();
    }
    @DataProvider
    public static Iterator<Object[]> signupData () {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "work_history_negative";
        return getSignUpUserDetails(file, sheetName);
    }
}
