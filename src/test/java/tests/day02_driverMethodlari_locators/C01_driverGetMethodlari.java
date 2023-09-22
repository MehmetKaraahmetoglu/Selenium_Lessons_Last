package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//tam sayfa yapmak icin

        driver.get("https://www.amazon.com");

        System.out.println("Title: " + driver.getTitle()); //Sekme basligini yazdirdik

        System.out.println("URL: " + driver.getCurrentUrl());//URL yi getirdik
        System.out.println("=======================");
        //System.out.println(driver.getPageSource());//sayfanin html ve javascript kodlarini getirdi. Sadece görmek icin yaptik

        System.out.println("Window handle degeri: " + driver.getWindowHandle());
        //269BDC23DA1562F4F84E2C62713126E4

        System.out.println("Window handle degerleri seti" + driver.getWindowHandles());
        //[269BDC23DA1562F4F84E2C62713126E4]

        /*
        Webdriver her pencereye unique bir windiw handle degeri atamasi yapar.
         Her calistirdigimizda farkli deger gelmesinin sebebide budur.
        Bir test class'i calismaya basladiktan sonra birden fazla pencere de acabilir
        bu durumda tek bir window handle degeri degil
        acilan sayfa adedince windiw handle degerlerimiz olur.

        Birden fazla element olunca Selenium onlari set'e koymayi uygun görmüs.

        */

        Thread.sleep(3000);
        driver.close();
    }
}
