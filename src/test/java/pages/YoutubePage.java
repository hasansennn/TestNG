package pages;

import com.github.javafaker.Yoda;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {

    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
         @FindBy(xpath ="//input[@name='search_query']" )
    public WebElement aramaKutusu;

        @FindBy(id ="(//*[@class='guide-icon style-scope ytd-guide-entry-renderer'])[3}" )
    public WebElement aboneliklerLocate;
}
