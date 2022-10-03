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
import java.io.FileNotFoundException;
import java.util.Iterator;
import static Common.ExcelUtils.getSignUpUserDetails;

//To verify if we enter wrong ECFMG id, page should through error when we submit it

public class DocumentVerificationNegative extends AppiumController {
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
    public void documentVerificationNegative(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException, FileNotFoundException {
        ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ProfileDetailsObjects.class);

        if (negativeSwitch) {
            //Initialize objects
            initializeObjects();
            // this.signupDetailsPOJO = signupDetailsPOJO1;

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
            negativeSwitch = false;
        }

        //Clicking on payroll details button
        createProfileMethods.BtnDocumentVerificationClick();

        //Completing document Verification
        implicitWait();
        FileUploadMethods fileUploadMethods = new FileUploadMethods();
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_idProofFrontUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_idProofBackUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_socialSecurityFrontUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_socialSecurityBackUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_covidVaccineCardUpload());
        profileDetailsObjects.getBtn_cprACLS().click();
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_cprUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_preEmploymentPhysicalUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_currentCVUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_professionalLicenseUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_stateRegistrationCertificateUpload());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_deaLicenseOrControlledSubstance());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_malepracticeCertificate());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_explanationOfAllMalepractice());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_medicalSchoolDiploma());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_residencyCertificate());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_fellowshipCertificate());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_internshipCertificate());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_ECFMGcertificate());
        profileDetailsObjects.getTxt_ECFMGID().sendKeys(signupDetailsPOJO.getDocumentVerificationECFMGID());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_boardCertificate());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_hospitalAffiliationLetter());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_sanctionsQueries());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_medicalWelcomeLetter());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_signedW9());
        fileUploadMethods.fileUpload(profileDetailsObjects.getBtn_signedESignatureForm());
        profileDetailsObjects.getBtn_uploadDocumentSubmit().click();
    }
    @DataProvider
    public static Iterator<Object[]> signupData () {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "document_verification_negative";
        return getSignUpUserDetails(file, sheetName);
    }
}
