package Test.iOS;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Methods.LoginPageMethods;
import PageObjects_Methods.iOS.Objects.DashboardPageObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
/*****To verify after accepting Road request in available opportunities it should display in active opportunity section*******/
public class RoadLRequestTestForAvailableOpportunity extends AppiumController {
    DashboardPageObjects dashboardPageObjects;
    @Test
    public void roadLRequest1() throws InterruptedException {
        dashboardPageObjects = PageFactory.initElements(AppiumController.getDriver(), DashboardPageObjects.class);
        LoginPageMethods loginPageMethods=new LoginPageMethods();
        loginPageMethods.loginMethods();
        Thread.sleep(6000);
        availableOpportunitiesRoadLRequestUndo();
//        availableOpportunitiesRoadLRequestLocation();
//        availableOpportunitiesRoadLRequestAccept();
//        availableOpportunitiesRoadLRequestCancel();
    }
    public void availableOpportunitiesRoadLRequestLocation()
    {
        dashboardPageObjects.getIos_btn_availableOpportuniriesLocation().click();

    }
    public void availableOpportunitiesRoadLRequestAccept()
    {
        dashboardPageObjects.getIos_btn_availableOpportuniriesAccept().click();

    }
    public void availableOpportunitiesRoadLRequestUndo() throws InterruptedException {
        String beforeClick=dashboardPageObjects.getIos_btn_availableOpportuniriesAccept().getText();
        dashboardPageObjects.getIos_btn_availableOpportuniriesAccept().click();
        Thread.sleep(5000);
        String afterClick=dashboardPageObjects.getIos_btn_availableOpportuniriesAccept().getText();
        dashboardPageObjects.getIos_btn_availableOpportuniriesAccept().click();
        System.out.println("Before click= "+beforeClick);
        System.out.println("After click= "+afterClick);
        //Assert.assertEquals(!afterClick.equals(beforeClick),true);
    }

    public void availableOpportunitiesRoadLRequestCancel()
    {
        dashboardPageObjects.getIos_btn_availableOpportuniriesAccept().click();
        dashboardPageObjects.getIos_btn_availableOpportuniriesCancel1_Cancel().click();
    }


}
