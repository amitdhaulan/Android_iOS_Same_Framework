package PageObjects_Methods.iOS.Methods;

import AppiumSupport.AppiumController;
import PageObjects_Methods.iOS.Objects.FileUploadObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class FileUploadMethods {

    public void fileUpload(WebElement ele) throws FileNotFoundException {
        FileUploadObject fileUploadObject = PageFactory.initElements(AppiumController.getDriver(), FileUploadObject.class);
        //loadProperty();
        //implicitWait();
        ele.click();
        fileUploadObject.getBtn_camera().click();
        fileUploadObject.getBtn_camera_shutter().click();
        fileUploadObject.getBtn_photo_select().click();
        fileUploadObject.getBtn_photo_crop().click();
    }
}
