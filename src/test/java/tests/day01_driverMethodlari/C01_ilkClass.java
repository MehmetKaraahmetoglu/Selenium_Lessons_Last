package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {
    public static void main(String[] args) {

        /* Test icin her class olusturdugumuzda ilk yapmamiz gereken
         WebDriver objesi olusturmaktir.
         WebDriver objesi istedigimiz browser'in bir kopyasini olusturup
         istedigimiz web islemlerini yapacak.

         Her browser'in dosyasi farkli oldugundan projemizde kullanmak istedigimiz
         her browser'in driverini selenium.dev'de ki browser bolumunden indirip
         projemize kopyaliyoruz.
         */


        // Her class'da o class'da kullanacagimiz browser'i tanitmaliyiz

        System.setProperty("webdriver.com.driver","kurulumDosyalari/chromedriver-win64/chromedriver.exe");

        // WebDriver objesi olusturalim

        WebDriver driver = new ChromeDriver();

        //Artik bu driver objesi ile istenen otomasyonlari yapabiliriz.

        driver.get("https://www.amazon.com");

        //Olusturacagimiz her class da bunu yapmak zorundayiz.



    }
}
