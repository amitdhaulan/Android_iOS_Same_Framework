package PageObjects_Methods.Android.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuObjects {
    @FindBy(id="com.doral.clinician.android:id/ll_profile")
    private static WebElement btn_profile;

    public WebElement getBtn_profile()
    {
        return btn_profile;
    }
}
