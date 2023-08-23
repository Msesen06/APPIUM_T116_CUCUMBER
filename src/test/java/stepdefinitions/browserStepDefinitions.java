package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.HepsiBuradaDenemePage;
import utils.Driver;

public class browserStepDefinitions {
    HepsiBuradaDenemePage hepsiBurada=new HepsiBuradaDenemePage();
    @Given("Kullanici gerekli kurulumlari yaparak url baglantisini saglar")
    public void kullanici_gerekli_kurulumlari_yaparak_url_baglantisini_saglar() {
        Driver.getAndroidDriver().get("https://www.hepsiburada.com");
    }

    @Given("Kullanici arama kutusuna nutella degerini gonderir")
    public void kullanici_arama_kutusuna_nutella_degerini_gonderir() {
        hepsiBurada.hepsiBuradaAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
}
