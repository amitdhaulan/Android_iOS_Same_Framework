package PageObjects_Methods.iOS.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjects {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    private static WebElement ios_dashboard_back;

    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    private static WebElement ios_img_profileImage;

    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private static WebElement ios_icon_menu;

    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]")
    private static WebElement ios_btn_notifyMe;

    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[2]")
    private static WebElement ios_btn_shareMyLocation;

    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[2]")
    private static WebElement ios_btn_activeOpportuniriesLocation1;

    @FindBy(xpath="(//XCUIElementTypeStaticText[@name=\"ARRIVED\"])[1]")
    private static WebElement ios_btn_activeOpportuniriesArrived1;

    @FindBy(xpath="(//XCUIElementTypeButton[@name=\"cancelGreen\"])[1]")
    private static WebElement ios_btn_activeOpportuniriesCancel1;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")
    private static WebElement ios_btn_activeOpportuniriesCancel1_Cancel;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"OK\"]")
    private static WebElement ios_btn_activeOpportuniriesCancel1_OK;

    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[2]")
    private static WebElement ios_btn_availableOpportuniriesLocation;

    @FindBy(xpath="(//XCUIElementTypeButton[@name=\"cancelGreen\"])[3]")
    private static WebElement ios_btn_availableOpportuniriesCancel;

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"ACCEPT\"]")
    private static WebElement ios_btn_availableOpportuniriesAccept;

    public WebElement getIos_img_profileImage() {
        return ios_img_profileImage;
    }

    public WebElement getIos_icon_menu() {
        return ios_icon_menu;
    }

    public WebElement getIos_btn_notifyMe() {
        return ios_btn_notifyMe;
    }

    public WebElement getIos_btn_shareMyLocation() {
        return ios_btn_shareMyLocation;
    }

    public WebElement getIos_btn_activeOpportuniriesLocation1() {
        return ios_btn_activeOpportuniriesLocation1;
    }

    public WebElement getIos_btn_activeOpportuniriesArrived1() {
        return ios_btn_activeOpportuniriesArrived1;
    }

    public WebElement getIos_btn_activeOpportuniriesCancel1() {
        return ios_btn_activeOpportuniriesCancel1;
    }

    public WebElement getIos_btn_availableOpportuniriesCancel1_Cancel() {
        return ios_btn_activeOpportuniriesCancel1_Cancel;
    }

    public WebElement getIos_btn_activeOpportuniriesCancel1_OK() {
        return ios_btn_activeOpportuniriesCancel1_OK;
    }

    public WebElement getIos_btn_availableOpportuniriesLocation() {
        return ios_btn_availableOpportuniriesLocation;
    }

    public WebElement getIos_btn_availableOpportuniriesCancel() {
        return ios_btn_availableOpportuniriesCancel;
    }

    public WebElement getIos_btn_availableOpportuniriesAccept() {
        return ios_btn_availableOpportuniriesAccept;
    }

    public  WebElement getIos_dashboard_back() {
        return ios_dashboard_back;
    }
}
