package PageObjects_Methods.iOS.Objects;

import AppiumSupport.AppiumController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmergencyContactObjects {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private static WebElement ios_txt_emergencyContact1Name;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_emergencyContact1PhNumber;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton")
    private static WebElement ios_txt_emergencyContact1AddressLine1;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    private static WebElement ios_txt_emergencyContact1AddressLine2;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeTextField")
    private static WebElement ios_txt_emergencyContact1Apt;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeTextField")
    private static WebElement ios_txt_emergencyContact1City;

    @FindBy(id = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_emergencyContact1State;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeTextField")
    private static WebElement ios_txt_emergencyContact1Zipcode;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeTextField")
    private static WebElement ios_dd_emergencyContact1Relationship;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"SAVE\"]")
    private static WebElement ios_btn_emergencyContact1Submit;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ic backWhite\"]")
    private static WebElement ios_btn_emergencyContact1Back;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"SUBMIT\"]")
    private static WebElement ios_btn_emergencyContactSubmit;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ADD CONTACT\"]")
    private static WebElement ios_btn_emergencyContactAddContact;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ic backWhite\"]")
    private static WebElement ios_btn_emergencyContactBack;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    private static WebElement ios_btn_emergencyContactDone;

    public WebElement getIos_txt_emergencyContact1Name() {
        return ios_txt_emergencyContact1Name;
    }

    public WebElement getIos_txt_emergencyContact1PhNumber() {
        return ios_txt_emergencyContact1PhNumber;
    }

    public void getIos_txt_emergencyContact1AddressLine1(String str) {
        ios_txt_emergencyContact1AddressLine1.sendKeys(str);
        //driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Gurugram bus stand\"]")).click();
    }

    public WebElement getIos_txt_emergencyContact1AddressLine2() {
        return ios_txt_emergencyContact1AddressLine2;
    }

    public WebElement getIos_txt_emergencyContact1Apt() {
        return ios_txt_emergencyContact1Apt;
    }

    public WebElement getIos_txt_emergencyContact1City() {
        return ios_txt_emergencyContact1City;
    }

    public WebElement getIos_txt_emergencyContact1State() {
        return ios_txt_emergencyContact1State;
    }

    public WebElement getIos_txt_emergencyContact1Zipcode() {
        return ios_txt_emergencyContact1Zipcode;
    }

    public void getIos_dd_emergencyContact1Relationship() {
        ios_dd_emergencyContact1Relationship.click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")).click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]")).click();
    }

    public WebElement getIos_btn_emergencyContact1Back() {
        return ios_btn_emergencyContact1Back;
    }

    public WebElement getIos_btn_emergencyContact1Submit() {
        return ios_btn_emergencyContact1Submit;
    }

    public WebElement getIos_btn_emergencyContactBack() {
        return ios_btn_emergencyContactBack;
    }

    public WebElement getIos_btn_emergencyContactSubmit() {
        return ios_btn_emergencyContactSubmit;
    }
    public WebElement getIos_btn_emergencyContactAddContact() {
        return ios_btn_emergencyContactAddContact;
    }

    public WebElement getIos_btn_emergencyContactDone() {
        return ios_btn_emergencyContactDone;
    }
}
