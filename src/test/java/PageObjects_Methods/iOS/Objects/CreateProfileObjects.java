package PageObjects_Methods.iOS.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProfileObjects {

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Application Details\"]")
    private static WebElement btn_applicationDetails;

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Reference Details\"]")
    private static WebElement btn_referenceDetails;

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Emergency contact\"]")
    private static WebElement btn_emergencyContact;

    @FindBy(id="com.doral.clinician.android:id/linEducationDetails")
    private static WebElement btn_educationDetails;

    @FindBy(id="com.doral.clinician.android:id/linProfessionalContact")
    private static WebElement btn_professionalDetails;

    @FindBy(id="com.doral.clinician.android:id/linBackgroundDetails")
    private static WebElement btn_workHistory;

    @FindBy(id="com.doral.clinician.android:id/linParollDetails")
    private static WebElement btn_payrollDetails;

    @FindBy(id="com.doral.clinician.android:id/linDocumentVerification")
    private static WebElement btn_documentVerification;

    public WebElement getBtn_applicationDetails()
    {
        return btn_applicationDetails;
    }
    public WebElement getBtn_referenceDetails()
    {
        return btn_referenceDetails;
    }
    public WebElement getBtn_emergencyContact()
    {
        return btn_emergencyContact;
    }
    public WebElement getBtn_educationDetails()
    {
        return btn_educationDetails;
    }
    public WebElement getBtn_professionalDetails()
    {
        return btn_professionalDetails;
    }
    public WebElement getBtn_workHistory()
    {
        return btn_workHistory;
    }

    public WebElement getBtn_payrollDetails()
    {
        return btn_payrollDetails;
    }
    public WebElement getBtn_documentVerification()
    {
        return btn_documentVerification;
    }
}
