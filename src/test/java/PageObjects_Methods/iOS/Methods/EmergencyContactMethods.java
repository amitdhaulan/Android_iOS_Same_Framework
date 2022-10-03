package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.EmergencyContactObjects;
import org.openqa.selenium.support.PageFactory;

public class EmergencyContactMethods {
    public void emergencyContact() throws InterruptedException {
        EmergencyContactObjects emergencyContactObjects = PageFactory.initElements(AppiumController.getDriver(), EmergencyContactObjects.class);
        emergencyContactObjects.getIos_btn_emergencyContactAddContact().click();
        Thread.sleep(5000);
        emergencyContactObjects.getIos_txt_emergencyContact1Name().sendKeys("emergency");
        emergencyContactObjects.getIos_txt_emergencyContact1PhNumber().sendKeys("1234567899");
        emergencyContactObjects.getIos_btn_emergencyContactDone().click();
        Thread.sleep(5000);
        emergencyContactObjects.getIos_txt_emergencyContact1AddressLine1("gurugram");
        emergencyContactObjects.getIos_txt_emergencyContact1AddressLine2().sendKeys("l-21");
        emergencyContactObjects.getIos_btn_emergencyContactDone().click();
        emergencyContactObjects.getIos_txt_emergencyContact1Apt().sendKeys("456");
        emergencyContactObjects.getIos_btn_emergencyContactDone().click();
        emergencyContactObjects.getIos_txt_emergencyContact1Zipcode().sendKeys("11111");
        emergencyContactObjects.getIos_btn_emergencyContactDone().click();
        emergencyContactObjects.getIos_dd_emergencyContact1Relationship();
        emergencyContactObjects.getIos_btn_emergencyContact1Submit().click();
    }
}
