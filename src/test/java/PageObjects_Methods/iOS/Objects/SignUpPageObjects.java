package PageObjects_Methods.iOS.Objects;

import AppiumSupport.AppiumController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPageObjects {

    //************************************* Register Link *************************************
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Signup Here\"]")
    private static WebElement ios_link_signup;

    // ************************************* Create New Account *************************************
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
    private static WebElement ios_txt_title;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]")
    private static WebElement ios_txt_firstName;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    private static WebElement ios_txt_middleName;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]")
    private static WebElement ios_txt_lastName;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")
    private static WebElement ios_txt_nickName;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
    private static WebElement ios_txt_email;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[3]")
    private static WebElement ios_txt_cellPhone;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton")
    private static WebElement ios_dd_gender;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField[4]")
    private static WebElement ios_cal_dob;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton")
    private static WebElement ios_dd_clinicalQualification;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField")
    private static WebElement ios_txt_password;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeSecureTextField")
    private static WebElement ios_txt_confirmPassword;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"cb unchecked\"]")
    private static WebElement ios_cb_roadL;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]")
    private static WebElement ios_toggle_terms_Conditions;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[2]")
    private static WebElement ios_toggle_privacyPolicy;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign Up\"]")
    private static WebElement ios_btn_signup;

    @FindBy(id = "(//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"])[2]")
    private static WebElement ios_btn_registrationsuccessful;

    @FindBy(id = "com.doral.clinician.android:id/tv_error_message")
    private static WebElement msg_registrationSuccessful;

    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_tv_already_member")
    private static WebElement msg_alreadyamember;

    @FindBy(id = "com.doral.clinician.android:id/snackbar_text")
    private static WebElement toast_snackbar;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ic backWhite\"]")
    private static WebElement ios_btn_back;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    private static WebElement ios_btn_done;

    //************************************* Login Link *************************************
    @FindBy(id = "com.doral.clinician.android:id/activity_signUp_tv_signUp")
    private static WebElement link_login;
    //***************************************************************************************


    public WebElement getIos_link_signup() {
        return ios_link_signup;
    }

    public WebElement getIos_txt_title() {
        return ios_txt_title;
    }

    public WebElement getIos_txt_firstName() {
        return ios_txt_firstName;
    }

    public WebElement getIos_txt_middleName() {
        return ios_txt_middleName;
    }

    public WebElement getIos_txt_lastName() {
        return ios_txt_lastName;
    }

    public WebElement getIos_txt_nickName() {
        return ios_txt_nickName;
    }

    public WebElement getIos_txt_email() {
        return ios_txt_email;
    }

    public WebElement getIos_txt_cellPhone() {
        return ios_txt_cellPhone;
    }

    public void getIos_dd_gender() {
        ios_dd_gender.click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeButton[@name=\"Male\"]")).click();
    }

    public void getIos_cal_dob() {
         ios_cal_dob.click();
         getIos_btn_done().click();
    }

    public void getIos_dd_clinicalQualification() {
        ios_dd_clinicalQualification.click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Nurse Practioner\"]")).click();
    }

    public WebElement getIos_txt_password() {
        return ios_txt_password;
    }

    public WebElement getIos_txt_confirmPassword() {
        return ios_txt_confirmPassword;
    }

    public WebElement getIos_cb_roadL() {
        return ios_cb_roadL;
    }

    public WebElement getIos_toggle_terms_Conditions() {
        return ios_toggle_terms_Conditions;
    }

    public WebElement getIos_toggle_privacyPolicy() {
        return ios_toggle_privacyPolicy;
    }

    public WebElement getIos_btn_signup() {
        return ios_btn_signup;
    }

    public WebElement getIos_btn_done() {
        return ios_btn_done;
    }
}