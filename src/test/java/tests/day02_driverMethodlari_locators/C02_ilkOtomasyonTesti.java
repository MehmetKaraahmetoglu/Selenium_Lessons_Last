package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkOtomasyonTesti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//tam ekran

        //2. Yeni bir class olusturalim : C03_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        System.out.println("Title: " + driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }

        System.out.println("Sayfadaki actualTitle: " + actualTitle);

        //6. Sayfa adresini(url) yazdirin
        System.out.println("Actual sayfa URL'i: " + driver.getCurrentUrl());

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrlIcerik="amazon";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAILED");
        }

        //8. Sayfa handle degerini yazdirin
        System.out.println("Sayfa handle degeri: " + driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSayfaIcerigi = "alisveris";
        String actualSayfaKaynakKodlari = driver.getPageSource();

        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerigi)){
            System.out.println("Sayfa kaynagi testi PASSED");

        }else {
            System.out.println("Sayfa kaynagi testi FAILED");
            System.out.println("Sayfa kaynak kodlari '" + expectedSayfaIcerigi + "' kelimesi icermiyor.");
        }

        //10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();

    }
}
