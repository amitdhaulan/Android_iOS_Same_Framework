package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Objects.ForgotPasswordObjects;
import org.openqa.selenium.support.PageFactory;
public class ForgotPasswordMethods {
    public void forgotPassword(String email, String password, String confirmPassword) {
        ForgotPasswordObjects forgotPasswordObjects = PageFactory.initElements(AppiumController.instance.driver, ForgotPasswordObjects.class);
        AppiumController.instance.implicitWait();
        forgotPasswordObjects.getTxt_forgotPwdEmailId().sendKeys(email);
        forgotPasswordObjects.getTxt_forgotPwdNewPassword().sendKeys(password);
        forgotPasswordObjects.getTxt_forgotPwdConfirmPassword().sendKeys(confirmPassword);
        forgotPasswordObjects.getBtn_forgotPwdSubmit().click();
        /*
        forgotPasswordObjects.getBtn_forgotPwdBack().click();
        forgotPasswordObjects.getBtn_forgotPwdNewPasswordEye();
        forgotPasswordObjects.getBtn_forgotPwdConfirmPasswordEye();
        */
    }
}