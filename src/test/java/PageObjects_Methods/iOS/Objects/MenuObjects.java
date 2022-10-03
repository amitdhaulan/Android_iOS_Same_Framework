package PageObjects_Methods.iOS.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuObjects {
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"ic menu\"]")
    private static WebElement btn_menu;

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Profile\"]")
    private static WebElement btn_profile;


    public WebElement getBtn_menu()
    {
        return btn_menu;
    }
    public WebElement getBtn_profile()
    {
        return btn_profile;
    }
}
