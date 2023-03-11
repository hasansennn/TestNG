package tests.day10_TestNGFramework;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class C06_TrendyolLogin {
/*
Bir class oluşturun: TrendyolPage
1) https://www.trendyol.com adresine gidin
2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
○ imageTest => Trendyol resminin görüntülendiğini (isDisplayed()) test edin
○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
○ wrongTitleTest => Sayfa basliginin “trendyol” olmadigini dogrulayin
 */
TrendyolPage trendyolPage=new TrendyolPage();
@BeforeClass
public void setup(){
    Driver.getDriver().get(ConfigReader.getProperty("trendUrl"));
    ReusableMethods.bekle(3);
    trendyolPage.cookie.click();
}
@Test
public void test01() {
    //titleTest => Sayfa başlığının “Trendyol” oldugunu test edin
    String expectedTitle = "Trendyol";
    String actualTitle = Driver.driver.getTitle();
    Assert.assertTrue(actualTitle.contains(expectedTitle));
}
    @Test
    public void test02(){
        // imageTest => Trendyol resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(trendyolPage.gorunurTest.isDisplayed());
    }
    @Test
    public void test03(){
    //Search Box 'in erisilebilir oldugunu test edin (isEnabled())
       Assert.assertTrue(trendyolPage.aramaKutusu.isEnabled());
       trendyolPage.aramaKutusu.sendKeys("Bilgisayar"+ Keys.ENTER);
        System.out.println(trendyolPage.aramaSonuc.getText());
       Select select=new Select(trendyolPage.onerilen);
        List<WebElement> optionElementListesi= select.getOptions();
        for (WebElement each:optionElementListesi
             ) {
            System.out.println(each.getText());
        /*
         List<WebElement> optionElementListesi= select.getOptions();
        System.out.println("======");
        for (WebElement eachelement: optionElementListesi
        ) {
            System.out.println(eachelement.getText());
        }
         */

        }
        /*
         WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Books");
         */


    }

    @AfterClass
    public void treadDown(){
    //Driver.getDriver().quit();

        }









}


