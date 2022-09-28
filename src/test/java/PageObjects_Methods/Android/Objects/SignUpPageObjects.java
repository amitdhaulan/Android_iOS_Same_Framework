package PageObjects_Methods.Android.Objects;

import AppiumSupport.AppiumController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPageObjects {

    //************************************* Register Link *************************************
    @FindBy(id = "com.doral.clinician.android:id/tvSignUp")
    private static WebElement link_signup;

    // ************************************* Create New Account *************************************
    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_et_first_name")
    private static WebElement txt_firstName;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_et_last_name")
    private static WebElement txt_lastName;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_et_email")
    private static WebElement txt_email;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_et_phone")
    private static WebElement txt_cellPhone;

    @FindBy(id = "com.doral.clinician.android:id/tvSignUpGender")
    private static WebElement dd_gender;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_tv_DOB")
    private static WebElement cal_dob;

    @FindBy(id = "com.doral.clinician.android:id/tvPosition")
    private static WebElement dd_speciality;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_et_password")
    private static WebElement txt_password;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_et_confirm_password")
    private static WebElement txt_confirmPassword;

    @FindBy(id = "com.doral.clinician.android:id/cb_doral_connect")
    private static WebElement cb_doralConnect;

    @FindBy(id = "com.doral.clinician.android:id/cb_roadl")
    private static WebElement cb_roadL;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_switch_terms_of_use")
    private static WebElement toggle_terms_Conditions;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_switch_privacy_policy")
    private static WebElement toggle_privacyPolicy;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_btn_signUp")
    private static WebElement btn_signup;

    @FindBy(id = "com.doral.clinician.android:id/tv_ok")
    private static WebElement btn_registrationsuccessful;

    @FindBy(id = "com.doral.clinician.android:id/tv_error_message")
    private static WebElement msg_registrationSuccessful;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_tv_already_member")
    private static WebElement msg_alreadyamember;

    @FindBy(id = "com.doral.clinician.android:id/snackbar_text")
    private static WebElement toast_snackbar;

    @FindBy(id = "com.doral.clinician.android:id/img_menu")
    private static WebElement btn_back;

    //************************************* Login Link *************************************
    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_tv_signUp")
    private static WebElement link_login;
    //***************************************************************************************

    public WebElement getLink_signup() {
        return link_signup;
    }

        public WebElement getTxt_firstName() {
            return txt_firstName;
        }

    public WebElement getTxt_lastName() {
        return txt_lastName;
    }

    public WebElement getTxt_email() {
        return txt_email;
    }

    public WebElement getTxt_cellPhone() {
        return txt_cellPhone;
    }

    public void getDd_gender() {
        dd_gender.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
    }

    public void getCal_dob() {
        cal_dob.click();
        AppiumController.getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"01 August 2004\"]")).click();
        AppiumController.getDriver().findElement(By.id("android:id/button1")).click();
    }

    public void getDd_speciality() {
        dd_speciality.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_password() {
        return txt_password;
    }

    public WebElement getTxt_confirmPassword() {
        return txt_confirmPassword;
    }

    public WebElement getCb_doralConnect() {
        return cb_doralConnect;
    }

    public WebElement getCb_roadL() {
        return cb_roadL;
    }

    public WebElement getToggle_terms_Conditions() {
        return toggle_terms_Conditions;
    }

    public WebElement getToggle_privacyPolicy() {
        return toggle_privacyPolicy;
    }

    public WebElement getBtn_signup() {
        return btn_signup;
    }

    public WebElement getBtn_registrationsuccessful() {
        return btn_registrationsuccessful;
    }

    public WebElement getMsg_alreadyamember() {
        return msg_alreadyamember;
    }

    public WebElement getLink_login() {
        return link_login;
    }

    public WebElement getToast_snackbar() {
        return toast_snackbar;
    }

    public WebElement getBtn_back() {
        return btn_back;
    }

    public WebElement getMsg_registrationSuccessful() {
        return msg_registrationSuccessful;
    }
}