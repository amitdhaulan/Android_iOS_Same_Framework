package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Objects.MenuObjects;
import org.openqa.selenium.support.PageFactory;

public class MenuMethods {
    MenuObjects menuObjects = PageFactory.initElements(AppiumController.getDriver(), MenuObjects.class);
    public void BtnProfileClick()
    {
        menuObjects.getBtn_profile().click();
    }

}
