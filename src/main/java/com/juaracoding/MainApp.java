package com.juaracoding;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MainApp {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Infinix X688B");
        dc.setCapability("udid", "076832523J026717");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        System.out.println("Appium Start");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Main main = new Main();
        main.outcome("50000", "beli buku snbt");
        main.test(main.outcomeTxt(), "-50000");

        main.income("100000", "sisa uang jajan");
        main.test(main.incomeTxt(), "100000");

        main.delay(5);
        driver.quit();
    }
}
