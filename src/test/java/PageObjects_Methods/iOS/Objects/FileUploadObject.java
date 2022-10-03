package PageObjects_Methods.iOS.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadObject {
    @FindBy (id="com.doral.clinician.android:id/tv_camera")
    private static WebElement btn_camera;

    @FindBy (id="com.android.camera:id/shutter_button_horizontal")
    private static WebElement btn_camera_shutter;

    @FindBy (id="com.android.camera:id/done_button")
    private static WebElement btn_photo_select;

    @FindBy (id="com.doral.clinician.android:id/menu_crop")
    private static WebElement btn_photo_crop;

    public WebElement getBtn_camera() {
        return btn_camera;
    }

    public WebElement getBtn_camera_shutter() {
        return btn_camera_shutter;
    }

    public WebElement getBtn_photo_select() {
        return btn_photo_select;
    }

    public WebElement getBtn_photo_crop() {
        return btn_photo_crop;
    }
}
