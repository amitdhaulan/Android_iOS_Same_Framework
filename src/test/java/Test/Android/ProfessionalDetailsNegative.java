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

//To verify if we don't enter Federal DEA details and NPI details, professional details get saved or not
public class ProfessionalDetailsNegative extends AppiumController {
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
    public void professionalDetailsNegative(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ProfileDetailsObjects.class);

        if (negativeSwitch) {
            //Initialize objects
            initializeObjects();
            // this.signupDetailsPOJO = signupDetailsPOJO1;

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
            negativeSwitch = false;
        }

        //Clicking on professional details button
        createProfileMethods.BtnProfessionalDetailsClick();

        //Completing Professional Details

        //Completing medicare enrolled
        profileDetailsObjects.getBtn_professionalDetailsMedicareEnrolled_Yes().click();
        profileDetailsObjects.getDD_professionalDetailsMedicareEnrolledState();
        profileDetailsObjects.getTxt_professionalDetailsMedicareNumber().sendKeys(signupDetailsPOJO.getProfessionalSsn());

        //Completing medicaid enrolled
        profileDetailsObjects.getBtn_professionalDetailsMedicaid_Yes().click();
        profileDetailsObjects.getBtn_professionalDetailsMedicaidState();
        profileDetailsObjects.getBtn_professionalDetailsMedicaidNumber().sendKeys(signupDetailsPOJO.getProfessionalSsn());

        //Completing age ranges treated
        profileDetailsObjects.getCb_professionalDetailsAge18().click();

        //Completing state licenses
        profileDetailsObjects.getBtn_professionalDetailsStateLicenses().click();
        profileDetailsObjects.getBtn_professionalDetailsStateLicensesState();
        profileDetailsObjects.getBtn_professionalDetailsStateLicenseNumber().sendKeys(signupDetailsPOJO.getProfessionalSsn());
        profileDetailsObjects.getDD_professionalDetailsStateLicenseCategories();
        profileDetailsObjects.getBtn_professionalDetailsStateLicensesSave().click();

        //Completing board certificate
        profileDetailsObjects.getBtn_professionalDetailsBoardCertificate().click();
        profileDetailsObjects.getdD_professionalDetailsBoardCertifying();
        profileDetailsObjects.getBtn_professionalDetailsBoardCertificated_Yes().click();
        profileDetailsObjects.getBtn_professionalDetailsBoardEligible_Yes().click();
        profileDetailsObjects.getBtn_professionalDetailsBoardCertificateSave().click();


        //Completing CAQH
        profileDetailsObjects.getTxt_professionalDetailsCaqhId().sendKeys(signupDetailsPOJO.getProfessionalSsn());
        profileDetailsObjects.getTxt_professionalDetailsCaqhUser().sendKeys(signupDetailsPOJO.getProfessionalName());
        profileDetailsObjects.getTxt_professionalDetailsCaqhPass().sendKeys(signupDetailsPOJO.getProfessionalPassword());

        //Clicking on Professional Details save
        profileDetailsObjects.getTxt_professionalDetailsSave().click();
    }
    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "education_details_negative";
        return getSignUpUserDetails(file, sheetName);
    }
}
