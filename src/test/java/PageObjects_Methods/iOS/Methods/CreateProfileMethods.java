package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.CreateProfileObjects;
import org.openqa.selenium.support.PageFactory;

public class CreateProfileMethods {
    CreateProfileObjects createProfileObjects= PageFactory.initElements(AppiumController.getDriver(), CreateProfileObjects.class);

    public void applicantDetailsClick()
    {
        createProfileObjects.getBtn_applicationDetails().click();

    }
    public  void referenceDetailsClick()
    {
        createProfileObjects.getBtn_referenceDetails().click();
    }
    public  void emergencyContactClick()
    {
        createProfileObjects.getBtn_emergencyContact().click();
    }
}
