package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(String tiklanacakButon) throws InterruptedException {

        aileButcemPage.ilkEkranGecmeMethodu(tiklanacakButon);
    }
    @Given("{string} ve {string} {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String password,String tiklanacakText) {

        aileButcemPage.loginMethodu(mail,password,tiklanacakText);

    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {


    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabimText) throws InterruptedException {
        Thread.sleep(5000);
        ReusableMethods.koordinatTiklama(117,135,1000);
        ReusableMethods.scrollWithUiScrollable(hesabimText);

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {


    }
    @Given("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    }
    @Given("Kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {

    }
}
