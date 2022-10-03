package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.LoginPageObjects;
import PageObjects_Methods.iOS.Objects.SignUpPageObjects;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class SignUpPageMethods {

    public void signup(/*SignupDetailsPOJO signupDetailsPOJO*/) throws FileNotFoundException, InterruptedException {

        SignUpPageObjects signUpPageObjects = PageFactory.initElements(AppiumController.getDriver(), SignUpPageObjects.class);
        LoginPageObjects loginPageObjects= PageFactory.initElements(AppiumController.getDriver(), LoginPageObjects.class);
        loginPageObjects.getIos_notification_allow().click();
        loginPageObjects.getIos_location_allow().click();
        signUpPageObjects.getIos_link_signup().click();
        Thread.sleep(5000);
        signUpPageObjects.getIos_txt_title().sendKeys("Mr");
        signUpPageObjects.getIos_txt_firstName().sendKeys("abc"/*signupDetailsPOJO.getRegisterFirstname()*/);
        signUpPageObjects.getIos_txt_middleName().sendKeys("abc"/*signupDetailsPOJO.getRegisterEmail()*/);
        signUpPageObjects.getIos_txt_lastName().sendKeys("abc"/*signupDetailsPOJO.getRegisterLastname()*/);
        signUpPageObjects.getIos_txt_nickName().sendKeys("abc"/*String.valueOf(signupDetailsPOJO.getRegisterCellphone())*/);
        signUpPageObjects.getIos_txt_email().sendKeys("abcOrg12@chetu.com");
        signUpPageObjects.getIos_txt_cellPhone().sendKeys("1234123413");
        signUpPageObjects.getIos_dd_gender();
        signUpPageObjects.getIos_cal_dob();
        signUpPageObjects.getIos_dd_clinicalQualification();
        signUpPageObjects.getIos_txt_password().sendKeys("chetu@123"/*signupDetailsPOJO.getRegisterPassword()*/);
        signUpPageObjects.getIos_txt_confirmPassword().sendKeys("chetu@123"/*signupDetailsPOJO.getRegisterConfirmpassword()*/);
        signUpPageObjects.getIos_cb_roadL().click();
        signUpPageObjects.getIos_toggle_terms_Conditions().click();
        signUpPageObjects.getIos_toggle_privacyPolicy().click();
        signUpPageObjects.getIos_btn_signup().click();
    }
//
//    public String getRegToastText(){
//        SignUpPageObjects signUpPageObjects = PageFactory.initElements(BaseClass.getAppiumDriver(), SignUpPageObjects.class);
//        return signUpPageObjects.getToast_snackbar().getText();
//    }
//    public void clickBackButton(){
//        SignUpPageObjects signUpPageObjects = PageFactory.initElements(BaseClass.getAppiumDriver(), SignUpPageObjects.class);
//        signUpPageObjects.getBtn_back().click();
//    }
}