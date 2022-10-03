package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Methods.LoginPageMethods;
import PageObjects_Methods.iOS.Objects.DashboardPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RoadLRequestForActiveOpportunity extends AppiumController {
    DashboardPageObjects dashboardPageObjects;
    @Test
    public void roadLRequest2() throws InterruptedException {
        dashboardPageObjects = PageFactory.initElements(AppiumController.getDriver(), DashboardPageObjects.class);
        LoginPageMethods loginPageMethods = new LoginPageMethods();
        loginPageMethods.loginMethods();
        Thread.sleep(6000);
        activeRoadLRequestCancel();
    }
        public void activeRoadLRequestCancel()
        {
            String beforeCancel=driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"29yo Male\"]")).getText();
            dashboardPageObjects.getIos_btn_activeOpportuniriesCancel1().click();
            dashboardPageObjects.getIos_btn_activeOpportuniriesCancel1_OK().click();
            String afterCancel=driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"29yo Male\"]")).getText();
            if(!beforeCancel.equalsIgnoreCase(afterCancel))
            {
               System.out.println("RoadL request successfully cancelled");
            }
        }
    }

