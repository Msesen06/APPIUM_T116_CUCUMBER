package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utils.Driver;
import utils.ReusableMethods;
public class aileButcemStep {
    AileButcemPage aileButcemPage=new AileButcemPage();
    @Given("Kullanici ilgili kurulumlari tamamlayarak {int} cihazla baglantisini gerceklestirir")
    public void kullanici_ilgili_kurulumlari_tamamlayarak_cihazla_baglantisini_gerceklestirir(int bekleme) throws InterruptedException {
        Driver.getAndroidDriver();
        Thread.sleep(bekleme);
    }
    @Given("ilk ekran ayarlarini yapin ve ardindan {string} login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(String tiklanacakButon) {
        aileButcemPage.ilkEkranGecmeMethodu(tiklanacakButon);
    }
    @Given("{string} ve {string} {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String password,String tiklanacakText) {
        aileButcemPage.loginMethodu(mail,password,tiklanacakText);

    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(aileButcemPage.basaraliGirisKontrol.isDisplayed());
    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabimText) throws InterruptedException {
        Thread.sleep(5000);
        ReusableMethods.koordinatTiklama(117,135,1000);
        ReusableMethods.scrollWithUiScrollable(hesabimText);
    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin {string}")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String name,String surname,String city,String age,String job,String kaydetButon) throws InterruptedException {
        aileButcemPage.boxClear();
        aileButcemPage.editBoxes(name,surname,city,age,job);
        ReusableMethods.scrollWithUiScrollable(kaydetButon);
        aileButcemPage.assertionBox(name, surname, city, age, job);

    }

    @Given("Kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }
}
