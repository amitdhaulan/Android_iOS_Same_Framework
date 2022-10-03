package Test.Android;

import AppiumSupport.*;
import Common.CustomListener;
import PageObjects_Methods.Android.Methods.DashboardPageMethods;
import PageObjects_Methods.Android.Objects.LoginDetailsPOJO;
import PageObjects_Methods.Android.Methods.LoginPageMethods;
import PageObjects_Methods.Android.Objects.LoginPageObjects;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Iterator;

import static Common.ExcelUtils.getLoginUserDetails;

@Listeners(CustomListener.class)
public class Login extends AppiumController {

    @Test(dataProvider = "loginCredentials", priority = 1)
    public void login(LoginDetailsPOJO loginDetailsPOJO) throws InterruptedException {
        LoginPageMethods loginPageMethods = new LoginPageMethods();
        LoginPageObjects loginPageObjects = new LoginPageObjects();

        if (loginDetailsPOJO.getExpectedResult().contains("menu icon")) {
            DashboardPageMethods dashboardPageMethods = new DashboardPageMethods();
            loginPageMethods.login(loginDetailsPOJO.getUsername(), loginDetailsPOJO.getPassword());
            loginPageObjects.getIcon_menu().click();
            boolean menuIcon = dashboardPageMethods.isElementDisplayed();
            loginPageObjects.getIcon_logout().click();
            loginPageObjects.getBtn_logoutconfirm_approval().click();
            Assert.assertEquals(menuIcon, true);
        } else {
            loginPageMethods.login(loginDetailsPOJO.getUsername(), loginDetailsPOJO.getPassword());
            Assert.assertEquals(loginPageObjects.getBtn_login().isDisplayed(), true);
        }
    }

    @DataProvider
    public static Iterator<Object[]> loginCredentials() throws Exception {
        File file = new File(".\\src\\main\\resources\\excel_files\\LoginCredentials.xlsx");
        String sheetName = "LoginData";

        return getLoginUserDetails(file, sheetName);

    }
}