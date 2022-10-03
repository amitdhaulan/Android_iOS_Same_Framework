package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.MenuObjects;
import org.openqa.selenium.support.PageFactory;

public class MenuMethods {
    MenuObjects menuObjects = PageFactory.initElements(AppiumController.getDriver(), MenuObjects.class);
    public void BtnMenuClick()
    {
        menuObjects.getBtn_menu().click();
    }
    public void BtnProfile()
    {
        menuObjects.getBtn_profile().click();
    }

}
