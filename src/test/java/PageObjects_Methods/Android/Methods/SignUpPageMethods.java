package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import Common.ScrollPage;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageMethods {
    SignUpPageObjects signUpPageObjects = PageFactory.initElements(AppiumController.getDriver(), SignUpPageObjects.class);
    ScrollPage scroll = new ScrollPage();
    public void signup(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
//        loadProperty();
        AppiumController.instance.implicitWait();
        signUpPageObjects.getLink_signup().click();
        signUpPageObjects.getTxt_firstName().sendKeys(signupDetailsPOJO.getRegisterFirstname());
        signUpPageObjects.getTxt_lastName().sendKeys(signupDetailsPOJO.getRegisterLastname());
        signUpPageObjects.getTxt_email().sendKeys(signupDetailsPOJO.getRegisterEmail());
        signUpPageObjects.getTxt_cellPhone().sendKeys(String.valueOf(signupDetailsPOJO.getRegisterCellphone()));
        signUpPageObjects.getDd_gender();
        signUpPageObjects.getCal_dob();
        signUpPageObjects.getDd_speciality();
        scroll.scroll();
        AppiumController.getDriver().wait(1000);
        signUpPageObjects.getTxt_password().sendKeys(signupDetailsPOJO.getRegisterPassword());
        signUpPageObjects.getTxt_confirmPassword().sendKeys(signupDetailsPOJO.getRegisterConfirmpassword());
        signUpPageObjects.getCb_doralConnect().click();
        signUpPageObjects.getCb_roadL().click();
        signUpPageObjects.getBtn_signup().click();
    }

    public String getRegToastText(){
        return signUpPageObjects.getToast_snackbar().getText();
    }
    public void clickBackButton(){
        signUpPageObjects.getBtn_back().click();
    }
}