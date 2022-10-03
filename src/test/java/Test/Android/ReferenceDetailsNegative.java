package Test.Android;
import AppiumSupport.*;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.ProfileDetailsObjects;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.util.Iterator;
import static Common.ExcelUtils.getSignUpUserDetails;

//To verify if we don't add minimum 2 references if the reference details through some error or not when we save it.
public class ReferenceDetailsNegative extends AppiumController {
    LoginPageMethods loginPageMethods;
    SignUpPageMethods signUpPageMethods;
    SignUpPageObjects signUpPageObjects;
    ProfileDetailsMethods profileDetailsMethods;
    CreateProfileMethods createProfileMethods;
    LoginAndChangePasscodeMethods loginAndChangePasscodeMethods;
    boolean negativeSwitch = true;
    public void initializeObjects() {
        profileDetailsMethods = new ProfileDetailsMethods();
        createProfileMethods = new CreateProfileMethods();
        loginPageMethods = new LoginPageMethods();
        signUpPageMethods = new SignUpPageMethods();
        signUpPageObjects = new SignUpPageObjects();
        loginAndChangePasscodeMethods = new LoginAndChangePasscodeMethods();
    }
    @Test(dataProvider = "signupData")
    public void referenceDetailsNegative(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ProfileDetailsObjects.class);

        if (negativeSwitch) {
            //Initialize objects
            initializeObjects();

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
            negativeSwitch = false;

        }
        //Clicking on reference details button
        createProfileMethods.BtnReferenceDetailsClick();
        //Completing reference details page
        profileDetailsObjects.getTxt_reference1().sendKeys(signupDetailsPOJO.getReference1());
        profileDetailsObjects.getTxt_reference1_ph_number().sendKeys(signupDetailsPOJO.getReference1PhoneNumber());
        profileDetailsObjects.getTxt_reference1AddressLine1();
        profileDetailsObjects.getTxt_reference1AddressLine2().sendKeys(signupDetailsPOJO.getReference1AddressLine2());
        profileDetailsObjects.getTxt_reference1Apt().sendKeys(signupDetailsPOJO.getReference1Apt());
        profileDetailsObjects.getBtn_reference1Submit().click();
        profileDetailsObjects.getBtn_referenceHaveYouEverBeenBonded_No().click();
        profileDetailsObjects.getBtn_referenceHaveYouEverBeenRefusedABond_No().click();
        profileDetailsObjects.getBtn_referenceHaveYouEverBeenConvicatedOfACrime_No().click();
        profileDetailsObjects.getCb_referenceAgreeTermsAndCondition().click();
        profileDetailsObjects.getBtn_referenceSubmit().click();
    }

    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "reference_details_negative";
        return getSignUpUserDetails(file, sheetName);
    }
}
