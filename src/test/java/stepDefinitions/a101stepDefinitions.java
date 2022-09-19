package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.A101page;
import utilities.ConfigReader;
import utilities.Driver;

public class a101stepDefinitions {
    Faker faker = new Faker();
    A101page a101page=new A101page();

    @Given("kullanici url'ye gider")
    public void kullaniciUrlYeGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("a101url"));
        Thread.sleep(2222);
        a101page.cerez.click();
    }

    @And("Giyim ve aksesuara tiklar")
    public void giyimVeAksesuaraTiklar() throws InterruptedException {
       // Thread.sleep(2222);
        a101page.giyimAksesuar.click();
    }

    @And("Kadin icgiyim tiklanir")
    public void kadinIcgiyimTiklanir() throws InterruptedException {
        a101page.icGiyim.click();
        Thread.sleep(3333);
    }

    @And("Dizalti corap tiklanir")
    public void dizaltiCorapTiklanir() throws InterruptedException {
        a101page.dizAlti.click();
        Thread.sleep(2222);
    }

    @And("Secilen urun siyah oldugu dogrulanir")
    public void secilenUrunSiyahOlduguDogrulanir() throws InterruptedException {
        a101page.siyahCorap.click();
        String actualKelime = a101page.siyahCorapText.getText();
        System.out.println(actualKelime);
        String istenenKelime = "Penti Kadın 50 Denye Pantolon Çorabı Siyah";
        Assert.assertEquals(istenenKelime,actualKelime);
        Thread.sleep(2222);

    }

    @And("Sepete ekle butonuna tiklanir")
    public void sepeteEkleButonunaTiklanir() throws InterruptedException {
        a101page.sepeteEkle.click();
        Thread.sleep(2222);
    }

    @And("Sepeti Goruntule butonuna tıklanir.")
    public void sepetiGoruntuleButonunaTıklanir() throws InterruptedException {
        a101page.sepetiGoruntule.click();
        Thread.sleep(2222);
    }

    @And("Sepeti Onayla butonuna tıklanır.")
    public void sepetiOnaylaButonunaTıklanır() throws InterruptedException {
        a101page.sepetiOnayla.click();
        Thread.sleep(2222);
    }

    @And("Uye olmadan devam et butonuna tiklanir.")
    public void uyeOlmadanDevamEtButonunaTiklanir() throws InterruptedException {
        a101page.uyeOlmadanDevam.click();
        Thread.sleep(2222);
    }

    @And("Mail ekranina mail girilir")
    public void mailEkraninaMailGirilir() throws InterruptedException {
        a101page.mailGir.sendKeys("victory@gmail.com");
        a101page.mailKayit.click();
        Thread.sleep(2222);
    }

    @And("Yeni adres olustura tiklanir adres olusturulur kaydet ve devam et tiklanir")
    public void yeniAdresOlusturaTiklanirAdresOlusturulurKaydetVeDevamEtTiklanir() throws InterruptedException {
        a101page.yeniAdrsOlstr.click();
        a101page.adresBasligi.sendKeys("ev");
        a101page.isim.sendKeys("ali");
        a101page.soyisim.sendKeys("veli");
        a101page.tel.sendKeys("5421111111");
        a101page.il.sendKeys("i");
        a101page.ilce.sendKeys("ü");
        Thread.sleep(3333);
        a101page.mahalle.sendKeys("a");
        Thread.sleep(3333);
        a101page.adrs.sendKeys(faker.address().fullAddress());
        Thread.sleep(1111);
        a101page.adrsKaydet.click();
        Thread.sleep(2222);
        a101page.kaydetDevamET.click();
        Thread.sleep(2222);

    }

    @And("Odeme ekranina bilgiler girilir siparise tamamla tiklanir")
    public void odemeEkraninaBilgilerGirilirSipariseTamamlaTiklanir() throws InterruptedException {

        a101page.cartAdSoyad.sendKeys("Ali veli");
        a101page.cartNo.sendKeys("5571135571135575");
        a101page.cartAy.sendKeys("12");
        a101page.cartYil.sendKeys("26");
        a101page.cartCvc.sendKeys("000");
        Thread.sleep(2222);
        a101page.siparisTamam.click();
        a101page.siparisTamam.isDisplayed();
        Driver.closeDriver();


    }
}
