package co.com.qvision.eribank.utils;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MyDriver {
    private static final Logger logger = Logger.getLogger(MyDriver.class.getName());
    //    private static AppiumDriver<MobileElement> driver;
    private static AndroidDriver<MobileElement> driver;
    static String envPlatform = "ANDROID";
    public static String plataforma = "ANDROID";

    public static void abrirApp() {

        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();

        try {
            capabilities.setCapability("deviceName", "emulator-5554");

            capabilities.setCapability("platformVersion", "5.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.experitest.ExperiBank");
            capabilities.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
            capabilities.setCapability("noReset", true);

//            driver = new AppiumDriver<MobileElement>(new URL(url), capabilities);
            driver = new AndroidDriver<MobileElement>(new URL(url), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
