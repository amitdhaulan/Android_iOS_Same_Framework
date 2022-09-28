package PageObjects_Methods.Android.Objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAndChangePasscodeObjects {

    @FindBy(xpath="//android.widget.Button[@content-desc=\"SKIP\"]")
    private static WebElement skipLink;

    @FindBy(id="com.doral.clinician.android:id/btnOne")
    private static WebElement btn_passcodeOne;

    @FindBy(id="com.doral.clinician.android:id/btnTwo")
    private static WebElement btn_passcodeTwo;

    @FindBy(id="com.doral.clinician.android:id/btnThree")
    private static WebElement btn_passcodeThree;

    @FindBy(id="com.doral.clinician.android:id/btnFour")
    private static WebElement btn_passcodeFour;

    @FindBy(id="com.doral.clinician.android:id/btnFive")
    private static WebElement btn_passcodeFive;

    @FindBy(id="com.doral.clinician.android:id/btnSix")
    private static WebElement btn_passcodeSix;

    @FindBy(id="com.doral.clinician.android:id/btnSeven")
    private static WebElement btn_passcodeSeven;

    @FindBy(id="com.doral.clinician.android:id/btnEight")
    private static WebElement btn_passcodeEight;

    @FindBy(id="com.doral.clinician.android:id/btnNine")
    private static WebElement btn_passcodeNine;

    @FindBy(id="com.doral.clinician.android:id/btnZero")
    private static WebElement btn_passcodeZero;

    @FindBy(id="com.doral.clinician.android:id/imgBackDelete")
    private static WebElement btn_passcodeBack;

    @FindBy(id="com.doral.clinician.android:id/passcode_logout")
    private static WebElement btn_passcodeLogout;

    @FindBy(id="com.doral.clinician.android:id/changepasscode")
    private static WebElement btn_changePasscode;

    @FindBy(id="com.doral.clinician.android:id/finger")
    private static WebElement btn_changeFingerPrint;

    @FindBy(id="com.doral.clinician.android:id/img_menu")
    private static WebElement btn_passcodePageBack;

    public WebElement getbtn_passcodeOne()
    {
        return btn_passcodeOne;
    }
    public WebElement getbtn_passcodeTwo(){
        return btn_passcodeTwo;
    }
    public WebElement getbtn_passcodeThree(){
        return btn_passcodeThree;
    }
    public WebElement getbtn_passcodeFour(){
        return btn_passcodeFour;
    }
    public WebElement getbtn_passcodeFive(){
        return btn_passcodeFive;
    }
    public WebElement getbtn_passcodeSix() { return btn_passcodeSix; }
    public WebElement getbtn_passcodeSeven(){
        return btn_passcodeSeven;
    }
    public WebElement getbtn_passcodeEight(){
        return btn_passcodeEight;
    }
    public WebElement getbtn_passcodeNine(){
        return btn_passcodeNine;
    }
    public WebElement getbtn_passcodeZero(){
        return btn_passcodeZero;
    }
    public WebElement getbtn_passcodeback() { return btn_passcodeBack; }
    public WebElement getbtn_passcodeLogout(){
        return btn_passcodeLogout;
    }
    public WebElement getbtn_changePasscode(){
        return btn_changePasscode;
    }
    public WebElement getbtn_changeFingerPrint(){
        return btn_changeFingerPrint;
    }
    public WebElement getbtn_passcodePageback() { return btn_passcodePageBack;}

    public WebElement getSkipLink() { return skipLink;}
}
