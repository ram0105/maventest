package com.vapasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

public class BaseTest {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public DriverFactory driverFactory = new DriverFactory();

//    @BeforeMethod
//    @Parameters(value = {"browser"})
//    public void setup(String browser) throws MalformedURLException {
//        driver.set(driverFactory.getRemoteWebDriver(browser));
//    }

    public WebDriver getDriver() {
        return driver.get();
    }

//    @AfterMethod
//    public void tearDown() {
//        getDriver().quit();
//    }
//
//    @AfterClass
//    void terminate() {
//        //driver.remove();
//    }
}
