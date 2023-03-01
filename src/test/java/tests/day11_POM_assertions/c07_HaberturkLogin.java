package tests.day11_POM_assertions;

import org.testng.annotations.Test;
import pages.FacebookPage;
import pages.HaberturkPage;
import utilities.ConfigReader;
import utilities.Driver;

public class c07_HaberturkLogin {

    @Test
    public void haberturkTesti() {
        HaberturkPage haberturkPage = new HaberturkPage();
        //1 - https://www.haberturk.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("haberturkUrl"));

        //2 - gundem basligini click edin
        haberturkPage.gundemClick.click();



    }
}
