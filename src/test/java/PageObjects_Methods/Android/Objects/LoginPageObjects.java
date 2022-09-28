package PageObjects_Methods.Android.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {



    @FindBy(id="com.doral.clinician.android:id/activity_login_et_email")
    private static WebElement txt_userName;

    @FindBy(id="com.doral.clinician.android:id/activity_login_et_password")
    private static WebElement txt_password;

    @FindBy(id="com.doral.clinician.android:id/activity_login_btn_login")
    private static WebElement btn_login;

    @FindBy(id="com.doral.clinician.android:id/cb_remember")
    private static WebElement cb_rememberMe;

    @FindBy(id="com.doral.clinician.android:id/tvForgotPass")
    private static WebElement lnk_forgotPassword;

    @FindBy(id="com.doral.clinician.android:id/tvSignUp")
    private static WebElement btn_SignupHere;

    @FindBy(id="com.doral.clinician.android:id/pass")
    private static WebElement btn_loginWithPasscode;

    @FindBy(id="com.doral.clinician.android:id/finger")
    private static WebElement btn_loginWithFingerprint;

    @FindBy(id="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    private static WebElement lnk_profile;

    @FindBy(id="com.doral.clinician.android:id/rel_menu")
    private static WebElement icon_menu;

    @FindBy(id="com.doral.clinician.android:id/ll_logout")
    private static WebElement icon_logout;

    @FindBy(id="com.doral.clinician.android:id/tv_ok")
    private static WebElement btn_logoutconfirm_approval;

    @FindBy(id="com.doral.clinician.android:id/tv_cancel")
    private static WebElement btn_logoutconfirm_denial;

    @FindBy(id="com.doral.clinician.android:id/snackbar_text")
    private static WebElement toast_snackbartext;

    public WebElement getTxt_userName(){
        return txt_userName;
    }

    public WebElement getTxt_password(){
        return txt_password;
    }

    public WebElement getBtn_login(){
        return btn_login;
    }
    public WebElement getCheckbox_rememberMe()
    {
        return cb_rememberMe;
    }
    public WebElement getLnk_forgotPassword()
    {
        return lnk_forgotPassword;
    }

    public WebElement getLnk_SignupHere() {
        return btn_SignupHere;
    }

    public WebElement getBtn_loginWithPasscode()
    {
        return btn_loginWithPasscode;
    }

    public WebElement getBtn_loginWithFingerprint()
    {
        return btn_loginWithFingerprint;
    }

    public WebElement getLnk_profile(){
        return lnk_profile;
    }

    public WebElement getIcon_menu(){
        return icon_menu;
    }

    public WebElement getIcon_logout(){
        return icon_logout;
    }

    public WebElement getBtn_logoutconfirm_approval(){
        return btn_logoutconfirm_approval;
    }

    public WebElement getBtn_logoutconfirm_denial(){
        return btn_logoutconfirm_denial;
    }

    public WebElement getToast_snackbartext(){ return toast_snackbartext;
    }
}
