package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Methods.LoginPageMethods;
import org.testng.annotations.Test;

public class LoginPageTest extends AppiumController {
    @Test
    public void login() {
        LoginPageMethods loginPageMethods=new LoginPageMethods();
        loginPageMethods.loginMethods();
    }
}
