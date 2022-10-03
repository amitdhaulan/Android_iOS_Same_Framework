package Common;


import AppiumSupport.AppiumController;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class ScrollPage<TouchActions> extends AppiumController {

    public void scroll() throws InterruptedException {
        Thread.sleep(2000);
        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * .5);
        int start_y = (int) (dimension.height * .8);

        int end_x = (int) (dimension.width * .2);
        int end_y = (int) (dimension.height * .3);

        TouchAction touch = new TouchAction((AndroidDriver)AppiumController.getDriver());
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();

    }
}
