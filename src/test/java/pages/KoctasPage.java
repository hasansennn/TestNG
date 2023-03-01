package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoctasPage {

    public KoctasPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }



}
