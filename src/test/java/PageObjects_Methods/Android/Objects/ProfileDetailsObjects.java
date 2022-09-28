package PageObjects_Methods.Android.Objects;

import AppiumSupport.AppiumController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static AppiumSupport.AppiumController.properties;


public class ProfileDetailsObjects {

    /*******************Applicant details objects*******************/
    @FindBy(id = "com.doral.clinician.android:id/img_back")
    private static WebElement btn_applicantDetailsBack;
    @FindBy(id = "com.doral.clinician.android:id/edt_first_name")
    private static WebElement txt_firstName;

    @FindBy(id = "com.doral.clinician.android:id/edt_last_name")
    private static WebElement txt_lastName;

    @FindBy(id = "com.doral.clinician.android:id/edt_phone_number")
    private static WebElement txt_cellPhone;

    @FindBy(id = "com.doral.clinician.android:id/edt_home_phone")
    private static WebElement txt_homePhone;

    @FindBy(id = "com.doral.clinician.android:id/edt_ssn_number")
    private static WebElement txt_ssn;

    @FindBy(id = "com.doral.clinician.android:id/tv_date_birth")
    private static WebElement date_dob;

    @FindBy(id = "com.doral.clinician.android:id/rb_yes")
    private static WebElement btn_usCitizenYes;

    @FindBy(id = "com.doral.clinician.android:id/rb_no")
    private static WebElement btn_usCitizenNo;

    @FindBy(id = "com.doral.clinician.android:id/edt_passport_number")
    private static WebElement txt_passportId;

    @FindBy(id = "com.doral.clinician.android:id/lin_upload")
    private static WebElement lnk_uploadDocument;

    @FindBy(id = "com.doral.clinician.android:id/tv_ethnicity")
    private static WebElement dd_ethnicity;

    @FindBy(id = "com.doral.clinician.android:id/tv_start_work_date")
    private static WebElement date_dateYouCanStartWork;

    @FindBy(id = "com.doral.clinician.android:id/rlAddress")
    private static WebElement btn_currentAddress;

    @FindBy(id = "com.doral.clinician.android:id/edtAddress1")
    private static WebElement txt_addressLine1;

    @FindBy(id = "com.doral.clinician.android:id/edtAddress2")
    private static WebElement txt_addressLine2;

    @FindBy(id = "com.doral.clinician.android:id/edt_building_apt")
    private static WebElement txt_apt;

    @FindBy(id = "com.doral.clinician.android:id/tvCity")
    private static WebElement txt_city;

    @FindBy(id = "com.doral.clinician.android:id/tvState")
    private static WebElement txt_state;

    @FindBy(id = "com.doral.clinician.android:id/edtZipCode")
    private static WebElement txt_zipcode;

    @FindBy(id = "com.doral.clinician.android:id/tvSignUpGender")
    private static WebElement dropdown_lengthOfAtAboveAddress;

    @FindBy(id = "com.doral.clinician.android:id/tvSignUpGender")
    private static WebElement btn_priorAddress;

    @FindBy(id = "com.doral.clinician.android:id/edt_prior_Address1")
    private static WebElement txt_priorAddress1;

    @FindBy(id = "com.doral.clinician.android:id/edt_prior_Address2")
    private static WebElement txt_priorAddress2;

    @FindBy(id = "com.doral.clinician.android:id/edt_building_apt1")
    private static WebElement txt_priorApt;

    @FindBy(id = "com.doral.clinician.android:id/tvPriorCity")
    private static WebElement txt_priorCity;

    @FindBy(id = "com.doral.clinician.android:id/tvpriorState")
    private static WebElement txt_priorState;

    @FindBy(id = "com.doral.clinician.android:id/edtPriorZipCode")
    private static WebElement txt_priorZipcode;

    @FindBy(id = "com.doral.clinician.android:id/tv_next")
    private static WebElement btn_save;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private static WebElement btn_permission;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private static WebElement btn_allow;

    @FindBy(id = "com.doral.clinician.android:id/tv_gallery")
    private static WebElement btn_gallery;

    @FindBy(id = "com.doral.clinician.android:id/yes")
    private static WebElement btn_applicantDetailsErrorOk;

    public void getBtn_applicantDetailsErrorOkClick() {
        btn_applicantDetailsErrorOk.click();
    }

    public void getBtn_clickApplicantDetailsBack() {
        btn_applicantDetailsBack.click();
    }

    public WebElement getTxt_firstName() {
        return txt_firstName;
    }

    public WebElement getTxt_lastName() {
        return txt_lastName;
    }

    public WebElement getTxt_cellPhone() {
        return txt_cellPhone;
    }

    public WebElement getTxt_homePhone() {
        return txt_homePhone;
    }

    public WebElement getTxt_ssn() {
        return txt_ssn;
    }

    public WebElement getDate_dob() {
        return date_dob;
    }

    public WebElement getBtn_usCitizenYes() {
        return btn_usCitizenYes;
    }

    public WebElement getBtn_usCitizenNo() {
        return btn_usCitizenNo;
    }

    public WebElement getTxt_passportId() {
        return txt_passportId;
    }

    public WebElement getLnk_uploadDocument() {
        return lnk_uploadDocument;
    }

    public void getDd_ethnicity() {
        dd_ethnicity.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]\n")).click();
    }

    public void getDate_dateYouCanStartWork() {
        date_dateYouCanStartWork.click();
        AppiumController.getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"07 August 2022\"]"));
        AppiumController.getDriver().findElement(By.id("android:id/button1")).click();
    }

    public WebElement getBtn_currentAddress() {
        return btn_currentAddress;
    }

    public void getTxt_addressLine1(String address) {
        txt_addressLine1.click();
//        String address1 = properties.getProperty("address1");
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(address);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    }

    public void getTxt_addressLine2(String address) {
//        String address2 = properties.getProperty("address2");
        txt_addressLine2.sendKeys(address);
    }

    public void getTxt_apt() {
        String apt1 = properties.getProperty("apt1");
        txt_apt.sendKeys(apt1);
    }

    public WebElement getTxt_city() {
        return txt_city;
    }

    public WebElement getTxt_state() {
        return txt_state;
    }

    public WebElement getTxt_zipcode() {
        return txt_zipcode;
    }

    public void clickDdAddress() {
        dropdown_lengthOfAtAboveAddress.click();
        WebElement time = AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
        time.click();
    }

    public WebElement getBtn_priorAddress() {
        return btn_priorAddress;
    }

    public void getTxt_priorAddress1(String priorAddress) {
//        String prior_address1 = properties.getProperty("prior_address1");
        txt_priorAddress1.click();
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(priorAddress);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView[2]")).click();
    }

    public void getTxt_priorAddress2(String priorAddress) {
//        String prior_address2 = properties.getProperty("prior_address2");
        txt_priorAddress2.sendKeys(priorAddress);
    }

    public void getTxt_priorApt(String priorApt) {
//        String prior_apt = properties.getProperty("prior_apt");
        txt_priorApt.sendKeys(priorApt);
    }

    public WebElement getTxt_priorCity() {
        return txt_priorCity;
    }

    public WebElement getTxt_priorState() {
        return txt_priorState;
    }

    public WebElement getTxt_priorZipcode() {
        return txt_priorZipcode;
    }

    public WebElement getBtn_save() {
        return btn_save;
    }

    public WebElement getBtn_permission() {
        return btn_permission;
    }

    public WebElement getBtn_allow() {
        return btn_allow;
    }

    public WebElement getBtn_gallery() {
        return btn_gallery;
    }

    /********************Reference details objects********************/
    @FindBy(id = "com.doral.clinician.android:id/add_reference")
    private static WebElement btn_referenceAddAReference;

    @FindBy(id = "com.doral.clinician.android:id/rb_bonded_yes")
    private static WebElement btn_referenceHaveYouEverBeenBonded_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rb_bonded_no")
    private static WebElement btn_referenceHaveYouEverBeenBonded_No;

    @FindBy(id = "com.doral.clinician.android:id/rb_refused_yes")
    private static WebElement btn_referenceHaveYouEverBeenRefusedABond_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rb_refused_no")
    private static WebElement btn_referenceHaveYouEverBeenRefusedABond_No;

    @FindBy(id = "com.doral.clinician.android:id/rb_crime_yes")
    private static WebElement btn_referenceHaveYouEverBeenConvicatedOfACrime_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rb_crime_no")
    private static WebElement btn_referenceHaveYouEverBeenConvicatedOfACrime_No;

    @FindBy(id = "com.doral.clinician.android:id/cb_agree")
    private static WebElement cb_referenceAgreeTermsAndCondition;

    @FindBy(id = "com.doral.clinician.android:id/tv_next")
    private static WebElement btn_referenceSubmit;

    @FindBy(id = "com.doral.clinician.android:id/edt_name")
    private static WebElement txt_reference1;

    @FindBy(id = "com.doral.clinician.android:id/edt_phone_number")
    private static WebElement txt_reference1PhNumber;

    @FindBy(id = "com.doral.clinician.android:id/edt_address")
    private static WebElement txt_reference1AddressLine1;

    @FindBy(id = "com.doral.clinician.android:id/edt_address1")
    private static WebElement txt_reference1AddressLine2;

    @FindBy(id = "com.doral.clinician.android:id/edt_building_apt")
    private static WebElement txt_reference1Apt;

    @FindBy(id = "com.doral.clinician.android:id/tvCity")
    private static WebElement txt_reference1City;

    @FindBy(id = "com.doral.clinician.android:id/tvState")
    private static WebElement txt_reference1State;

    @FindBy(id = "com.doral.clinician.android:id/edtZipCode")
    private static WebElement txt_reference1ZipCode;

    @FindBy(id = "com.doral.clinician.android:id/tvSubmit")
    private static WebElement btn_reference1Submit;

    @FindBy(id="com.doral.clinician.android:id/img_back")
    private static WebElement btn_referenceBack;

    public WebElement getBtn_referenceAddAReference() {
        return btn_referenceAddAReference;
    }

    public WebElement getBtn_referenceHaveYouEverBeenBonded_Yes() {
        return btn_referenceHaveYouEverBeenBonded_Yes;
    }

    public WebElement getBtn_referenceHaveYouEverBeenBonded_No() {
        return btn_referenceHaveYouEverBeenBonded_No;
    }

    public WebElement getBtn_referenceHaveYouEverBeenRefusedABond_Yes() {
        return btn_referenceHaveYouEverBeenRefusedABond_Yes;
    }

    public WebElement getBtn_referenceHaveYouEverBeenRefusedABond_No() {
        return btn_referenceHaveYouEverBeenRefusedABond_No;
    }

    public WebElement getBtn_referenceHaveYouEverBeenConvicatedOfACrime_Yes() {
        return btn_referenceHaveYouEverBeenConvicatedOfACrime_Yes;
    }

    public WebElement getBtn_referenceHaveYouEverBeenConvicatedOfACrime_No() {
        return btn_referenceHaveYouEverBeenConvicatedOfACrime_No;
    }

    public WebElement getCb_referenceAgreeTermsAndCondition() {
        return cb_referenceAgreeTermsAndCondition;
    }

    public WebElement getBtn_referenceSubmit() {
        return btn_referenceSubmit;
    }

    public WebElement getTxt_reference1() {
        return txt_reference1;
    }

    public WebElement getTxt_reference1_ph_number() {
        return txt_reference1PhNumber;
    }

    public void getTxt_reference1AddressLine1() {
        txt_reference1AddressLine1.click();
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys("Noida");
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();
    }

    public WebElement getTxt_reference1AddressLine2() {
        return txt_reference1AddressLine2;
    }

    public WebElement getTxt_reference1Apt() {
        return txt_reference1Apt;
    }

    public WebElement getTxt_reference1City() {
        return txt_reference1City;
    }

    public WebElement getTxt_reference1State() {
        return txt_reference1State;
    }

    public WebElement getTxt_reference1ZipCode() {
        return txt_reference1ZipCode;
    }

    public WebElement getBtn_reference1Submit() {
        return btn_reference1Submit;
    }

    public WebElement getBtn_referenceBack() {
        return btn_referenceBack;
    }

    /********************Emergency details objects********************/
    @FindBy(id = "com.doral.clinician.android:id/edt_name")
    private static WebElement txt_emergencyContact1Name;

    @FindBy(id = "com.doral.clinician.android:id/edt_phone_number")
    private static WebElement txt_emergencyContact1PhNumber;

    @FindBy(id = "com.doral.clinician.android:id/edt_address")
    private static WebElement txt_emergencyContact1AddressLine1;

    @FindBy(id = "com.doral.clinician.android:id/edt_address1")
    private static WebElement txt_emergencyContact1AddressLine2;

    @FindBy(id = "com.doral.clinician.android:id/edt_building_apt")
    private static WebElement txt_emergencyContact1Apt;

    @FindBy(id = "com.doral.clinician.android:id/tvCity")
    private static WebElement txt_emergencyContact1City;

    @FindBy(id = "com.doral.clinician.android:id/tvState")
    private static WebElement txt_emergencyContact1State;

    @FindBy(id = "com.doral.clinician.android:id/edtZipCode")
    private static WebElement txt_emergencyContact1Zipcode;

    @FindBy(id = "com.doral.clinician.android:id/edt_relation")
    private static WebElement dd_emergencyContact1Relationship;

    @FindBy(id = "com.doral.clinician.android:id/tvSubmit")
    private static WebElement btn_emergencyContact1Submit;

    @FindBy(id = "com.doral.clinician.android:id/tv_next")
    private static WebElement btn_emergencyContactSubmit;

    @FindBy(id = "com.doral.clinician.android:id/add_reference")
    private static WebElement btn_emergencyContactAddContact;


    @FindBy(id = "com.doral.clinician.android:id/img_back")
    private static WebElement btn_emergencyContactBack;


    public WebElement getTxt_emergencyContact1Name() {
        return txt_emergencyContact1Name;
    }

    public WebElement getTxt_emergencyContact1PhNumber() {
        return txt_emergencyContact1PhNumber;
    }

    public void getTxt_emergencyContact1AddressLine1() {
        txt_emergencyContact1AddressLine1.click();
        String address1 = properties.getProperty("address1");
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(address1);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_emergencyContact1AddressLine2() {
        return txt_emergencyContact1AddressLine2;
    }

    public WebElement getTxt_emergencyContact1Apt() {
        return txt_emergencyContact1Apt;
    }

    public WebElement getTxt_emergencyContact1City() {
        return txt_emergencyContact1City;
    }

    public WebElement getTxt_emergencyContact1State() {
        return txt_emergencyContact1State;
    }

    public WebElement getTxt_emergencyContact1Zipcode() {
        return txt_emergencyContact1Zipcode;
    }

    public void getDd_emergencyContact1Relationship() {
        dd_emergencyContact1Relationship.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
    }

    public WebElement getBtn_emergencyContact1Submit() {
        return btn_emergencyContact1Submit;
    }

    public WebElement getBtn_emergencyContactSubmit() {
        return btn_emergencyContactSubmit;
    }

    public WebElement getBtn_emergencyContactAddContact() {
        return btn_emergencyContactAddContact;
    }

    public WebElement getBtn_emergencyContactBack() {
        return btn_emergencyContactBack;
    }

    /********************Education details objects********************/
    @FindBy(id = "com.doral.clinician.android:id/relMedicalInstitute")
    private WebElement btn_medicalInstitute;

    @FindBy(id = "com.doral.clinician.android:id/relResidencyInstitute")
    private WebElement btn_residencyInstitute;

    @FindBy(id = "com.doral.clinician.android:id/relFellowshipInstitute")
    private WebElement btn_fellowshipInstitute;

    @FindBy(id = "com.doral.clinician.android:id/tvNext")
    private WebElement btn_educationDetailsSubmit;

    @FindBy(id = "com.doral.clinician.android:id/edtMedicalInstituteName")
    private WebElement txt_medicalInstituteName;

    @FindBy(id = "com.doral.clinician.android:id/edtInstituteAddress")
    private WebElement txt_medicalInstituteAddress1;

    @FindBy(id = "com.doral.clinician.android:id/edtInstituteAddressLine2")
    private WebElement txt_medicalInstituteAddress2;

    @FindBy(id = "com.doral.clinician.android:id/edtApt")
    private WebElement txt_medicalInstituteApt;

    @FindBy(id = "com.doral.clinician.android:id/tvCity")
    private WebElement txt_medicalInstituteCity;

    @FindBy(id = "com.doral.clinician.android:id/tvState")
    private WebElement txt_medicalInstituteState;

    @FindBy(id = "com.doral.clinician.android:id/edtZipCode")
    private WebElement txt_medicalInstituteZipCode;

    @FindBy(id = "com.doral.clinician.android:id/tvStartedYear")
    private WebElement dd_medicalInstituteYearStarted;

    @FindBy(id = "com.doral.clinician.android:id/tvCompleteYear")
    private WebElement dd_medicalInstituteYearCompleted;

    @FindBy(id = "com.doral.clinician.android:id/add_save_medical")
    private WebElement btn_medicalInstituteSave;

    @FindBy(id = "com.doral.clinician.android:id/edtResidencyInstName")
    private WebElement txt_residencyInstituteName;

    @FindBy(id = "com.doral.clinician.android:id/edtResidencyInstAddress")
    private WebElement txt_residencyAddress1;

    @FindBy(id = "com.doral.clinician.android:id/edtResidencyInstAddressLine2")
    private WebElement txt_residencyAddress2;

    @FindBy(id = "com.doral.clinician.android:id/edtResidencyInstApt")
    private WebElement txt_residencyApt;

    @FindBy(id = "com.doral.clinician.android:id/tvResidencyCity")
    private WebElement txt_residencyCity;

    @FindBy(id = "com.doral.clinician.android:id/tvResidencyState")
    private WebElement txt_residencyState;

    @FindBy(id = "com.doral.clinician.android:id/edtResidencyIntiZipCode")
    private WebElement txt_residencyZipcode;

    @FindBy(id = "com.doral.clinician.android:id/tvResidStartedYear")
    private WebElement dd_residencyYearStarted;

    @FindBy(id = "com.doral.clinician.android:id/tvResidCompleteYear")
    private WebElement dd_residencyYearCompleted;

    @FindBy(id = "com.doral.clinician.android:id/add_save_recidency")
    private WebElement btn_residencySave;

    @FindBy(id = "com.doral.clinician.android:id/edtFellowNameInstitute")
    private WebElement txt_fellowshipInstituteName;

    @FindBy(id = "com.doral.clinician.android:id/edtFellowInstiAddress")
    private WebElement txt_fellowshipAddress1;

    @FindBy(id = "com.doral.clinician.android:id/edtFellowshipInstAddressLine2")
    private WebElement txt_fellowshipAddress2;

    @FindBy(id = "com.doral.clinician.android:id/edtFellowshipInstApt")
    private WebElement txt_fellowshipApt;

    @FindBy(id = "com.doral.clinician.android:id/tvCityF")
    private WebElement txt_fellowshipCity;

    @FindBy(id = "com.doral.clinician.android:id/tvStateF")
    private WebElement txt_fellowshipState;

    @FindBy(id = "com.doral.clinician.android:id/edtFellowshipZipCode")
    private WebElement txt_fellowshipZipcode;

    @FindBy(id = "com.doral.clinician.android:id/edtFellowshipProgram")
    private WebElement txt_fellowshipProgramName;

    @FindBy(id = "com.doral.clinician.android:id/tvFellowStartedYear")
    private WebElement txt_fellowshipYearStarted;

    @FindBy(id = "com.doral.clinician.android:id/tvFellowCompletedYear")
    private WebElement txt_fellowshipYearCompleted;

    @FindBy(id = "com.doral.clinician.android:id/add_save_fellowship")
    private WebElement txt_fellowshipSave;

    @FindBy(id = "com.doral.clinician.android:id/img_back")
    private WebElement txt_educationDetailsBack;

    @FindBy(id = "android:id/button1")
    private WebElement btn_medicalInstituteYearStartedOk;

    public WebElement getBtn_medicalInstitute() {
        return btn_medicalInstitute;
    }

    public WebElement getBtn_residencyInstitute() {
        return btn_residencyInstitute;
    }

    public WebElement getBtn_fellowshipInstitute() {
        return btn_fellowshipInstitute;
    }

    public WebElement getBtn_educationDetailsSubmit() {
        return btn_educationDetailsSubmit;
    }

    public WebElement getTxt_medicalInstituteName() {
        return txt_medicalInstituteName;
    }

    public void getTxt_medicalInstituteAddress1() {
        txt_medicalInstituteAddress1.click();
        String address1 = properties.getProperty("address1");
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(address1);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_medicalInstituteAddress2() {
        return txt_medicalInstituteAddress2;
    }

    public WebElement getTxt_medicalInstituteApt() {
        return txt_medicalInstituteApt;
    }

    public WebElement getTxt_medicalInstituteCity() {
        return txt_medicalInstituteCity;
    }

    public WebElement getTxt_medicalInstituteState() {
        return txt_medicalInstituteState;
    }

    public WebElement getTxt_medicalInstituteZipCode() {
        return txt_medicalInstituteZipCode;
    }

    public void getDd_medicalInstituteYearStarted() {
        dd_medicalInstituteYearStarted.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]")).click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.Button[1]")).click();
        btn_medicalInstituteYearStartedOk.click();
    }

    public void getDd_medicalInstituteYearCompleted() {
        dd_medicalInstituteYearCompleted.click();
        btn_medicalInstituteYearStartedOk.click();
    }

    public WebElement getBtn_medicalInstituteSave() {
        return btn_medicalInstituteSave;
    }

    public WebElement getTxt_residencyInstituteName() {
        return txt_residencyInstituteName;
    }

    public void getTxt_residencyAddress1() {
        txt_residencyAddress1.click();
        String address1 = properties.getProperty("address1");
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(address1);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_residencyAddress2() {
        return txt_residencyAddress2;
    }

    public WebElement getTxt_residencyApt() {
        return txt_residencyApt;
    }

    public WebElement getTxt_residencyCity() {
        return txt_residencyCity;
    }

    public WebElement getTxt_residencyState() {
        return txt_residencyState;
    }

    public WebElement getTxt_residencyZipcode() {
        return txt_residencyZipcode;
    }

    public void getDd_residencyYearStarted() {
        dd_residencyYearStarted.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]")).click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.Button[1]")).click();
        btn_medicalInstituteYearStartedOk.click();
    }

    public void getDd_residencyYearCompleted() {
        dd_residencyYearCompleted.click();
        btn_medicalInstituteYearStartedOk.click();
    }

    public WebElement getBtn_residencySave() {
        return btn_residencySave;
    }

    public WebElement getTxt_fellowshipInstituteName() {
        return txt_fellowshipInstituteName;
    }

    public void getTxt_fellowshipAddress1() {
        txt_fellowshipAddress1.click();
        String address1 = properties.getProperty("address1");
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(address1);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_fellowshipAddress2() {
        return txt_fellowshipAddress2;
    }

    public WebElement getTxt_fellowshipApt() {
        return txt_fellowshipApt;
    }

    public WebElement getTxt_fellowshipCity() {
        return txt_fellowshipCity;
    }

    public WebElement getTxt_fellowshipState() {
        return txt_fellowshipState;
    }

    public WebElement getTxt_fellowshipZipcode() {
        return txt_fellowshipZipcode;
    }

    public WebElement getTxt_fellowshipProgramName() {
        return txt_fellowshipProgramName;
    }

    public void getTxt_fellowshipYearStarted() {
        txt_fellowshipYearStarted.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]")).click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.Button[1]")).click();
        btn_medicalInstituteYearStartedOk.click();
    }

    public void getTxt_fellowshipYearCompleted() {
        txt_fellowshipYearCompleted.click();
        btn_medicalInstituteYearStartedOk.click();
    }

    public WebElement getTxt_fellowshipSave() {
        return txt_fellowshipSave;
    }

    /********************Professional details objects********************/
    @FindBy(id = "com.doral.clinician.android:id/img_back")
    private static WebElement btn_professionalDetailsBack;

    @FindBy(id = "com.doral.clinician.android:id/rbMedicareEnrolledYes")
    private static WebElement btn_professionalDetailsMedicareEnrolled_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rbMedicareEnrolledNo")
    private static WebElement btn_professionalDetailsMedicareEnrolled_No;

    @FindBy(id = "com.doral.clinician.android:id/tvStateMedicare")
    private static WebElement dD_professionalDetailsMedicareEnrolledState;

    @FindBy(id = "com.doral.clinician.android:id/edtMedicareNumber")
    private static WebElement txt_professionalDetailsMedicareNumber;

    @FindBy(id = "com.doral.clinician.android:id/tvAddMedicare")
    private static WebElement btn_professionalDetailsMedicareAdd;

    @FindBy(id = "com.doral.clinician.android:id/rbMedicaidEnrolledYes")
    private static WebElement btn_professionalDetailsMedicaid_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rbMedicaidEnrolledNo")
    private static WebElement btn_professionalDetailsMedicaid_No;

    @FindBy(id = "com.doral.clinician.android:id/tvMedicaidState")
    private static WebElement btn_professionalDetailsMedicaidState;

    @FindBy(id = "com.doral.clinician.android:id/edtMedicidNumber")
    private static WebElement btn_professionalDetailsMedicaidNumber;

    @FindBy(id = "com.doral.clinician.android:id/tvAddMedicaid")
    private static WebElement btn_professionalDetailsMedicaidAdd;

    @FindBy(id = "com.doral.clinician.android:id/cb1013")
    private static WebElement cb_professionalDetailsAge18;

    @FindBy(id = "com.doral.clinician.android:id/cb1940")
    private static WebElement cb_professionalDetailsAge1940;

    @FindBy(id = "com.doral.clinician.android:id/cb4165")
    private static WebElement cb_professionalDetailsAge4165;

    @FindBy(id = "com.doral.clinician.android:id/cb65Plus")
    private static WebElement cb_professionalDetailsAge65Plus;

    @FindBy(id = "com.doral.clinician.android:id/tvAddLicense")
    private static WebElement btn_professionalDetailsStateLicenses;

    @FindBy(id = "com.doral.clinician.android:id/tvStateLicense")
    private static WebElement btn_professionalDetailsStateLicensesState;

    @FindBy(id = "com.doral.clinician.android:id/edtLicenseNumber")
    private static WebElement btn_professionalDetailsStateLicenseNumber;

    @FindBy(id = "com.doral.clinician.android:id/tvCategories")
    private static WebElement dD_professionalDetailsStateLicenseCategories;

    @FindBy(id = "com.doral.clinician.android:id/tvstatelicence")
    private static WebElement btn_professionalDetailsStateLicensesSave;

    @FindBy(id = "com.doral.clinician.android:id/tvAddBoardCertification")
    private static WebElement btn_professionalDetailsBoardCertificate;

    @FindBy(id = "com.doral.clinician.android:id/tvCertifyingBoard")
    private static WebElement dD_professionalDetailsBoardCertifying;

    @FindBy(id = "com.doral.clinician.android:id/rbBoardCertifiedYes")
    private static WebElement btn_professionalDetailsBoardCertificated_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rbBoardCertifiedNo")
    private static WebElement btn_professionalDetailsBoardCertificated_No;

    @FindBy(id = "com.doral.clinician.android:id/rbBoardEligibleYes")
    private static WebElement btn_professionalDetailsBoardEligible_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rbBoardEligibleNo")
    private static WebElement btn_professionalDetailsBoardEligible_No;

    @FindBy(id = "com.doral.clinician.android:id/tvboard")
    private static WebElement btn_professionalDetailsBoardCertificateSave;

    @FindBy(id = "com.doral.clinician.android:id/edtFederalID")
    private static WebElement txt_professionalDetailsFederalDeaId;

    @FindBy(id = "com.doral.clinician.android:id/tvExipreMonthYear")
    private static WebElement cal_professionalDetailsFederalDeaExpireMonthYear;

    @FindBy(id = "com.doral.clinician.android:id/edtNPINumber")
    private static WebElement txt_professionalDetailsNpiNumber;

    @FindBy(id = "com.doral.clinician.android:id/tvNPIType")
    private static WebElement dD_professionalDetailsNpiType;

    @FindBy(id = "com.doral.clinician.android:id/edtAddressLine1")
    private static WebElement txt_professionalDetailsNpiAddress1;

    @FindBy(id = "com.doral.clinician.android:id/edtAddressLine2")
    private static WebElement txt_professionalDetailsNpiAddress2;

    @FindBy(id = "com.doral.clinician.android:id/edtAPT")
    private static WebElement txt_professionalDetailsNpiApt;

    @FindBy(id = "com.doral.clinician.android:id/tvCity")
    private static WebElement dD_professionalDetailsNpiCity;

    @FindBy(id = "com.doral.clinician.android:id/tvState")
    private static WebElement dD_professionalDetailsNpiState;

    @FindBy(id = "com.doral.clinician.android:id/edtTaxonomyDes")
    private static WebElement txt_professionalDetailsNpiTaxonomy;

    @FindBy(id = "com.doral.clinician.android:id/edtCAQHId")
    private static WebElement txt_professionalDetailsCaqhId;

    @FindBy(id = "com.doral.clinician.android:id/edtCAQHUser")
    private static WebElement txt_professionalDetailsCaqhUser;

    @FindBy(id = "com.doral.clinician.android:id/edtCAQHPassword")
    private static WebElement txt_professionalDetailsCaqhPass;

    @FindBy(id = "com.doral.clinician.android:id/tvSubmit")
    private static WebElement txt_professionalDetailsSave;

    public WebElement getBtn_professionalDetailsMedicareEnrolled_Yes() {
        return btn_professionalDetailsMedicareEnrolled_Yes;
    }

    public WebElement getBtn_professionalDetailsMedicareEnrolled_No() {
        return btn_professionalDetailsMedicareEnrolled_No;
    }

    public void getDD_professionalDetailsMedicareEnrolledState() {
        dD_professionalDetailsMedicareEnrolledState.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")).click();
    }

    public WebElement getTxt_professionalDetailsMedicareNumber() {
        return txt_professionalDetailsMedicareNumber;
    }

    public WebElement getBtn_professionalDetailsMedicareAdd() {
        return btn_professionalDetailsMedicareAdd;
    }

    public WebElement getBtn_professionalDetailsMedicaid_Yes() {
        return btn_professionalDetailsMedicaid_Yes;
    }

    public WebElement getBtn_professionalDetailsMedicaid_No() {
        return btn_professionalDetailsMedicaid_No;
    }

    public void getBtn_professionalDetailsMedicaidState() {
        btn_professionalDetailsMedicaidState.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
    }

    public WebElement getBtn_professionalDetailsMedicaidNumber() {
        return btn_professionalDetailsMedicaidNumber;
    }

    public WebElement getBtn_professionalDetailsMedicaidAdd() {
        return btn_professionalDetailsMedicaidAdd;
    }

    public WebElement getCb_professionalDetailsAge18() {
        return cb_professionalDetailsAge18;
    }

    public WebElement getCb_professionalDetailsAge1940() {
        return cb_professionalDetailsAge1940;
    }

    public WebElement getCb_professionalDetailsAge4165() {
        return cb_professionalDetailsAge4165;
    }

    public WebElement getCb_professionalDetailsAge65Plus() {
        return cb_professionalDetailsAge65Plus;
    }

    public WebElement getBtn_professionalDetailsStateLicenses() {
        return btn_professionalDetailsStateLicenses;
    }

    public void getBtn_professionalDetailsStateLicensesState() {
        btn_professionalDetailsStateLicensesState.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
    }

    public WebElement getBtn_professionalDetailsStateLicenseNumber() {
        return btn_professionalDetailsStateLicenseNumber;
    }

    public void getDD_professionalDetailsStateLicenseCategories() {
        dD_professionalDetailsStateLicenseCategories.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
    }

    public WebElement getBtn_professionalDetailsStateLicensesSave() {
        return btn_professionalDetailsStateLicensesSave;
    }

    public WebElement getBtn_professionalDetailsBoardCertificate() {
        return btn_professionalDetailsBoardCertificate;
    }

    public void getdD_professionalDetailsBoardCertifying() {
        dD_professionalDetailsBoardCertifying.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
    }

    public WebElement getBtn_professionalDetailsBoardCertificated_Yes() {
        return btn_professionalDetailsBoardCertificated_Yes;
    }

    public WebElement getBtn_professionalDetailsBoardCertificated_No() {
        return btn_professionalDetailsBoardCertificated_No;
    }

    public WebElement getBtn_professionalDetailsBoardEligible_Yes() {
        return btn_professionalDetailsBoardEligible_Yes;
    }

    public WebElement getBtn_professionalDetailsBoardEligible_No() {
        return btn_professionalDetailsBoardEligible_No;
    }

    public WebElement getBtn_professionalDetailsBoardCertificateSave() {
        return btn_professionalDetailsBoardCertificateSave;
    }

    public WebElement getTxt_professionalDetailsFederalDeaId() {
        return txt_professionalDetailsFederalDeaId;
    }

    public void getCal_professionalDetailsFederalDeaExpireMonthYear() {
        cal_professionalDetailsFederalDeaExpireMonthYear.click();
        AppiumController.getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"19 August 2022\"]")).click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
    }

    public WebElement getTxt_professionalDetailsNpiNumber() {
        return txt_professionalDetailsNpiNumber;
    }

    public void getDD_professionalDetailsNpiType() {
        dD_professionalDetailsNpiType.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
    }

    public void getTxt_professionalDetailsNpiAddress1() {
        txt_professionalDetailsNpiAddress1.click();
        String address1 = properties.getProperty("address1");
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(address1);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_professionalDetailsNpiAddress2() {
        return txt_professionalDetailsNpiAddress2;
    }

    public WebElement getTxt_professionalDetailsNpiApt() {
        return txt_professionalDetailsNpiApt;
    }

    public WebElement getDD_professionalDetailsNpiCity() {
        return dD_professionalDetailsNpiCity;
    }

    public WebElement getDD_professionalDetailsNpiState() {
        return dD_professionalDetailsNpiState;
    }

    public WebElement getTxt_professionalDetailsNpiTaxonomy() {
        return txt_professionalDetailsNpiTaxonomy;
    }

    public WebElement getTxt_professionalDetailsCaqhId() {
        return txt_professionalDetailsCaqhId;
    }

    public WebElement getTxt_professionalDetailsCaqhUser() {
        return txt_professionalDetailsCaqhUser;
    }

    public WebElement getTxt_professionalDetailsCaqhPass() {
        return txt_professionalDetailsCaqhPass;
    }

    public WebElement getTxt_professionalDetailsSave() {
        return txt_professionalDetailsSave;
    }

    /********************Work History objects********************/
    @FindBy(id = "com.doral.clinician.android:id/img_back")
    private static WebElement btn_workHistoryBack;

    @FindBy(id = "com.doral.clinician.android:id/rb_bonded_yes")
    private static WebElement btn_areYouCurrentlyEmployed_Yes;

    @FindBy(id = "com.doral.clinician.android:id/rb_bonded_no")
    private static WebElement btn_areYouCurrentlyEmployed_No;

    @FindBy(id = "com.doral.clinician.android:id/tv_add_company")
    private static WebElement btn_addCurrentEmployer;

    @FindBy(id = "com.doral.clinician.android:id/edtCompanyName")
    private static WebElement txt_addCurrentEmployerName;

    @FindBy(id = "com.doral.clinician.android:id/edtPositionTitle")
    private static WebElement txt_addCurrentEmployerPosition;

    @FindBy(id = "com.doral.clinician.android:id/edtInstituteAddress")
    private static WebElement txt_addCurrentEmployerAddress1;

    @FindBy(id = "com.doral.clinician.android:id/edtInstituteAddressLine2")
    private static WebElement txt_addCurrentEmployerAddress2;

    @FindBy(id = "com.doral.clinician.android:id/edtApt")
    private static WebElement txt_addCurrentEmployerApt;

    @FindBy(id = "com.doral.clinician.android:id/tvCity")
    private static WebElement txt_addCurrentEmployerCity;

    @FindBy(id = "com.doral.clinician.android:id/tvState")
    private static WebElement txt_addCurrentEmployerState;

    @FindBy(id = "com.doral.clinician.android:id/edtZipCode")
    private static WebElement txt_addCurrentEmployerZipcode;

    @FindBy(id = "com.doral.clinician.android:id/tvStartedYear")
    private static WebElement dd_addCurrentEmployerYearStarted;

    @FindBy(id = "com.doral.clinician.android:id/tvNext")
    private static WebElement btn_addCurrentEmployerSubmit;

    @FindBy(id = "com.doral.clinician.android:id/tvSubmit")
    private static WebElement btn_workHistorySubmit;

    @FindBy(id = "android:id/button1")
    private WebElement btn_addCurrentEmployerYearStartedOk;

    public WebElement getBtn_workHistoryBack() {
        return btn_workHistoryBack;
    }

    public WebElement getBtn_areYouCurrentlyEmployed_Yes() {
        return btn_areYouCurrentlyEmployed_Yes;
    }

    public WebElement getBtn_addCurrentEmployer() {
        return btn_addCurrentEmployer;
    }

    public WebElement getTxt_addCurrentEmployerName() {
        return txt_addCurrentEmployerName;
    }

    public WebElement getTxt_addCurrentEmployerPosition() {
        return txt_addCurrentEmployerPosition;
    }

    public void getTxt_addCurrentEmployerAddress1() {
        txt_addCurrentEmployerAddress1.click();
        String address1 = properties.getProperty("address1");
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/places_autocomplete_search_bar")).sendKeys(address1);
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_addCurrentEmployerAddress2() {
        return txt_addCurrentEmployerAddress2;
    }

    public WebElement getTxt_addCurrentEmployerApt() {
        return txt_addCurrentEmployerApt;
    }

    public WebElement getTxt_addCurrentEmployerCity() {
        return txt_addCurrentEmployerCity;
    }

    public WebElement getTxt_addCurrentEmployerState() {
        return txt_addCurrentEmployerState;
    }

    public WebElement getTxt_addCurrentEmployerZipcode() {
        return txt_addCurrentEmployerZipcode;
    }

    public WebElement getBtn_addCurrentEmployerYearStartedOk() {
        return btn_addCurrentEmployerYearStartedOk;
    }

    public void getDd_addCurrentEmployerYearStarted() {
        dd_addCurrentEmployerYearStarted.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]")).click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.Button[1]")).click();
        getBtn_addCurrentEmployerYearStartedOk().click();
    }

    public WebElement getBtn_addCurrentEmployerSubmit() {
        return btn_addCurrentEmployerSubmit;
    }

    public WebElement getBtn_workHistorySubmit() {
        return btn_workHistorySubmit;
    }

    /********************Payroll Details objects********************/
    @FindBy(id = "com.doral.clinician.android:id/rb_yes")
    private static WebElement btn_payrollDetailsSingle;

    @FindBy(id = "com.doral.clinician.android:id/rb_no")
    private static WebElement btn_payrollDetailsMarried;

    @FindBy(id = "com.doral.clinician.android:id/rb_unknown")
    private static WebElement btn_payrollDetailsHeadOfHousehold;

    @FindBy(id = "com.doral.clinician.android:id/edt_children")
    private static WebElement txt_payrollDetailsDependentsUnder17;

    @FindBy(id = "com.doral.clinician.android:id/otherDependents")
    private static WebElement txt_payrollDetailsOtherDependents;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private static WebElement btn_payrollDetailsUploadW4Docs;

    @FindBy(id = "com.doral.clinician.android:id/rlPriorAddress")
    private static WebElement btn_payrollDetailsBankDetails;

    @FindBy(id = "com.doral.clinician.android:id/bankname")
    private static WebElement dd_payrollDetailsBankName;

    @FindBy(id = "com.doral.clinician.android:id/accountname")
    private static WebElement txt_payrollDetailsAccountHolderName;

    @FindBy(id = "com.doral.clinician.android:id/rb_check")
    private static WebElement btn_payrollDetailsAccountTypeChecking;

    @FindBy(id = "com.doral.clinician.android:id/rb_save")
    private static WebElement btn_payrollDetailsAccountTypeSaving;

    @FindBy(id = "com.doral.clinician.android:id/edt_routing_number")
    private static WebElement dd_payrollDetailsBankRoutingNumber;

    @FindBy(id = "com.doral.clinician.android:id/edt_account_number")
    private static WebElement txt_payrollDetailsBankAccountNumber;

    @FindBy(id = "com.doral.clinician.android:id/edtConfirmAccountNumber")
    private static WebElement txt_payrollDetailsConfirmAccountNumber;

    @FindBy(id = "com.doral.clinician.android:id/rlPriorAddress1")
    private static WebElement btn_payrollDetailsTaxInfo;

    @FindBy(id = "com.doral.clinician.android:id/rb_fillingyes")
    private static WebElement btn_payrollDetailsTaxInfoYes;

    @FindBy(id = "com.doral.clinician.android:id/rb_fillingno")
    private static WebElement btn_payrollDetailsTaxInfoNo;

    @FindBy(id = "com.doral.clinician.android:id/tv_save")
    private static WebElement btn_payrollDetailsSave;

    @FindBy(id = "com.doral.clinician.android:id/img_back")
    private static WebElement btn_payrollDetailsBack;

    public WebElement getBtn_payrollDetailsSingle() {
        return btn_payrollDetailsSingle;
    }

    public WebElement getBtn_payrollDetailsMarried() {
        return btn_payrollDetailsMarried;
    }

    public WebElement getTxt_payrollDetailsDependentsUnder17() {
        return txt_payrollDetailsDependentsUnder17;
    }

    public WebElement getTxt_payrollDetailsOtherDependents() {
        return txt_payrollDetailsOtherDependents;
    }

    public void getBtn_payrollDetailsUploadW4Docs() {
        btn_payrollDetailsUploadW4Docs.click();
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/tv_camera")).click();
        AppiumController.getDriver().findElement(By.id("com.android.camera:id/shutter_button_horizontal")).click();
        AppiumController.getDriver().findElement(By.id("com.android.camera:id/done_button")).click();
        AppiumController.getDriver().findElement(By.id("com.doral.clinician.android:id/menu_crop")).click();
    }

    public WebElement getBtn_payrollDetailsBankDetails() {
        return btn_payrollDetailsBankDetails;
    }

    public void getDd_payrollDetailsBankName() {
        dd_payrollDetailsBankName.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")).click();
    }

    public WebElement getTxt_payrollDetailsAccountHolderName() {
        return txt_payrollDetailsAccountHolderName;
    }

    public WebElement getBtn_payrollDetailsAccountTypeChecking() {
        return btn_payrollDetailsAccountTypeChecking;
    }

    public WebElement getBtn_payrollDetailsAccountTypeSaving() {
        return btn_payrollDetailsAccountTypeSaving;
    }

    public void getDd_payrollDetailsBankRoutingNumber() {
        dd_payrollDetailsBankRoutingNumber.click();
        AppiumController.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")).click();
    }

    public WebElement getTxt_payrollDetailsBankAccountNumber() {
        return txt_payrollDetailsBankAccountNumber;
    }

    public WebElement getTxt_payrollDetailsConfirmAccountNumber() {
        return txt_payrollDetailsConfirmAccountNumber;
    }

    public WebElement getBtn_payrollDetailsTaxInfo() {
        return btn_payrollDetailsTaxInfo;
    }

    public WebElement getBtn_payrollDetailsTaxInfoYes() {
        return btn_payrollDetailsTaxInfoYes;
    }

    public WebElement getBtn_payrollDetailsTaxInfoNo() {
        return btn_payrollDetailsTaxInfoNo;
    }

    public WebElement getBtn_payrollDetailsSave() {
        return btn_payrollDetailsSave;
    }

    public WebElement getBtn_payrollDetailsBack() {
        return btn_payrollDetailsBack;
    }

    /********************Document Verification objects********************/


    @FindBy(id = "com.doral.clinician.android:id/rl_id_proof")
    private static WebElement btn_idProofFrontUpload;

    @FindBy(id = "com.doral.clinician.android:id/idproof")
    private static WebElement btn_idProofBackUpload;

    @FindBy(id = "com.doral.clinician.android:id/rl_id_socialproof")
    private static WebElement btn_socialSecurityFrontUpload;

    @FindBy(id = "com.doral.clinician.android:id/idsocialproof")
    private static WebElement btn_socialSecurityBackUpload;

    @FindBy(id = "com.doral.clinician.android:id/lin_covid")
    private static WebElement btn_covidVaccineCardUpload;

    @FindBy(id = "com.doral.clinician.android:id/rbBls")
    private static WebElement btn_cprBLS;

    @FindBy(id = "com.doral.clinician.android:id/rbAcls")
    private static WebElement btn_cprACLS;

    @FindBy(id = "com.doral.clinician.android:id/rl_CPR")
    private static WebElement btn_cprUpload;

    @FindBy(id = "com.doral.clinician.android:id/relPreEmployeePhysical")
    private static WebElement btn_preEmploymentPhysicalUpload;

    @FindBy(id = "com.doral.clinician.android:id/rl_current_cv")
    private static WebElement btn_currentCVUpload;

    @FindBy(id = "com.doral.clinician.android:id/rl_professional")
    private static WebElement btn_professionalLicenseUpload;

    @FindBy(id = "com.doral.clinician.android:id/rl_state_reg_cert")
    private static WebElement btn_stateRegistrationCertificateUpload;

    @FindBy(id = "com.doral.clinician.android:id/rl_dea")
    private static WebElement btn_deaLicenseOrControlledSubstance;

    @FindBy(id = "com.doral.clinician.android:id/rl_malprctice")
    private static WebElement btn_malepracticeCertificate;

    @FindBy(id = "com.doral.clinician.android:id/rl_All_malprctice")
    private static WebElement btn_explanationOfAllMalepractice;

    @FindBy(id = "com.doral.clinician.android:id/rl_school_diploma")
    private static WebElement btn_medicalSchoolDiploma;

    @FindBy(id = "com.doral.clinician.android:id/rl_rec_certificate")
    private static WebElement btn_residencyCertificate;

    @FindBy(id = "com.doral.clinician.android:id/rl_fell_certificate")
    private static WebElement btn_fellowshipCertificate;

    @FindBy(id = "com.doral.clinician.android:id/rl_inten_certificate")
    private static WebElement btn_internshipCertificate;

    @FindBy(id = "com.doral.clinician.android:id/rl_ECFMGCertificate")
    private static WebElement btn_ECFMGcertificate;

    @FindBy(id = "com.doral.clinician.android:id/edtECFMG")
    private static WebElement txt_ECFMGID;

    @FindBy(id = "com.doral.clinician.android:id/rl_BoardCertificate")
    private static WebElement btn_boardCertificate;

    @FindBy(id = "com.doral.clinician.android:id/rl_HospitalAffiliationLetter")
    private static WebElement btn_hospitalAffiliationLetter;

    @FindBy(id = "com.doral.clinician.android:id/rl_SanctionsQueries")
    private static WebElement btn_sanctionsQueries;

    @FindBy(id = "com.doral.clinician.android:id/rl_MedicalWelcomeLetter")
    private static WebElement btn_medicalWelcomeLetter;

    @FindBy(id = "com.doral.clinician.android:id/rl_SignedW9")
    private static WebElement btn_signedW9;

    @FindBy(id = "com.doral.clinician.android:id/rl_SignedESignatureForm")
    private static WebElement btn_signedESignatureForm;

    @FindBy(id = "com.doral.clinician.android:id/tv_next")
    private static WebElement btn_uploadDocumentSubmit;

    @FindBy(id = "com.doral.clinician.android:id/img_back")
    private static WebElement btn_uploadDocumentBack;

    public WebElement getBtn_idProofFrontUpload() {
        return btn_idProofFrontUpload;
    }

    public WebElement getBtn_idProofBackUpload() {
        return btn_idProofBackUpload;
    }

    public WebElement getBtn_socialSecurityFrontUpload() {
        return btn_socialSecurityFrontUpload;
    }

    public WebElement getBtn_socialSecurityBackUpload() {
        return btn_socialSecurityBackUpload;
    }

    public WebElement getBtn_covidVaccineCardUpload() {
        return btn_covidVaccineCardUpload;
    }

    public WebElement getBtn_cprBLS() {
        return btn_cprBLS;
    }

    public WebElement getBtn_cprACLS() {
        return btn_cprACLS;
    }

    public WebElement getBtn_cprUpload() {
        return btn_cprUpload;
    }

    public WebElement getBtn_preEmploymentPhysicalUpload() {
        return btn_preEmploymentPhysicalUpload;
    }

    public WebElement getBtn_currentCVUpload() {
        return btn_currentCVUpload;
    }

    public WebElement getBtn_professionalLicenseUpload() {
        return btn_professionalLicenseUpload;
    }

    public WebElement getBtn_stateRegistrationCertificateUpload() {
        return btn_stateRegistrationCertificateUpload;
    }

    public WebElement getBtn_deaLicenseOrControlledSubstance() {
        return btn_deaLicenseOrControlledSubstance;
    }

    public WebElement getBtn_malepracticeCertificate() {
        return btn_malepracticeCertificate;
    }

    public WebElement getBtn_explanationOfAllMalepractice() {
        return btn_explanationOfAllMalepractice;
    }

    public WebElement getBtn_medicalSchoolDiploma() {
        return btn_medicalSchoolDiploma;
    }

    public WebElement getBtn_residencyCertificate() {
        return btn_residencyCertificate;
    }

    public WebElement getBtn_fellowshipCertificate() {
        return btn_fellowshipCertificate;
    }

    public WebElement getBtn_internshipCertificate() {
        return btn_internshipCertificate;
    }

    public WebElement getBtn_ECFMGcertificate() {
        return btn_ECFMGcertificate;
    }

    public WebElement getTxt_ECFMGID() {
        return txt_ECFMGID;
    }

    public WebElement getBtn_boardCertificate() {
        return btn_boardCertificate;
    }

    public WebElement getBtn_hospitalAffiliationLetter() {
        return btn_hospitalAffiliationLetter;
    }

    public WebElement getBtn_sanctionsQueries() {
        return btn_sanctionsQueries;
    }

    public WebElement getBtn_medicalWelcomeLetter() {
        return btn_medicalWelcomeLetter;
    }

    public WebElement getBtn_signedW9() {
        return btn_signedW9;
    }

    public WebElement getBtn_signedESignatureForm() {
        return btn_signedESignatureForm;
    }

    public WebElement getBtn_uploadDocumentSubmit() {
        return btn_uploadDocumentSubmit;
    }

    public WebElement getBtn_uploadDocumentBack() {
        return btn_uploadDocumentBack;
    }


}