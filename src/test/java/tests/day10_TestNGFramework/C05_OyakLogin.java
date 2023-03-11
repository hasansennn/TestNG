package tests.day10_TestNGFramework;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.OyakPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_OyakLogin {
    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("oyakUrl"));
    }

    @Test
    public void oyakTest() {
        OyakPage oyakPage = new OyakPage();

        Select select=new Select(oyakPage.uyeGrupSirket);
        ReusableMethods.bekle(2);
       select.selectByIndex(2);
      //  oyakPage.uyeGirisiLogin.sendKeys("uyeGirisiLogin");
       // Actions actions=new Actions(Driver.getDriver());
       // actions.sendKeys(uyeGirisiSifre)
    /*

        actions.sendKeys(kimlik.kimlikDogrulamMail,ConfigReader.getProperty("email")).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("nevzat").
                sendKeys(Keys.TAB).
                sendKeys("celik").
                sendKeys(Keys.TAB).
                sendKeys("varsova").
                sendKeys(Keys.TAB).
                sendKeys("15600").
                sendKeys(Keys.TAB).
                sendKeys("Varsova").
                sendKeys(Keys.TAB).
                sendKeys("11111111111").perform();
     */

    }

    @AfterClass
        public void treadDown(){
           // Driver.closeDriver();


    }
}