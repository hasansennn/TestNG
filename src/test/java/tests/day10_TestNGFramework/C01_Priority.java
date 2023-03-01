package tests.day10_TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_Priority {

    // istedigimiz test methoduna istedigimiz priority ile tamnimlayabilirz
    // Selenium test methodlarini priority si kucukten buyuye olacak sekilde calistirir

    @Test(priority = 50)
    public void amazonTesti(){
        // Amazon ana sayfaya gidip, amazona gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com");

        // url amazon iceriyormu
        String expectedIcerik="amazon";
        String actualIcerik=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        Driver.closeDriver();

    }
    @Test(priority = 30)
    public void wiseTesti(){
        // Wisequarter ana sayfaya gidip, wisequarter gittigimizi test edelim
        Driver.getDriver().get("https://www.wisequarter.com");
        Driver.getDriver().navigate().refresh();

        // url wisequarter iceriyormu
        String expectedIcerik="wisequarter";
        String actualIcerik=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        Driver.closeDriver();

    }
    @Test(priority = 20)
    public void youtubeTesti(){
        // youtube ana sayfaya gidip, youtube gittigimizi test edelim
        Driver.getDriver().get("https://www.youtube.com");

        // url youtube iceriyormu
        String expectedIcerik="youtube";
        String actualIcerik=Driver.driver.getCurrentUrl();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        Driver.closeDriver();






    }
}
