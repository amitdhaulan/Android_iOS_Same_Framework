package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Objects.LoginAndChangePasscodeObjects;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class LoginAndChangePasscodeMethods {
    LoginAndChangePasscodeObjects loginWithPasscodeObjects = PageFactory.initElements(AppiumController.getDriver(), LoginAndChangePasscodeObjects.class);
    public void loginAndChangePasscode() throws FileNotFoundException {

//        loadProperty();
        AppiumController.instance.implicitWait();
        loginWithPasscodeObjects.getbtn_passcodeThree().click();
        loginWithPasscodeObjects.getbtn_passcodeFour().click();
        loginWithPasscodeObjects.getbtn_passcodeFive().click();
        loginWithPasscodeObjects.getbtn_passcodeSix().click();
    }

    public void clickSkipLink() {
        loginWithPasscodeObjects.getSkipLink().click();
    }
}