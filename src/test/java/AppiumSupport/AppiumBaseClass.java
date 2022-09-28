package AppiumSupport;

import io.appium.java_client.AppiumDriver;

public class AppiumBaseClass {
    protected AppiumDriver driver() {
        return AppiumController.instance.driver;
    }
}
