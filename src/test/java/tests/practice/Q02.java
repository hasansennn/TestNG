package tests.practice;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Q02 {

    /*
        - Birbirine bagimli testler olusturun.
        - Configreader ile
            =>ilk once wisequarter'a gidin
            =>sonra facebook'a bagimli olarak youtube'a gidin
            =>daha sonra google'a bagimli olarak amazon'a gidin
        - driver'i kapatin.
     */

    @Test
    public void wisequarter(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }
    @Test(dependsOnMethods = "wisequarter")
    public void youtube(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

    }
    @Test(dependsOnMethods = "youtube")
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
}
