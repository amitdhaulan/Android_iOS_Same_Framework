package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Methods.CreateProfileMethods;
import PageObjects_Methods.iOS.Methods.EmergencyContactMethods;
import PageObjects_Methods.iOS.Methods.LoginPageMethods;
import PageObjects_Methods.iOS.Methods.MenuMethods;
import org.testng.annotations.Test;

public class EmergencyContactTest extends AppiumController {
    @Test
    public static void emergencyContactTest() throws InterruptedException {
        EmergencyContactMethods emergencyContactMethods=new EmergencyContactMethods();
        LoginPageMethods loginPageMethods=new LoginPageMethods();
        MenuMethods menuMethods=new MenuMethods();
        CreateProfileMethods createProfileMethods=new CreateProfileMethods();

        //logging in the application
        loginPageMethods.loginMethods();
        Thread.sleep(5000);

        //Clicking on menu button
        menuMethods.BtnMenuClick();

        //Clicking on profile button
        menuMethods.BtnProfile();

        //Clicking emergency contact button
        Thread.sleep(25000);
        createProfileMethods.emergencyContactClick();

        //Filling emergency contact details
        emergencyContactMethods.emergencyContact();
    }
}
