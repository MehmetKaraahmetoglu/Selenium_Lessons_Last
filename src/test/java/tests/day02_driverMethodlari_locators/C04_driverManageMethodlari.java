package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //gorev odakli calisir, 15 saniye maximum suresidir.
        //gorev daha once tamamlanirsa, yoluna devam eder
        //15 saniye icinde gorev tamamlanmazsa hata verir.
        //gorev: sayfanin acilmasi ve kullanilacak web elementlerin bulunmasidir.

        System.out.println("Maximize size" + driver.manage().window().getSize()); //Maximize size(1552, 840) pixel
        System.out.println("Maximize konum" + driver.manage().window().getPosition());//Maximize size(-8, -8)

        //windiw'u fullscreen yapin
        driver.manage().window().fullscreen();

        System.out.println("Fullscreen size" + driver.manage().window().getSize()); //Fullscreen size(1536, 864)
        System.out.println("Fulscreen konum" + driver.manage().window().getPosition()); // Fulscreen konum(0, 0)


        //window'un baslangic konumunu (200,300) ve boyutunu (500,500) yapin
        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(200,300)); //monitördeki konum


        System.out.println("Customize size: " + driver.manage().window().getSize()); //Customize size(515, 500)
        System.out.println("Customize konum: " + driver.manage().window().getPosition()); // Customize konum(200, 300)

        Thread.sleep(3000); //Javadan gelir ve kodlari bekletir.
        driver.close();



    }
}
