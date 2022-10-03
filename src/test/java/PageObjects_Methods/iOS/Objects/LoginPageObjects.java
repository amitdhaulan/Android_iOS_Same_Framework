package PageObjects_Methods.iOS.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Allow\"]")
    private static WebElement ios_notification_allow;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Allow While Using App\"]")
    private static WebElement ios_location_allow;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Done\"]")
    private static WebElement ios_keyboard_done;
    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private static WebElement ios_txt_userName;

    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
    private static WebElement ios_txt_password;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Login\"]\n")
    private static WebElement ios_btn_login;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Remember Me\"]")
    private static WebElement ios_cb_rememberMe;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Forgot password ?\"]")
    private static WebElement ios_lnk_forgotPassword;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Signup Here\"]")
    private static WebElement ios_btn_SignupHere;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Ok\"]")
    private static WebElement ios_btn_wrong_input_ok;

    public WebElement getIos_notification_allow() {
        return ios_notification_allow;
    }

    public WebElement getIos_location_allow() {
        return ios_location_allow;
    }

    public WebElement getIos_keyboard_done() {
        return ios_keyboard_done;
    }

    public WebElement getIos_txt_userName() {
        return ios_txt_userName;
    }

    public WebElement getIos_txt_password() {
        return ios_txt_password;
    }

    public WebElement getIos_btn_login() {
        return ios_btn_login;
    }

    public WebElement getIos_btn_wrong_input_ok() {
        return ios_btn_wrong_input_ok;
    }
}
