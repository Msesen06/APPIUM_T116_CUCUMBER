package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
       // "com.ailebutcem","appActivity\",\"com.ailebutcem.MainActivity");
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    private MobileElement emailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    private MobileElement passwordBox;



    public void ilkEkranGecmeMethodu(String tiklanacakText){
        for (int i=0; i<6; i++){
            ReusableMethods.screenScrollDownToUp(895,1019,500,142,1019);
        }
        ReusableMethods.scrollWithUiScrollable(tiklanacakText);
    }

    public void loginMethodu(String mail,String password,String tiklanacakText){
        emailBox.sendKeys(ConfigReader.getProperty(mail)); //testfort108@gmail.com
        passwordBox.sendKeys(ConfigReader.getProperty(password)); //t108t108
        ReusableMethods.scrollWithUiScrollable(tiklanacakText); // girisyap
    }
}
