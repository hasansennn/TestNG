package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolPage {
    public TrendyolPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookie ;

    @FindBy(xpath = "//input[@class='V8wbcUhU']")
    public WebElement aramaKutusu ;

    @FindBy(xpath = "//img[@alt='Trendyol']")
    public WebElement gorunurTest ;

    @FindBy(xpath = "//div[@class='dscrptn']")
    public WebElement aramaSonuc ;

    @FindBy(xpath = "//select")
    public WebElement onerilen ;

}
