package com.yesim.page;

import com.yesim.util.BasePageUtil;
import com.yesim.contants.General_Contants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePageUtil implements General_Contants {

    public LoginPage(WebDriver driver) { super(driver); }

    public void login(String email, String password) {
        clickElement(MY_ACCOUNT);
        clickElement(login); //Anasayfada giris yap butonuna tikla

        sendKey(EMAİL,email); //email alan
        sendKey(PASSWORD,password); //sifre alan doldur
        thread(500);
        click(BTN_LOGİN); //bilgileri girdikten sonra giris butonuna tikla
        //Assert.assertTrue(" Giris yapılamadı",getTitle().contains("Üye Giriş Sayfası"));
        thread(2000);
        Assert.assertTrue("Hata mmsajı düzgün görüntülenemedi!",getText(WARNING_MESSAGE).contains("E-posta adresiniz ya da şifreniz yanlış."));
        //System.out.println("E-posta adresiniz ya da şifreniz yanlış."); //bu bilgilere ait kayıtlı kullanıcı bulunamadı uyarı metni

        thread(5000);

    }

    public void ProductSearch(String productName){
        sendKey(SEARCH,productName);
        thread(1000);
        clickElement(By.id("buttonProductSearch"));
        thread(100000);
        Assert.assertTrue("Görüntülenemedi",getText(By.className("product-title title")).contains("iPhone 7"));
        thread(1000);
    }

}
