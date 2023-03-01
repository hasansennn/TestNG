package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HaberturkPage {

    public HaberturkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(xpath = "(//a[@class='name '])[1]" )
    public WebElement gundemClick;
}

