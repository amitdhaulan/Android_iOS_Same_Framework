package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Objects.LoginPageObjects;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMethods {

    public void login(String username, String password) throws InterruptedException {
        LoginPageObjects loginPageObjects = PageFactory.initElements(AppiumController.getDriver(), LoginPageObjects.class);
//        AppiumController.instance.implicitWait();
        loginPageObjects.getTxt_userName().sendKeys(username);
        loginPageObjects.getTxt_password().sendKeys(password);
        loginPageObjects.getBtn_login().click();
        Thread.sleep(5000);
    }
    public void forgotPwdLnkClick(){
        LoginPageObjects loginPageObjects = PageFactory.initElements(AppiumController.getDriver(), LoginPageObjects.class);
//        AppiumController.instance.implicitWait();
        loginPageObjects.getLnk_forgotPassword().click();
    }
    public void loginWithPasscodeBtnClick()    {
        LoginPageObjects loginPageObjects = PageFactory.initElements(AppiumController.getDriver(), LoginPageObjects.class);
//        AppiumController.instance.implicitWait();
        loginPageObjects.getBtn_loginWithPasscode().click();
    }
}