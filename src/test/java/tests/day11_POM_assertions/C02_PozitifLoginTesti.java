package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_PozitifLoginTesti {


    @Test(groups = "smoke")
    public void pozitifLoginTesti() {

        ReusableMethods.bekle(2);
            // qd anasayfaya gidin
            Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

            // login linkine tiklayin
            QdPage qdPage = new QdPage();
            qdPage.ilkLoginLinki.sendKeys(Keys.ENTER);

            // gecerli kullanici adi ve password ile giris yapin
            qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
            qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
            qdPage.loginButonu.sendKeys(Keys.ENTER);

            // basarili bir sekilde giris yapildigini test edin
            Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

            Driver.closeDriver();
        }
    }

