package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Methods.ApplicantDetailsMethods;
import PageObjects_Methods.iOS.Methods.CreateProfileMethods;
import PageObjects_Methods.iOS.Methods.LoginPageMethods;
import PageObjects_Methods.iOS.Methods.MenuMethods;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ApplicantDetailsTest extends AppiumController {
    @Test
    public void applicantDetailsTest() throws FileNotFoundException, InterruptedException {
        ApplicantDetailsMethods applicantDetailsMethods=new ApplicantDetailsMethods();
        CreateProfileMethods createProfileMethods=new CreateProfileMethods();
        MenuMethods menuMethods=new MenuMethods();
        LoginPageMethods loginPageMethods=new LoginPageMethods();
        loginPageMethods.loginMethods();
        Thread.sleep(5000);
        menuMethods.BtnMenuClick();
        menuMethods.BtnProfile();
        Thread.sleep(20000);
        createProfileMethods.applicantDetailsClick();
        applicantDetailsMethods.applicantDetails();
    }
}
