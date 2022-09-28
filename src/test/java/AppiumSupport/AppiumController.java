package AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    public static OS executionOS = OS.ANDROID;
    public static Properties properties;
    static BufferedReader reader;
    static String propertyFilePath = "";

    public enum OS {
        ANDROID,
        IOS
    }

    public static AppiumController instance = new AppiumController();
    public static AppiumDriver driver;

    @BeforeTest
    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (executionOS) {
            case ANDROID:
                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File(classpathRoot, "/app/Android");
                File app = new File(appDir, "doral clinician july 27, 2022.apk");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50i");
                capabilities.setCapability(MobileCapabilityType.TIMEOUTS, "50000");

                capabilities.setCapability("autoGrantPermissions", true);
                capabilities.setCapability("app", app.getAbsolutePath());
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case IOS:
                classpathRoot = new File(System.getProperty("user.dir"));
                appDir = new File(classpathRoot, "/app/iOS/");
                app = new File(appDir, "ContactsSimulator.app");
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("deviceName", "iPhone 7");
                capabilities.setCapability("app", app.getAbsolutePath());
                capabilities.setCapability("automationName", "XCUITest");
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;

        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void implicitWait() {
        getDriver().manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    }

    public void loadProperty() throws FileNotFoundException {
        propertyFilePath = ".\\src\\main\\resources\\configs\\Configuration.properties";
        reader = new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
        try {
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static AppiumDriver getDriver() {
        return driver;
    }

    @AfterTest
    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
