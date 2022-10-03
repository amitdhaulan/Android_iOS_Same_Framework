package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.LoginPageObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageNegative extends AppiumController {
    @Test
    public void loginPageNegative() throws InterruptedException {

        LoginPageObjects loginPageObjects = PageFactory.initElements(AppiumController.getDriver(),LoginPageObjects.class);
        loginPageObjects.getIos_notification_allow().click();
        loginPageObjects.getIos_location_allow().click();
        loginPageObjects.getIos_txt_userName().sendKeys("amitdoral@yopmail");
        loginPageObjects.getIos_keyboard_done().click();
        loginPageObjects.getIos_txt_password().sendKeys("Chetu@123");
        loginPageObjects.getIos_keyboard_done().click();
        loginPageObjects.getIos_btn_login().click();
        Thread.sleep(3000);
        loginPageObjects.getIos_btn_wrong_input_ok().click();
    }
}
