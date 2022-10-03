package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Methods.CreateProfileMethods;
import PageObjects_Methods.iOS.Methods.LoginPageMethods;
import PageObjects_Methods.iOS.Methods.MenuMethods;
import PageObjects_Methods.iOS.Methods.ReferenceDetailsMethods;
import org.testng.annotations.Test;

public class ReferenceDetailsTest extends AppiumController {
    @Test
    public void Reference() throws InterruptedException {
        ReferenceDetailsMethods referenceDetailsMethods=new ReferenceDetailsMethods();
        LoginPageMethods loginPageMethods=new LoginPageMethods();
        MenuMethods menuMethods=new MenuMethods();
        CreateProfileMethods createProfileMethods=new CreateProfileMethods();
        loginPageMethods.loginMethods();
        Thread.sleep(5000);
        menuMethods.BtnMenuClick();
        menuMethods.BtnProfile();
        Thread.sleep(20000);
        createProfileMethods.referenceDetailsClick();
        referenceDetailsMethods.referenceDetailsMethods();
    }
}
