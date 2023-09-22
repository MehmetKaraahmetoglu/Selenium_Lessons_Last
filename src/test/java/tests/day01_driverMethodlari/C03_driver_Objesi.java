package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driver_Objesi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Tam ekranda acmak istersek alttaki kodu kullaniriz.
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        driver.close(); //bu method actigimiz browseri kapatir, gözle görülemeyebilir bu.
        //Thread.sleep ile görmek istedigimizde bekleme süresini uzatabiliriz
        //burda exception firlatabilir uyarisi verdiginde import edersek sorun olmaz.

        //driver.get icinde URL yazarken, www yazmadan istedigimiz yere gideriz
        //ancak https:// yazmasak gitmez


    }
}
