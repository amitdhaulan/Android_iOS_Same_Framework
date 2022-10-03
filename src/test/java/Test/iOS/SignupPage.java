package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Methods.SignUpPageMethods;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class SignupPage extends AppiumController {
    @Test
    public void signupPage() throws FileNotFoundException, InterruptedException {
        SignUpPageMethods signUpPageMethods=new SignUpPageMethods();
        signUpPageMethods.signup();

    }
}
