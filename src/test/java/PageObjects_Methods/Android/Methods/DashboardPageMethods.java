package PageObjects_Methods.Android.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.Android.Objects.DashboardPageObjects;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageMethods {
    DashboardPageObjects dashboardPageObjects = PageFactory.initElements(AppiumController.getDriver(), DashboardPageObjects.class);

    public boolean isElementDisplayed(){
        return dashboardPageObjects.getIcon_menu().isDisplayed();
    }
    public void BtnMenuClick()
    {
        dashboardPageObjects.getIcon_menu().click();
    }
}
