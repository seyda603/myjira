package com.myjira.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private Driver() {}

    private static WebDriver driver;

    public static WebDriver get() {
        if (driver == null) {

            String browser = ConfigurationReader.get("browser");
            switch (browser) {
                case "chrome":
                    DesiredCapabilities desiredCap = DesiredCapabilities.chrome();
                    desiredCap.acceptInsecureCerts();
                    desiredCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                    desiredCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

                    ChromeOptions cOption = new ChromeOptions();
                    cOption.merge(desiredCap);

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(cOption);
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "chrome-eager":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setPageLoadStrategy(PageLoadStrategy.EAGER));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }



        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}