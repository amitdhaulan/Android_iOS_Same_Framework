package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import AppiumSupport.FileUploadMethods;
import PageObjects_Methods.Android.Objects.ProfileDetailsObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class ProfileDetailsMethods {
    ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ProfileDetailsObjects.class);
    FileUploadMethods fileUploadMethods = new FileUploadMethods();

    /*******************Applicant details methods*******************/
    public void applicantDetails(SignupDetailsPOJO signupDetailsPOJO) throws FileNotFoundException {
        AppiumController.instance.implicitWait();

        profileDetailsObjects.getTxt_homePhone().sendKeys(signupDetailsPOJO.getApplicationalHomePhone());
        profileDetailsObjects.getTxt_ssn().sendKeys(signupDetailsPOJO.getApplicationalSsn());
        profileDetailsObjects.getBtn_usCitizenYes().click();
        profileDetailsObjects.getTxt_passportId().sendKeys(signupDetailsPOJO.getApplicationalPassportid());
        fileUploadMethods.fileUpload(profileDetailsObjects.getLnk_uploadDocument());
        profileDetailsObjects.getDd_ethnicity();
        profileDetailsObjects.getDate_dateYouCanStartWork();
        profileDetailsObjects.getBtn_currentAddress().click();
        profileDetailsObjects.getTxt_addressLine1(signupDetailsPOJO.getApplicationalAddress1());
        profileDetailsObjects.getTxt_addressLine2(signupDetailsPOJO.getApplicationalAddress2());
        profileDetailsObjects.getTxt_apt();
        profileDetailsObjects.clickDdAddress();
        profileDetailsObjects.getTxt_priorAddress1(signupDetailsPOJO.getApplicationalPriorAddress1());
        profileDetailsObjects.getTxt_priorAddress2(signupDetailsPOJO.getApplicationalPriorAddress2());
        profileDetailsObjects.getTxt_priorApt(signupDetailsPOJO.getApplicationalPriorApt());
        profileDetailsObjects.getBtn_save().click();
    }


    /********************Reference details methods********************/
    public void reference(SignupDetailsPOJO signupDetailsPOJO) {
        AppiumController.instance.implicitWait();
        int i = 0;
        do {
            profileDetailsObjects.getTxt_reference1().sendKeys(signupDetailsPOJO.getReference1());
            profileDetailsObjects.getTxt_reference1_ph_number().sendKeys(signupDetailsPOJO.getReference1PhoneNumber());
            profileDetailsObjects.getTxt_reference1AddressLine1();
            profileDetailsObjects.getTxt_reference1AddressLine2().sendKeys(signupDetailsPOJO.getReference1AddressLine2());
            profileDetailsObjects.getTxt_reference1Apt().sendKeys(signupDetailsPOJO.getReference1Apt());
            profileDetailsObjects.getBtn_reference1Submit().click();
            i++;
            if (i == 1) {
                profileDetailsObjects.getBtn_referenceAddAReference().click();
            }
        } while (i == 1);

        profileDetailsObjects.getBtn_referenceHaveYouEverBeenBonded_No().click();
        profileDetailsObjects.getBtn_referenceHaveYouEverBeenRefusedABond_No().click();
        profileDetailsObjects.getBtn_referenceHaveYouEverBeenConvicatedOfACrime_No().click();
        profileDetailsObjects.getCb_referenceAgreeTermsAndCondition().click();
        profileDetailsObjects.getBtn_referenceSubmit().click();
    }

    /********************Emergency details methods********************/
    public void emergencyContact(SignupDetailsPOJO signupDetailsPOJO) {
        AppiumController.instance.implicitWait();
        profileDetailsObjects.getTxt_emergencyContact1Name().sendKeys(signupDetailsPOJO.getEmergencyName());
        profileDetailsObjects.getTxt_emergencyContact1PhNumber().sendKeys(signupDetailsPOJO.getEmergencyPhone());
        profileDetailsObjects.getTxt_emergencyContact1AddressLine1();
        profileDetailsObjects.getTxt_emergencyContact1AddressLine2().sendKeys(signupDetailsPOJO.getEmergencyAddress());
        profileDetailsObjects.getTxt_emergencyContact1Apt().sendKeys(signupDetailsPOJO.getEmergencyApt());
        profileDetailsObjects.getDd_emergencyContact1Relationship();
        profileDetailsObjects.getBtn_emergencyContact1Submit().click();
        profileDetailsObjects.getBtn_emergencyContactSubmit().click();
        /*profileDetailsObjects.getBtn_emergencyContactAddContact().click();*/
    }

    /********************Education details methods********************/
    public void educationDetails(SignupDetailsPOJO signupDetailsPOJO) {
        AppiumController.instance.implicitWait();

        //filling medical institute
        profileDetailsObjects.getBtn_medicalInstitute().click();
        profileDetailsObjects.getTxt_medicalInstituteName().sendKeys(signupDetailsPOJO.getEducationInstituteName());
        profileDetailsObjects.getTxt_medicalInstituteAddress1();
        profileDetailsObjects.getTxt_medicalInstituteAddress2().sendKeys(signupDetailsPOJO.getEducationAddrss2());
        profileDetailsObjects.getTxt_medicalInstituteApt().sendKeys(signupDetailsPOJO.getEducationApt());
        profileDetailsObjects.getDd_medicalInstituteYearStarted();
        profileDetailsObjects.getDd_medicalInstituteYearCompleted();
        profileDetailsObjects.getBtn_medicalInstituteSave().click();

        //filling residency institute
        profileDetailsObjects.getBtn_residencyInstitute().click();
        profileDetailsObjects.getTxt_residencyInstituteName().sendKeys(signupDetailsPOJO.getEducationInstituteName());
        profileDetailsObjects.getTxt_residencyAddress1();
        profileDetailsObjects.getTxt_residencyAddress2().sendKeys(signupDetailsPOJO.getEducationAddrss2());
        profileDetailsObjects.getTxt_residencyApt().sendKeys(signupDetailsPOJO.getEducationApt());
        profileDetailsObjects.getDd_residencyYearStarted();
        profileDetailsObjects.getDd_residencyYearCompleted();
        profileDetailsObjects.getBtn_residencySave().click();

        //filing fellowship institute
        profileDetailsObjects.getBtn_fellowshipInstitute().click();
        profileDetailsObjects.getTxt_fellowshipInstituteName().sendKeys(signupDetailsPOJO.getEducationInstituteName());
        profileDetailsObjects.getTxt_fellowshipAddress1();
        profileDetailsObjects.getTxt_fellowshipAddress2().sendKeys(signupDetailsPOJO.getEducationAddrss2());
        profileDetailsObjects.getTxt_fellowshipApt().sendKeys(signupDetailsPOJO.getEducationApt());
        profileDetailsObjects.getTxt_fellowshipProgramName().sendKeys(signupDetailsPOJO.getEducationFellowshipProgramName());
        profileDetailsObjects.getTxt_fellowshipYearStarted();
        profileDetailsObjects.getTxt_fellowshipYearCompleted();
        profileDetailsObjects.getTxt_fellowshipSave().click();

        //clicking on education details submit button
        profileDetailsObjects.getBtn_educationDetailsSubmit().click();
    }

    /********************Professional details methods********************/
    public void professionalDetails(SignupDetailsPOJO signupDetailsPOJO) {
        AppiumController.instance.implicitWait();

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

        //Completing Federal DEA
        profileDetailsObjects.getTxt_professionalDetailsFederalDeaId().sendKeys(signupDetailsPOJO.getProfessionalSsn());
        profileDetailsObjects.getCal_professionalDetailsFederalDeaExpireMonthYear();

        //Completing NPI
        profileDetailsObjects.getTxt_professionalDetailsNpiNumber().sendKeys(signupDetailsPOJO.getProfessionalSsn());
        profileDetailsObjects.getDD_professionalDetailsNpiType();
        profileDetailsObjects.getTxt_professionalDetailsNpiAddress1();
        profileDetailsObjects.getTxt_professionalDetailsNpiAddress2().sendKeys(signupDetailsPOJO.getProfessionalAddress2());
        profileDetailsObjects.getTxt_professionalDetailsNpiApt().sendKeys(signupDetailsPOJO.getProfessionalApt());
        profileDetailsObjects.getTxt_professionalDetailsNpiTaxonomy().sendKeys(signupDetailsPOJO.getProfessionalName());

        //Completing CAQH
        profileDetailsObjects.getTxt_professionalDetailsCaqhId().sendKeys(signupDetailsPOJO.getProfessionalSsn());
        profileDetailsObjects.getTxt_professionalDetailsCaqhUser().sendKeys(signupDetailsPOJO.getProfessionalName());
        profileDetailsObjects.getTxt_professionalDetailsCaqhPass().sendKeys(signupDetailsPOJO.getProfessionalPassword());

        //Clicking on Professional Details save
        profileDetailsObjects.getTxt_professionalDetailsSave().click();
    }

    /********************WorkHistory details methods********************/
    public void workHistory(SignupDetailsPOJO signupDetailsPOJO) {
        AppiumController.instance.implicitWait();
        AppiumController.instance.implicitWait();
        profileDetailsObjects.getBtn_areYouCurrentlyEmployed_Yes().click();
        profileDetailsObjects.getBtn_addCurrentEmployer().click();
        profileDetailsObjects.getTxt_addCurrentEmployerName().sendKeys(signupDetailsPOJO.getWorkHistoryName());
        profileDetailsObjects.getTxt_addCurrentEmployerPosition().sendKeys(signupDetailsPOJO.getWorkHistoryPosition());
        profileDetailsObjects.getTxt_addCurrentEmployerAddress1();
        profileDetailsObjects.getTxt_addCurrentEmployerAddress2().sendKeys(signupDetailsPOJO.getWorkHistoryAddress2());
        profileDetailsObjects.getTxt_addCurrentEmployerApt().sendKeys(signupDetailsPOJO.getWorkHistoryApt());
        profileDetailsObjects.getDd_addCurrentEmployerYearStarted();
        profileDetailsObjects.getBtn_addCurrentEmployerSubmit().click();
        profileDetailsObjects.getBtn_workHistorySubmit().click();
    }

    /*******************Payroll details methods********************/
    public void payroll(SignupDetailsPOJO signupDetailsPOJO) {
        AppiumController.instance.implicitWait();
        profileDetailsObjects.getBtn_payrollDetailsMarried().click();
        profileDetailsObjects.getTxt_payrollDetailsDependentsUnder17().sendKeys(signupDetailsPOJO.getPayrollDependentsUnder17());
        profileDetailsObjects.getTxt_payrollDetailsOtherDependents().sendKeys(signupDetailsPOJO.getPayrollOtherDependents());
        profileDetailsObjects.getBtn_payrollDetailsUploadW4Docs();
        //profileDetailsObjects.getBtn_payrollDetailsBankDetails().click();
        profileDetailsObjects.getDd_payrollDetailsBankName();
        //profileDetailsObjects.getTxt_payrollDetailsAccountHolderName().sendKeys("abc");
        profileDetailsObjects.getBtn_payrollDetailsAccountTypeChecking().click();
        profileDetailsObjects.getBtn_payrollDetailsAccountTypeSaving().click();
        profileDetailsObjects.getDd_payrollDetailsBankRoutingNumber();
        profileDetailsObjects.getTxt_payrollDetailsBankAccountNumber().sendKeys(signupDetailsPOJO.getPayrollAccountNumber());
        profileDetailsObjects.getTxt_payrollDetailsConfirmAccountNumber().sendKeys(signupDetailsPOJO.getPayrollConfirmAccountNumber());
        profileDetailsObjects.getBtn_payrollDetailsTaxInfoNo().click();
        profileDetailsObjects.getBtn_payrollDetailsSave().click();
    }

    /*******************Document Verification  methods********************/
    public void documentVerification(SignupDetailsPOJO signupDetailsPOJO) throws FileNotFoundException {
        AppiumController.instance.implicitWait();
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
}