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

//To verify if we don't fill Residency institute details and Fellowship institute details, Education Details will submit or not
public class EducationDetailsNegative extends AppiumController {
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
    public void educationDetailsNegative(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ProfileDetailsObjects.class);

        if (negativeSwitch) {
            //Initialize objects
            initializeObjects();
            // this.signupDetailsPOJO = signupDetailsPOJO1;

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
            negativeSwitch = false;
        }

        //Clicking on education details button
        createProfileMethods.BtnEducationDetailsClick();

        //Completing education details
        profileDetailsObjects.getBtn_medicalInstitute().click();
        profileDetailsObjects.getTxt_medicalInstituteName().sendKeys(signupDetailsPOJO.getEducationInstituteName());
        profileDetailsObjects.getTxt_medicalInstituteAddress1();
        profileDetailsObjects.getTxt_medicalInstituteAddress2().sendKeys(signupDetailsPOJO.getEducationAddrss2());
        profileDetailsObjects.getTxt_medicalInstituteApt().sendKeys(signupDetailsPOJO.getEducationApt());
        profileDetailsObjects.getDd_medicalInstituteYearStarted();
        profileDetailsObjects.getDd_medicalInstituteYearCompleted();
        profileDetailsObjects.getBtn_medicalInstituteSave().click();

        //clicking on education details submit button
        profileDetailsObjects.getBtn_educationDetailsSubmit().click();
    }

    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "education_details_negative";
        return getSignUpUserDetails(file, sheetName);
    }
}
