package PageObjects_Methods.Android.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjects {
    @FindBy(id="com.doral.clinician.android:id/user_profile_image")
    private static WebElement img_profileImage;

    @FindBy(id="com.doral.clinician.android:id/rel_menu")
    private static WebElement icon_menu;

    @FindBy(id="com.doral.clinician.android:id/btn_notify")
    private static WebElement btn_notifyMe;

    @FindBy(id="com.doral.clinician.android:id/btn_location")
    private static WebElement btn_shareMyLocation;

    @FindBy(id="com.doral.clinician.android:id/rel_map1")
    private static WebElement btn_activeOpportuniriesOpenMap1;

    @FindBy(id="com.doral.clinician.android:id/arrived1")
    private static WebElement btn_activeOpportuniriesArrived1;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView")
    private static WebElement btn_activeOpportuniriesCancel1;

    @FindBy(id="com.doral.clinician.android:id/rel_map3")
    private static WebElement btn_availableOpportuniriesMap;

    @FindBy(id="com.doral.clinician.android:id/hide1")
    private static WebElement btn_availableOpportuniriesHide;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
    private static WebElement btn_availableOpportuniriesAccept;

    @FindBy(id="com.doral.clinician.android:id/btnaccept1")
    private static WebElement btn_earningHideTotal;

    public WebElement getImg_profileImage() {
        return img_profileImage;
    }

    public WebElement getIcon_menu() {
        return icon_menu;
    }

    public WebElement getBtn_notifyMe() {
        return btn_notifyMe;
    }

    public WebElement getBtn_shareMyLocation() {
        return btn_shareMyLocation;
    }

    public WebElement getBtn_activeOpportuniriesOpenMap1() {
        return btn_activeOpportuniriesOpenMap1;
    }

    public WebElement getBtn_activeOpportuniriesArrived1() {
        return btn_activeOpportuniriesArrived1;
    }

    public WebElement getBtn_activeOpportuniriesCancel1() {
        return btn_activeOpportuniriesCancel1;
    }

    public WebElement getBtn_availableOpportuniriesMap() {
        return btn_availableOpportuniriesMap;
    }

    public WebElement getBtn_availableOpportuniriesHide() {
        return btn_availableOpportuniriesHide;
    }

    public WebElement getBtn_availableOpportuniriesAccept() {
        return btn_availableOpportuniriesAccept;
    }

    public static WebElement getBtn_earningHideTotal() {
        return btn_earningHideTotal;
    }
}
