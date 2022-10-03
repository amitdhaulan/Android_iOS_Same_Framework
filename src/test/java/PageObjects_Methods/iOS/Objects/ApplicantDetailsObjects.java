package PageObjects_Methods.iOS.Objects;

import AppiumSupport.AppiumController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicantDetailsObjects {
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    private static WebElement ios_btn_Camera_Allow;

    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Done\"]")
    private static WebElement ios_applicant_keyboard_done;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"First Name*\"]")
    private static WebElement ios_txt_firstName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ic backWhite\"]")
    private static WebElement ios_btn_applicantDetailsBack;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Last Name*\"]")
    private static WebElement ios_txt_lastName;

    @FindBy(xpath = " //XCUIElementTypeStaticText[@name=\"Cell Phone*\"]")
    private static WebElement ios_txt_cellPhone;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_homePhone;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private static WebElement ios_txt_ssn;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Date of Birth\"]")
    private static WebElement ios_date_dob;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"radio btn unchecked\"])[1]")
    private static WebElement ios_btn_usCitizenYes;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No\"]")
    private static WebElement ios_btn_usCitizenNo;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_passportId;

    @FindBy(xpath = "//XCUIElementTypeImage[@name=\"ic_attachment\"]")
    private static WebElement ios_lnk_uploadDocument;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private static WebElement ios_dd_ethnicity;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeTextField")
    private static WebElement ios_date_dateYouCanStartWork;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton")
    private static WebElement ios_btn_currentAddress;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton")
    private static WebElement ios_txt_addressLine1;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_addressLine2;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    private static WebElement ios_txt_apt;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"City*\"]")
    private static WebElement ios_txt_city;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"State*\"]")
    private static WebElement ios_txt_state;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Zip Code*\"]")
    private static WebElement ios_txt_zipcode;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeButton")
    private static WebElement ios_dropdown_lengthOfAtAboveAddress;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton")
    private static WebElement ios_btn_priorAddress;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeButton")
    private static WebElement ios_txt_priorAddress1;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private static WebElement ios_txt_priorAddress2;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    private static WebElement ios_txt_priorApt;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"City*\"]")
    private static WebElement ios_txt_priorCity;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"State*\"]")
    private static WebElement ios_txt_priorState;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Zip Code*\"]")
    private static WebElement ios_txt_priorZipcode;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
    private static WebElement ios_btn_save;

    public WebElement getIos_applicant_keyboard_done() {
        return ios_applicant_keyboard_done;
    }

    public WebElement getIos_btn_Camera_Allow() {
        return ios_btn_Camera_Allow;
    }

    public WebElement getIos_txt_firstName() {
        return ios_txt_firstName;
    }

    public WebElement getIos_txt_lastName() {
        return ios_txt_lastName;
    }

    public WebElement getIos_txt_cellPhone() {
        return ios_txt_cellPhone;
    }

    public WebElement getIos_txt_homePhone() {
        return ios_txt_homePhone;
    }

    public WebElement getIos_txt_ssn() {
        return ios_txt_ssn;
    }

    public WebElement getIos_date_dob() {
        return ios_date_dob;
    }

    public WebElement getIos_btn_usCitizenYes() {
        return ios_btn_usCitizenYes;
    }

    public WebElement getIos_btn_usCitizenNo() {
        return ios_btn_usCitizenNo;
    }

    public WebElement getIos_txt_passportId() {
        return ios_txt_passportId;
    }

    public WebElement getIos_lnk_uploadDocument() {
        return ios_lnk_uploadDocument;
    }

    public void getIos_dd_ethnicity() {
        ios_dd_ethnicity.click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel")).click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]")).click();
    }

    public void getIos_date_dateYouCanStartWork() {
        ios_date_dateYouCanStartWork.click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]")).click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]")).click();
    }

    public WebElement getIos_btn_currentAddress() {
        return ios_btn_currentAddress;
    }

    public void getIos_txt_addressLine1() throws InterruptedException {
        ios_txt_addressLine1.sendKeys("delhi");
        Thread.sleep(2000);
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Delhi Cantt Railway Station\"]")).click();
    }

    public WebElement getIos_txt_addressLine2() {
        return ios_txt_addressLine2;
    }

    public WebElement getIos_txt_apt() {
        return ios_txt_apt;
    }

    public WebElement getIos_txt_city() {
        return ios_txt_city;
    }

    public WebElement getIos_txt_state() {
        return ios_txt_state;
    }

    public WebElement getIos_txt_zipcode() {
        return ios_txt_zipcode;
    }

    public void getIos_dropdown_lengthOfAtAboveAddress() {
        ios_dropdown_lengthOfAtAboveAddress.click();
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Doral\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable")).click();
    }

    public WebElement getIos_btn_priorAddress() {
        return ios_btn_priorAddress;
    }

    public void getIos_txt_priorAddress1() throws InterruptedException {
        ios_txt_priorAddress1.sendKeys("delhi");
        Thread.sleep(2000);
        AppiumController.getDriver().findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Delhi Cantt Railway Station\"]")).click();
    }

    public WebElement getIos_txt_priorAddress2() {
        return ios_txt_priorAddress2;
    }

    public WebElement getIos_txt_priorApt() {
        return ios_txt_priorApt;
    }

    public WebElement getIos_txt_priorCity() {
        return ios_txt_priorCity;
    }

    public WebElement getIos_txt_priorState() {
        return ios_txt_priorState;
    }

    public WebElement getIos_txt_priorZipcode() {
        return ios_txt_priorZipcode;
    }

    public WebElement getIos_btn_save() {
        return ios_btn_save;
    }
}
