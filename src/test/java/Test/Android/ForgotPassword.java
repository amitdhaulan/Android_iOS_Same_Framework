package Test.Android;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Methods.ForgotPasswordMethods;
import PageObjects_Methods.Android.Methods.LoginPageMethods;
import org.testng.annotations.Test;

@Test
public class ForgotPassword extends AppiumController {


    public void forgotPasswordTest() {
        ForgotPasswordMethods forgetPasswordMethods = new ForgotPasswordMethods();
        LoginPageMethods loginPageMethods = new LoginPageMethods();

        String email = properties.getProperty("registered_email");
        String password = properties.getProperty("registered_password");
        String confirmPassword = properties.getProperty("registered_password");

        //Clicking on forget password link
        loginPageMethods.forgotPwdLnkClick();

        //Entering details in forget password page and clicking on submit button
        forgetPasswordMethods.forgotPassword(email, password, confirmPassword);
        // Password updated successfully validation
        // Assert.assertEquals(forgotPasswordObjects.getToast_forgotPwdSnackBar().getText(), "Please enter valid email address");
    }
}
