package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiBuradaLoginPage {
    public HepsiBuradaLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//*[@title='Giriş Yap']")
    public WebElement girisYapTitle;
@FindBy(id = "login")
    public WebElement girisYapButton;
@FindBy (xpath = "(//*[@id='txtUserName'])[1]")
    public WebElement e_posta;
@FindBy(xpath = "(//*[text()='Giriş yap'])[2]")
    public WebElement btnLogin;
@FindBy (xpath = "(//*[@name='password'])[1]")
    public WebElement sifre;
@FindBy(id = "btnEmailSelect")
    public WebElement btnLogin2;
@FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement aramaKutusu;
@FindBy (xpath = "//*[text()='Sepete ekle']")
    public WebElement sepeteEkle;
@FindBy (xpath = "//*[text()='Sepete git']")
    public WebElement sepeteGit;
@FindBy(xpath = "//*[text()='Alışverişi tamamla']")
    public WebElement alisverisTamamla;
@FindBy(xpath = "//*[text()='Diğer ödeme seçenekleri']")
    public WebElement odemesec;
@FindBy(xpath = "//*[text()='Çoklu kredi kartı']")
    public WebElement cokluKrediKarti;












}
