package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.ReferenceDetailsObjects;
import Common.ScrollPage;
import org.openqa.selenium.support.PageFactory;

public class ReferenceDetailsMethods {
    public void referenceDetailsMethods() throws InterruptedException {
        ReferenceDetailsObjects referenceDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ReferenceDetailsObjects.class);
        ScrollPage scrollPage=new ScrollPage();
        Thread.sleep(5000);
        referenceDetailsObjects.getIos_btn_referenceAddAReference().click();
        Thread.sleep(5000);
        referenceDetailsObjects.getIos_txt_reference1().sendKeys("referencea");
        referenceDetailsObjects.getIos_txt_reference1AddressLine1();
        referenceDetailsObjects.getIos_txt_reference1AddressLine2().sendKeys("r-12");
        referenceDetailsObjects.getIos_txt_reference1Apt().sendKeys("123");
        referenceDetailsObjects.getIos_txt_reference1State();
        referenceDetailsObjects.getIos_txt_reference1PhNumber().sendKeys("1234567899");
        referenceDetailsObjects.getIos_btn_referenceDone().click();
        referenceDetailsObjects.getIos_btn_reference1Submit().click();
        referenceDetailsObjects.getIos_btn_referenceAddAReference().click();
        Thread.sleep(5000);
        referenceDetailsObjects.getIos_txt_reference1().sendKeys("referenceb");
        referenceDetailsObjects.getIos_txt_reference1AddressLine1();
        referenceDetailsObjects.getIos_txt_reference1AddressLine2().sendKeys("k-13");
        referenceDetailsObjects.getIos_txt_reference1Apt().sendKeys("123");
        referenceDetailsObjects.getIos_txt_reference1State();
        referenceDetailsObjects.getIos_txt_reference1PhNumber().sendKeys("1234567899");
        referenceDetailsObjects.getIos_btn_referenceDone().click();
        referenceDetailsObjects.getIos_btn_reference1Submit().click();
        Thread.sleep(2000);
        scrollPage.scroll();
        referenceDetailsObjects.getIos_btn_referenceHaveYouEverBeenBonded_No().click();
        referenceDetailsObjects.getIos_btn_referenceHaveYouEverBeenRefusedABond_No().click();
        referenceDetailsObjects.getIos_btn_referenceHaveYouEverBeenConvicatedOfACrime_No().click();
        referenceDetailsObjects.getIos_btn_referenceSubmit().click();
    }
}