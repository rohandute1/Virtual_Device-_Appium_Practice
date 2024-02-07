package com.bridgelabz;

import com.google.common.collect.ImmutableMultimap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonWebApp {
    AndroidDriver driver;
    @Test
    public void setUrl() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        cap.setCapability("chomeOptions", ImmutableMultimap.of("w3c",false));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        System.out.println("Chrome started successfully");
        Thread.sleep(2000);
        driver.get("https://www.amazone.com");
        Thread.sleep(6000);
        WebElement element = driver.findElement(By.name("k"));
        element.sendKeys("Iphone");
        element.click();
    }
    @Test
    public void addProductToCart(){

    }
    @Test
    public void buyProduct(){

    }
}
