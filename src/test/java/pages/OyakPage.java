package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class OyakPage {
    public OyakPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='header_menu_content_link'])[26]")
    public WebElement uyeGrupSirket;

    @FindBy(xpath = "(//input[@class='login-form__item__input'])[1]")
    public WebElement uyeGirisiLogin;

    @FindBy(xpath = "(//input[@class='login-form__item__input'])[2]")
    public WebElement uyeGirisiSifre;

    @FindBy(xpath = "//input[@class='login-form__control__captcha']")
    public WebElement guvenlikKodu;

    @FindBy(xpath = "//button[@class='button colored']")
    public WebElement girisButton;

    @FindBy(xpath = "//div[@id='slidingDiverrorGelen']")
    public WebElement basarisizGiris;



}
