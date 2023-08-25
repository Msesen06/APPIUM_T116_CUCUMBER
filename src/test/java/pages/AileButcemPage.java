package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    private MobileElement emailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    private MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement basaraliGirisKontrol;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement nameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement surnameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement cityBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement ageBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement jobBox;


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

    public void boxClear() throws InterruptedException {
        nameBox.clear();
        surnameBox.clear();
        cityBox.clear();
        ageBox.clear();
        jobBox.clear();
        Thread.sleep(1000);
    }

    public void editBoxes(String name,String surname,String city,String age,String job) throws InterruptedException {
        nameBox.sendKeys(name);
        surnameBox.sendKeys(surname);
        cityBox.sendKeys(city);
        ageBox.sendKeys(age);
        jobBox.sendKeys(job);
        Thread.sleep(1000);

    }

    public void assertionBox(String name,String surname,String city,String age,String job){
        Assert.assertTrue(nameBox.getText().contains(name));
        Assert.assertTrue(surnameBox.getText().contains(surname));
        Assert.assertTrue(cityBox.getText().contains(city));
        Assert.assertTrue(ageBox.getText().contains(age));
        Assert.assertTrue(jobBox.getText().contains(job));
    }
}
