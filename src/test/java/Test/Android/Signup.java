package Test.Android;

import AppiumSupport.*;
import Common.CustomListener;
import PageObjects_Methods.Android.Methods.LoginAndChangePasscodeMethods;
import PageObjects_Methods.Android.Methods.LoginPageMethods;
import PageObjects_Methods.Android.Methods.SignUpPageMethods;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

import static Common.ExcelUtils.getSignUpUserDetails;

@Listeners(CustomListener.class)
public class Signup extends AppiumController {

    @Test(dataProvider = "signupData", priority = 1)
    public void SignupTest(SignupDetailsPOJO signupDetailsPOJO) throws FileNotFoundException, InterruptedException {
        SignUpPageMethods signUpPageMethods = new SignUpPageMethods();
        SignUpPageObjects signUpPageObjects = new SignUpPageObjects();
        if (signupDetailsPOJO.getRegisterExpectedResult().contains("Registration successful")) {
            LoginPageMethods loginPageMethods = new LoginPageMethods();

            LoginAndChangePasscodeMethods loginAndChangePasscodeMethods = new LoginAndChangePasscodeMethods();

            //Register with valid values
            signUpPageMethods.signup(signupDetailsPOJO);

            String successMsg = signUpPageObjects.getMsg_registrationSuccessful().getText();
            signUpPageObjects.getBtn_registrationsuccessful().click();

            //Getting username and password for signed-in user
            String signup_username = signupDetailsPOJO.getRegisterEmail();
            String signup_password = signupDetailsPOJO.getRegisterPassword();

            //Login to the application
            loginPageMethods.login(signup_username, signup_password);

            implicitWait();
            //SKIP TOUR
            loginAndChangePasscodeMethods.clickSkipLink();

            //Input passcode
            loginAndChangePasscodeMethods.loginAndChangePasscode();

            //Confirm passcode
            loginAndChangePasscodeMethods.loginAndChangePasscode();

            //Login to the application
            loginPageMethods.login(signup_username, signup_password);

            //Assert.assertEquals(signUpPageMethods.getRegToastText(), signupDetailsPOJO.getExpectedResult());
            Assert.assertEquals(successMsg, signupDetailsPOJO.getRegisterExpectedResult());

        } else if(signupDetailsPOJO.getRegisterExpectedResult().equalsIgnoreCase("This email id already exist.")){
            signUpPageMethods = new SignUpPageMethods();

            //Register with invalid values
            signUpPageMethods.signup(signupDetailsPOJO);

            Assert.assertEquals(signUpPageMethods.getRegToastText(), signupDetailsPOJO.getRegisterExpectedResult());
        }
        else if(signupDetailsPOJO.getRegisterExpectedResult().contains("enter valid")){
            signUpPageMethods = new SignUpPageMethods();

            //Register with invalid values
            signUpPageMethods.signup(signupDetailsPOJO);

            Assert.assertEquals(signUpPageMethods.getRegToastText(), signupDetailsPOJO.getRegisterExpectedResult());
        }
    }

        @DataProvider
        public static Iterator<Object[]> signupData () throws Exception {
            File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
            String sheetName = "SignupDetails";
            return getSignUpUserDetails(file, sheetName);
        }
    }