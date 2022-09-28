package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Objects.CreateProfileObjects;
import org.openqa.selenium.support.PageFactory;

public class CreateProfileMethods {
    CreateProfileObjects createProfileObjects = PageFactory.initElements(AppiumController.getDriver(), CreateProfileObjects.class);

    public void BtnApplicationDetailsClick() {
        createProfileObjects.getBtn_applicationDetails().click();
    }

    public void BtnReferenceDetailsClick() {
        createProfileObjects.getBtn_referenceDetails().click();
    }

    public void BtnEmergencyContactClick() {
        createProfileObjects.getBtn_emergencyContact().click();
    }

    public void BtnEducationDetailsClick() {
        createProfileObjects.getBtn_educationDetails().click();
    }

    public void BtnProfessionalDetailsClick() {createProfileObjects.getBtn_professionalDetails().click();}

    public void BtnPayrollClick() {createProfileObjects.getBtn_payrollDetails().click();}

    public void BtnWorkHistoryClick() {createProfileObjects.getBtn_workHistory().click();}

    public void BtnDocumentVerificationClick() {createProfileObjects.getBtn_documentVerification().click();}
    }
