package Test.Android;

import AppiumSupport.*;
import PageObjects_Methods.Android.Methods.*;
import PageObjects_Methods.Android.Objects.ProfileDetailsObjects;
import PageObjects_Methods.Android.Objects.SignUpPageObjects;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.util.Iterator;
import static Common.ExcelUtils.getSignUpUserDetails;

//To verify if the account number and confirm account number are not same, payroll details get saved or not

public class PayrollDetailsNegative extends AppiumController {
    LoginPageMethods loginPageMethods;
    SignUpPageMethods signUpPageMethods;
    SignUpPageObjects signUpPageObjects;
    ProfileDetailsMethods profileDetailsMethods;
    CreateProfileMethods createProfileMethods;
    LoginAndChangePasscodeMethods loginAndChangePasscodeMethods;
    boolean negativeSwitch = true;

    public void initializeObjects() {
        profileDetailsMethods = new ProfileDetailsMethods();
        createProfileMethods = new CreateProfileMethods();
        loginPageMethods = new LoginPageMethods();
        signUpPageMethods = new SignUpPageMethods();
        signUpPageObjects = new SignUpPageObjects();
        loginAndChangePasscodeMethods = new LoginAndChangePasscodeMethods();
    }

    @Test(dataProvider = "signupData")
    public void payrollDetailsNegative(SignupDetailsPOJO signupDetailsPOJO) throws InterruptedException {
        ProfileDetailsObjects profileDetailsObjects = PageFactory.initElements(AppiumController.getDriver(), ProfileDetailsObjects.class);

        if (negativeSwitch) {
            //Initialize objects
            initializeObjects();
            // this.signupDetailsPOJO = signupDetailsPOJO1;

            //Login to the application
            loginPageMethods.login(signupDetailsPOJO.getRegisterEmail(), signupDetailsPOJO.getRegisterPassword());
            negativeSwitch = false;
        }

        //Clicking on payroll details button
        createProfileMethods.BtnPayrollClick();

        //Completing payroll Details
        AppiumController.instance.implicitWait();
        profileDetailsObjects.getBtn_payrollDetailsMarried().click();
        profileDetailsObjects.getTxt_payrollDetailsDependentsUnder17().sendKeys(signupDetailsPOJO.getPayrollDependentsUnder17());
        profileDetailsObjects.getTxt_payrollDetailsOtherDependents().sendKeys(signupDetailsPOJO.getPayrollOtherDependents());
        profileDetailsObjects.getBtn_payrollDetailsUploadW4Docs();
        //profileDetailsObjects.getBtn_payrollDetailsBankDetails().click();
        profileDetailsObjects.getDd_payrollDetailsBankName();
        //profileDetailsObjects.getTxt_payrollDetailsAccountHolderName().sendKeys("abc");
        profileDetailsObjects.getBtn_payrollDetailsAccountTypeChecking().click();
        profileDetailsObjects.getBtn_payrollDetailsAccountTypeSaving().click();
        profileDetailsObjects.getDd_payrollDetailsBankRoutingNumber();
        profileDetailsObjects.getTxt_payrollDetailsBankAccountNumber().sendKeys(signupDetailsPOJO.getPayrollAccountNumber());
        profileDetailsObjects.getTxt_payrollDetailsConfirmAccountNumber().sendKeys(signupDetailsPOJO.getPayrollConfirmAccountNumber());
        profileDetailsObjects.getBtn_payrollDetailsTaxInfoNo().click();
        profileDetailsObjects.getBtn_payrollDetailsSave().click();
    }
    @DataProvider
    public static Iterator<Object[]> signupData() {
        File file = new File(".\\src\\main\\resources\\excel_files\\SignupDetails.xlsx");
        String sheetName = "payroll_details_negative";
        return getSignUpUserDetails(file, sheetName);
    }

    }
