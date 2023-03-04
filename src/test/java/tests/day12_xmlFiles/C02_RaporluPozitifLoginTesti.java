package tests.day12_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_RaporluPozitifLoginTesti extends TestBaseRapor {


    @Test
    public void pozitifLoginTesti() {
        extentTest=extentReports.createTest("Pozitif login Testi","gecerli bilgiler giris yapilabilmeli");

        ReusableMethods.bekle(2);
            // qd anasayfaya gidin
            Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
            extentTest.info("Qualitydemy anasayfaya gidildi");
            // login linkine tiklayin
            QdPage qdPage = new QdPage();
            qdPage.ilkLoginLinki.sendKeys(Keys.ENTER);

            // gecerli kullanici adi ve password ile giris yapin
            qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
            extentTest.info("gecerli email yazildi");
            qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
            extentTest.info("gecerli password yazildi");
            qdPage.loginButonu.sendKeys(Keys.ENTER);
            extentTest.info("Login butonuna basildi");
           ReusableMethods.bekle(5);

            // basarili bir sekilde giris yapildigini test edin
            Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
            extentTest.pass("Basarili sekilde giris yapildigi test edildi");


        }
    }

