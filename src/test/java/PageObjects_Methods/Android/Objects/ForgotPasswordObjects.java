package PageObjects_Methods.Android.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordObjects {

    @FindBy(id = "com.doral.clinician.android:id/edtEmail")
    private static WebElement txt_forgot_pwd_emailId;

    @FindBy(id = "com.doral.clinician.android:id/edtNewPW")
    private static WebElement txt_forgot_pwd_newPassword;

    @FindBy(id = "com.doral.clinician.android:id/imagepassword")
    private static WebElement btn_forgot_pwd_newPassword_eye;

    @FindBy(id = "com.doral.clinician.android:id/edtConfirmPW")
    private static WebElement txt_forgot_pwd_confirmPassword;

    @FindBy(id = "com.doral.clinician.android:id/imagepassword1")
    private static WebElement btn_forgot_pwd_confirmPassword_eye;

    @FindBy(id = "com.doral.clinician.android:id/btnSubmit")
    private static WebElement btn_forgot_pwd_submit;

    @FindBy(id ="com.doral.clinician.android:id/img_menu")
    private static WebElement btn_forgot_pwd_back;

    @FindBy(id= "com.doral.clinician.android:id/snackbar_text")
    private static WebElement toast_forgot_pwd_snackbar;

    public WebElement getTxt_forgotPwdEmailId() {
        return txt_forgot_pwd_emailId;
    }

    public WebElement getTxt_forgotPwdNewPassword() {
        return txt_forgot_pwd_newPassword;
    }

    public WebElement getBtn_forgotPwdNewPasswordEye() {
        return btn_forgot_pwd_newPassword_eye;
    }

    public WebElement getTxt_forgotPwdConfirmPassword() {
        return txt_forgot_pwd_confirmPassword;
    }

    public WebElement getBtn_forgotPwdConfirmPasswordEye() {
        return btn_forgot_pwd_confirmPassword_eye;
    }

    public WebElement getBtn_forgotPwdSubmit() {
        return btn_forgot_pwd_submit;
    }

    public WebElement getBtn_forgotPwdBack()
    {
        return btn_forgot_pwd_back;
    }
    public WebElement getToast_forgotPwdSnackBar()
    {
        return toast_forgot_pwd_snackbar;
    }

}