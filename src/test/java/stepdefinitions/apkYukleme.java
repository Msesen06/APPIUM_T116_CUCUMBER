package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apkYukleme {
    AndroidDriver<AndroidElement> driver;

    @Given("kullanici yuklemek istedigi {string} {string} {string} {string} {string} uygulamayi yukler")
    public void kullanici_yuklemek_istedigi_uygulamayi_yukler(String cihazIsmi, String platformVersion, String platformName, String automationName, String app) throws MalformedURLException {




        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformVersion);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,automationName);

        capabilities.setCapability(MobileCapabilityType.APP,app);

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("Kullanici yukleme yapmak istedigi {string} {string} {string} {string} {string} apk dosyasini belirleyerek yukleme yapar")
    public void kullanici_yukleme_yapmak_istedigi_apk_dosyasini_belirleyerek_yukleme_yapar(String cihazIsmi, String platformVersion, String platformName, String automationName, String apk) throws MalformedURLException {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,cihazIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,automationName);

        capabilities.setCapability(MobileCapabilityType.APP,apk);

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
