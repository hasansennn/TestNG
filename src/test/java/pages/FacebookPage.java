package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@title='Only allow essential cookies']")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy _9npi']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[@class='_97w4']")
    public WebElement girisYapilamadiYaziElementi;
}


