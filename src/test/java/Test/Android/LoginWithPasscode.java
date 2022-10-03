package Test.Android;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Methods.LoginAndChangePasscodeMethods;
import PageObjects_Methods.Android.Methods.LoginPageMethods;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
@Test
public class LoginWithPasscode extends AppiumController {
    public void loginWithPasscodeTest() throws FileNotFoundException {
        LoginPageMethods loginPageMethods = new LoginPageMethods();
        LoginAndChangePasscodeMethods loginAndChangePasscodeMethods = new LoginAndChangePasscodeMethods();

        loginPageMethods.loginWithPasscodeBtnClick();
        loginAndChangePasscodeMethods.loginAndChangePasscode();
        loginAndChangePasscodeMethods.loginAndChangePasscode();
    }
}
