package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.LoginPageObjects;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMethods {
    public void loginMethods() {
    LoginPageObjects loginPageObjects = PageFactory.initElements(AppiumController.getDriver(), LoginPageObjects.class);
    loginPageObjects.getIos_notification_allow().click();
    loginPageObjects.getIos_location_allow().click();
    loginPageObjects.getIos_txt_userName().sendKeys("amitdoral@yopmail.com");
    loginPageObjects.getIos_keyboard_done().click();
    loginPageObjects.getIos_txt_password().sendKeys("Chetu@123");
    loginPageObjects.getIos_keyboard_done().click();
    loginPageObjects.getIos_btn_login().click();
}
}
