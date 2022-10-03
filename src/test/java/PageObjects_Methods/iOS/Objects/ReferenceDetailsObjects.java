package PageObjects_Methods.iOS.Objects;

import AppiumSupport.AppiumController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReferenceDetailsObjects {
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Add a Reference\"]")
    private static WebElement ios_btn_referenceAddAReference;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio btn unchecked\"])[7]")
    private static WebElement ios_btn_referenceHaveYouEverBeenBonded_Yes;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio btn unchecked\"])[8]")
    private static WebElement ios_btn_referenceHaveYouEverBeenBonded_No;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio btn unchecked\"])[9]")
    private static WebElement ios_btn_referenceHaveYouEverBeenRefusedABond_Yes;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio btn unchecked\"])[10]")
    private static WebElement ios_btn_referenceHaveYouEverBeenRefusedABond_No;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio btn unchecked\"])[11]")
    private static WebElement ios_btn_referenceHaveYouEverBeenConvicatedOfACrime_Yes;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio btn unchecked\"])[12]")
    private static WebElement ios_btn_referenceHaveYouEverBeenConvicatedOfACrime_No;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"cb checked\"]")
    private static WebElement ios_cb_referenceAgreeTermsAndCondition;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"SUBMIT\"]")
    private static WebElement ios_btn_referenceSubmit;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private static WebElement ios_txt_reference1;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    private static WebElement ios_txt_reference1AddressLine1;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    private static WebElement ios_txt_reference1AddressLine2;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    private static WebElement ios_txt_reference1Apt;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private static WebElement ios_txt_reference1City;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_reference1State;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_reference1ZipCode;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeTextField")
    private static WebElement ios_txt_reference1PhNumber;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"SAVE\"]")
    private static WebElement ios_btn_reference1Submit;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ic backWhite\"]")
    private static WebElement ios_btn_referenceBack;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    private static WebElement ios_btn_referenceDone;

    public WebElement getIos_btn_referenceAddAReference() {
        return ios_btn_referenceAddAReference;
    }

    public WebElement getIos_btn_referenceHaveYouEverBeenBonded_Yes() {
        return ios_btn_referenceHaveYouEverBeenBonded_Yes;
    }

    public WebElement getIos_btn_referenceHaveYouEverBeenBonded_No() {
        return ios_btn_referenceHaveYouEverBeenBonded_No;
    }

    public WebElement getIos_btn_referenceHaveYouEverBeenRefusedABond_Yes() {
        return ios_btn_referenceHaveYouEverBeenRefusedABond_Yes;
    }

    public WebElement getIos_btn_referenceHaveYouEverBeenRefusedABond_No() {
        return ios_btn_referenceHaveYouEverBeenRefusedABond_No;
    }

    public WebElement getIos_btn_referenceHaveYouEverBeenConvicatedOfACrime_Yes() {
        return ios_btn_referenceHaveYouEverBeenConvicatedOfACrime_Yes;
    }

    public WebElement getIos_btn_referenceHaveYouEverBeenConvicatedOfACrime_No() {
        return ios_btn_referenceHaveYouEverBeenConvicatedOfACrime_No;
    }

    public WebElement getIos_cb_referenceAgreeTermsAndCondition() {
        return ios_cb_referenceAgreeTermsAndCondition;
    }

    public WebElement getIos_btn_referenceSubmit() {
        return ios_btn_referenceSubmit;
    }

    public WebElement getIos_txt_reference1() {
        return ios_txt_reference1;
    }

    public void getIos_txt_reference1AddressLine1() throws InterruptedException {
        ios_txt_reference1AddressLine1.sendKeys("delhi");
        Thread.sleep(2000);
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Delhi Cantt Railway Station\"]")).click();
    }

    public WebElement getIos_txt_reference1AddressLine2() {
        return ios_txt_reference1AddressLine2;
    }

    public WebElement getIos_txt_reference1Apt() {
        return ios_txt_reference1Apt;
    }

    public WebElement getIos_txt_reference1City() {
        return ios_txt_reference1City;
    }

    public void getIos_txt_reference1State() {
        ios_txt_reference1State.sendKeys("Alaska");
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Alaska\"]")).click();
    }

    public WebElement getIos_txt_reference1ZipCode() {
        return ios_txt_reference1ZipCode;
    }

    public WebElement getIos_txt_reference1PhNumber() {
        return ios_txt_reference1PhNumber;
    }

    public WebElement getIos_btn_reference1Submit() {
        return ios_btn_reference1Submit;
    }

    public WebElement getIos_btn_referenceBack() {
        return ios_btn_referenceBack;
    }

    public WebElement getIos_btn_referenceDone() {
        return ios_btn_referenceDone;
    }
}
