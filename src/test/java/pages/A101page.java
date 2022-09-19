package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101page {
    public A101page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[normalize-space()='Giyim & aksesuar']")//a[normalize-space()='Giyim & aksesuar']
    public WebElement giyimAksesuar;
    @FindBy(xpath = "//div[@class='categories']/ul//a[@title='Kadın İç Giyim']")
    public WebElement icGiyim;
    @FindBy(xpath = "//div[@class='categories']/ul//a[@title='Dizaltı Çorap']")
    public WebElement dizAlti;
    @FindBy(xpath = "//a[@title='Penti Kadın 50 Denye Pantolon Çorabı Siyah']//h3[@class='name']")
    public WebElement siyahCorap;
    @FindBy(xpath = "//h1[@class='product-name js-name']")
    public WebElement siyahCorapText;
    @FindBy(xpath = "//div[@class='container']//div[@class='col-sm-3']/div[1]/button")
    public WebElement sepeteEkle;
    @FindBy(xpath = "//div[@id='js-modal-basket']/div[@class='right-side']/a[3]")
    public WebElement sepetiGoruntule;
    @FindBy(xpath = "//div[@class='page-basket']//a[@title='Sepeti Onayla']")
    public WebElement sepetiOnayla;
    @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevam;
    @FindBy(xpath = "//form[@method='post']//input[@name='user_email']")
    public WebElement mailGir;
    @FindBy(xpath = "//button[normalize-space()='DEVAM ET']")
    public WebElement mailKayit;
    @FindBy(xpath = "//div[@class='addresses']/div[@class='list']/ul[2]//a[@title='Yeni adres oluştur']")
    public WebElement yeniAdrsOlstr;
    @FindBy(xpath = "//div//form[@method='post']//input[@name='title']")
    public WebElement adresBasligi;
    @FindBy(xpath = "//div//form[@method='post']//input[@name='first_name']")
    public WebElement isim;
    @FindBy(xpath = "//div//form[@method='post']//input[@name='last_name']")
    public WebElement soyisim;
    @FindBy(xpath = "//div//form[@method='post']//input[@name='phone_number']")
    public WebElement tel;
    @FindBy(xpath = "//form[@method='post']//select[@name='city']")
    public WebElement il;
    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilce;
    @FindBy(xpath = "//select[@name='district']")
    public WebElement mahalle;
    @FindBy(xpath = "//textarea[@name='line']")
    public WebElement adrs;
    @FindBy(xpath = "//button[normalize-space()='KAYDET']")
    public WebElement adrsKaydet;
    @FindBy(xpath = "//button[normalize-space()='Kaydet ve Devam Et']")
    public WebElement kaydetDevamET;
    @FindBy(xpath = "//div[2]/form[@method='post']//input[@name='name']")
    public WebElement cartAdSoyad;
    @FindBy(xpath = "//div[@class='form-area js-new-creditcard-area']/div[2]/label/input[@type='tel']")
    public WebElement cartNo;
    @FindBy(xpath = "//div[2]/form[@method='post']//select[@name='card_month']")
    public WebElement cartAy;
    @FindBy(xpath = "//div[2]/form[@method='post']//select[@name='card_year']")
    public WebElement cartYil;
    @FindBy(xpath = "//div[2]/form[@method='post']//input[@name='card_cvv']")
    public WebElement cartCvc;
    @FindBy(xpath = "label[for='agrement2']")
    public WebElement onBilgiTik;
    @FindBy(xpath = "//span[@class='order-complete']")
    public WebElement siparisTamam;
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement siparisTamamCıkıs;
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div")
    public WebElement siparisTamambanka;
    @FindBy(xpath = "//button[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")
    public WebElement cerez;

}
