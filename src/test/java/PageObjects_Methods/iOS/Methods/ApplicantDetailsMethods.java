package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.ApplicantDetailsObjects;
import Common.ScrollPage;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class ApplicantDetailsMethods {
    public void applicantDetails() throws FileNotFoundException, InterruptedException {
        ApplicantDetailsObjects applicantDetailsObjects= PageFactory.initElements(AppiumController.getDriver(), ApplicantDetailsObjects.class);
        FileUploadMethods fileUploadMethods=new FileUploadMethods();
        ScrollPage scrollPage=new ScrollPage();
        applicantDetailsObjects.getIos_btn_Camera_Allow().click();
        applicantDetailsObjects.getIos_txt_homePhone().sendKeys("1111111111");
        applicantDetailsObjects.getIos_applicant_keyboard_done().click();
        applicantDetailsObjects.getIos_txt_ssn().sendKeys("711111111");
        applicantDetailsObjects.getIos_applicant_keyboard_done().click();
        applicantDetailsObjects.getIos_btn_usCitizenYes().click();
        applicantDetailsObjects.getIos_txt_passportId().sendKeys("11111111");
        applicantDetailsObjects.getIos_applicant_keyboard_done().click();
        scrollPage.scroll();
        //fileUploadMethods.fileUpload(applicantDetailsObjects.getIos_lnk_uploadDocument());
        applicantDetailsObjects.getIos_dd_ethnicity();
        applicantDetailsObjects.getIos_date_dateYouCanStartWork();
        applicantDetailsObjects.getIos_btn_currentAddress();
        scrollPage.scroll();
        Thread.sleep(5000);
        applicantDetailsObjects.getIos_txt_addressLine1();
        applicantDetailsObjects.getIos_txt_addressLine2().sendKeys("j-7");
        applicantDetailsObjects.getIos_txt_apt().sendKeys("123");
        applicantDetailsObjects.getIos_applicant_keyboard_done().click();
        scrollPage.scroll();
        Thread.sleep(5000);
        applicantDetailsObjects.getIos_dropdown_lengthOfAtAboveAddress();
        applicantDetailsObjects.getIos_btn_priorAddress().click();
        applicantDetailsObjects.getIos_txt_priorAddress1();
        applicantDetailsObjects.getIos_txt_priorAddress2().sendKeys("h-7");
        applicantDetailsObjects.getIos_txt_priorApt().sendKeys("456");
        applicantDetailsObjects.getIos_btn_save().click();
    }
}
