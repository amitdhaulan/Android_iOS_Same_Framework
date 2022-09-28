/*
package common;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static AndroidDriver driver;
    public static Properties properties;
    static BufferedReader reader;
    static String propertyFilePath = "";

    @BeforeClass
    public void beforeClass() throws FileNotFoundException, MalformedURLException {
        //loading property file
        loadProperty();
        File file=new File(properties.getProperty("path"));

        //Set Desired Capabilities
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        capability.setCapability("autoGrantPermissions", true);
        capability.setCapability("idleTimeout", 70 - 600);
        capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
    }

    public static void loadProperty() throws FileNotFoundException {
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

    public static WebDriver getDriver() {
        return driver;
    }

    public static void implicitWait() {
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    }

}
*/
