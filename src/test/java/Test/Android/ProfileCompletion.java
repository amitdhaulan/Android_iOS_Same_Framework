package Test.Android;

import AppiumSupport.*;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

import static Common.ExcelUtils.getSignUpUserDetails;

public class ProfileCompletion extends AppiumController {
    LoginPageMethods loginPageMethods;
    SignUpPageMethods signUpPageMethods;
    SignUpPageObjects signUpPageObjects;
    ProfileDetailsMethods profileDetailsMethods;
    CreateProfileMethods createProfileMethods;
    LoginAndChangePasscodeMethods loginAndChangePasscodeMethods;
    SignupDetailsPOJO signupDetailsPOJO;

    public void initializeObjects() {
        profileDetailsMethods = new ProfileDetailsMethods();
        createProfileMethods = new CreateProfileMethods();
        loginPageMethods = new LoginPageMethods();
        signUpPageMethods = new SignUpPageMethods();
        signUpPageObjects = new SignUpPageObjects();
        loginAndChangePasscodeMethods = new LoginAndChangePasscodeMethods();
    }

    @Test(dataProvider = "signupData")
    public void SignupTest(SignupDetailsPOJO signupDetailsPOJO1) throws FileNotFoundException, InterruptedException {
        initializeObjects();
        this.signupDetailsPOJO = signupDetailsPOJO1;

        //Register with valid values
        signUpPageMethods.signup(signupDetailsPOJO);

        if (signupDetailsPOJO.getRegisterExpectedResult().contains("Registration successful")) {
            //Getting success message when the user gets registered
            String successMsg = signUpPageObjects.getMsg_registrationSuccessful().getText();
            signUpPageObjects.getBtn_registrationsuccessful().click();

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());

            implicitWait();
            //SKIP TOUR
            loginAndChangePasscodeMethods.clickSkipLink();

            //Input passcode
            loginAndChangePasscodeMethods.loginAndChangePasscode();

            //Confirm passcode
            loginAndChangePasscodeMethods.loginAndChangePasscode();

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());

            //Assert.assertEquals(signUpPageMethods.getRegToastText(), signupDetailsPOJO.getExpectedResult());
            Assert.assertEquals(successMsg, signupDetailsPOJO.getRegisterExpectedResult());

        } else {
            signUpPageMethods.clickBackButton();
            throw new SkipException("Skipping SignupTest as Email Id is already registered!");
        }
    }

    /*************Applicant details*************/
    @Test(priority = 1, dependsOnMethods = {"SignupTest"})
    public void applicantDetailsTest() throws FileNotFoundException {
        //Initialize objects
        initializeObjects();

        //Clicking on applicant details button
        createProfileMethods.BtnApplicationDetailsClick();

        //Completing applicant details page
        profileDetailsMethods.applicantDetails(signupDetailsPOJO);
    }

    /**************Reference details**************/
    @Test(priority = 2, dependsOnMethods = {"applicantDetailsTest"})
    public void referencesTest() {
        //Initialize objects
        initializeObjects();

        //Clicking on reference details button
        createProfileMethods.BtnReferenceDetailsClick();

        //Completing reference page
        profileDetailsMethods.reference(signupDetailsPOJO);
    }

    /***************Emergency details***************/
    @Test(priority = 3, dependsOnMethods = {"referencesTest"})
    public void emergencyContactTest() {
        //Initialize objects
        initializeObjects();

        //Clicking on emergency contact button
        createProfileMethods.BtnEmergencyContactClick();

        //Completing emergency contact page
        profileDetailsMethods.emergencyContact(signupDetailsPOJO);
    }

    /***************Education details***************/
    @Test(priority = 4, dependsOnMethods = {"emergencyContactTest"})
    public void educationDetailsTest() {
        //Initialize objects
        initializeObjects();

        //Clicking on education details button
        createProfileMethods.BtnEducationDetailsClick();

        //Completing Education details page
        profileDetailsMethods.educationDetails(signupDetailsPOJO);
    }

    /****************Professional details****************/
    @Test(priority = 5, dependsOnMethods = {"educationDetailsTest"})
    public void professionalDetailsTest() {
        //Initialize objects
        initializeObjects();

        //Clicking on professional details button
        createProfileMethods.BtnProfessionalDetailsClick();

        //Completing professional details page
        profileDetailsMethods.professionalDetails(signupDetailsPOJO);

    }

    /*****************WorkHistory details*****************/
    @Test(priority = 6, dependsOnMethods = {"professionalDetailsTest"})
    public void workHistoryDetailsTest() {
        //Initialize objects
        initializeObjects();

        //Clicking on work history
        createProfileMethods.BtnWorkHistoryClick();

        //Completing work history page
        profileDetailsMethods.workHistory(signupDetailsPOJO);

    }

    /*******************Payroll details*******************/
    @Test(priority = 7, dependsOnMethods = {"workHistoryDetailsTest"})
    public void payrollTest() {
        //Initialize objects
        initializeObjects();

        //Clicking on work history
        createProfileMethods.BtnPayrollClick();

        //Completing work history page
        profileDetailsMethods.payroll(signupDetailsPOJO);
    }

    /********************Document verification details********************/
    @Test(priority = 8, dependsOnMethods = {"payrollTest"})
    public void DocumentVerificationTest() throws FileNotFoundException {
        //Initialize objects
        initializeObjects();

        //Clicking on document verification button
        createProfileMethods.BtnDocumentVerificationClick();

        //Completing payroll details
        profileDetailsMethods.documentVerification(signupDetailsPOJO);
    }
    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "Complete_SignupDetails";
        return getSignUpUserDetails(file, sheetName);
    }
}