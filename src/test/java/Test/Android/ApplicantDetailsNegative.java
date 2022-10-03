package Test.Android;

import AppiumSupport.*;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import static Common.ExcelUtils.getSignUpUserDetails;

//To verify if we enter wrong SSN, if it through some error or not
public class ApplicantDetailsNegative extends AppiumController {
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

    /*************Applicant details*************/
    @Test(dataProvider = "signupData")
    public void applicantDetailsNegative(SignupDetailsPOJO signupDetailsPOJO1) throws InterruptedException, FileNotFoundException {
        if (negativeSwitch) {
            System.out.print("Amit");
            //Initialize objects
            initializeObjects();
            // this.signupDetailsPOJO = signupDetailsPOJO1;

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO1.getRegisterEmail(), signupDetailsPOJO1.getRegisterPassword());
            negativeSwitch = false;

        }
        //Clicking on applicant details button
        createProfileMethods.BtnApplicationDetailsClick();

        //Completing applicant details page
        profileDetailsMethods.applicantDetails(signupDetailsPOJO1);
    }

    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "applicant_details_negative";
        return getSignUpUserDetails(file, sheetName);
    }
}
