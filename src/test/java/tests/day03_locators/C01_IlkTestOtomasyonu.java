package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // ====== amazon ana sayfaya gidin ======
        driver.get("https://www.amazon.com");


        //====== arama kutusuna "Nutella" yazdirip aratin ======
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // yukarda esitligin sag tarafi arama butonu, bunu aramaKutuuna kaydedince artik ona istedigimizi yaptirabiliriz.
        //Once arama kutusunu findElement() ve Locator ile driver'a tanitip
        // o webelement'i bu class'da kullanabilecegimiz sekilde kaydetmeliyiz

        /*
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit(); // submit ile arama butonuna tikla yani ara dedik
        Bu islemi 2 satirda yapmak erine
        istersek asagidaki gibi de yapabiliriz
         */

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER); //Nutella yaz enter bas





        // ====== arama sonuclarinin "Nutella" icerdigini test edin. ======
        //ByclassName locator'i class attribute'unun degeri bosluk icerdiginden
        //saglikli CALISMAZ.
        //Cogunlukla class ismi ayni ozelliklerde ki webelementleri gruplandirmak icin kullanilir.
        //Biz de class degeri  sg-col-inner arattigimizda 73 tane webelement buldu.


        //WebElement aramaSonucElementi = driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
        //neden class name  sectik? cunku html icinde class isimlendirmesini kullanarak unique tanimlamayi bulduk
        //ama bosluk icerdigi icin ariza verdi

        //WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));
        // yukardaki satir calisti ama birde alttaki secenek vardir

        List<WebElement> elementler = driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonucu = elementler.get(0).getText();

        // 73 tane sonucu bir liste icine aldik. HTML den biliyoruz ki ilk sirada bizim istedigimiz alan
        // o sebeple listede ilk elemani getirdik

        String expectedIcerik = "Nutella";

        if (actualAramaSonucu.contains(expectedIcerik)){
            System.out.println("Ilk otomasyon testi PASSED.");
        }else{
            System.out.println("Ilk otomasyon testi FAILED.");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
