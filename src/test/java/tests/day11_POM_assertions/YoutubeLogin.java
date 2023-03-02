package tests.day11_POM_assertions;

import org.testng.annotations.Test;
import pages.YoutubePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class YoutubeLogin {

    @Test
    public void youtubeTest(){
        YoutubePage youtubePage=new YoutubePage();
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

        youtubePage.aramaKutusu.click();
      //  ReusableMethods.bekle(3);
       // Actions actions= new Actions(Driver.getDriver());
      //  actions.moveToElement(a)
        youtubePage.aramaKutusu.sendKeys(ConfigReader.getProperty("youtubeAranacakKelime"));
        ReusableMethods.bekle(2);

       ;

    }
}
