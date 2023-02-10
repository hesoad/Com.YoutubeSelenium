package Video2_DriveMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // 1- driver.manage().window() methodlari
        // 1 A driver.manage().window().getSize()--> icinde oldugu sayfanin pixel olarak olculerini dondurur.

        System.out.println(driver.manage().window().getSize());//(1051, 806) pixel



        //1-B driver.manage().window().getPosition() --> icinde oldugu sayfanin pixel olarak konumunu dondurur

        System.out.println(driver.manage().window().getPosition());//(9, 9)

        // 1-C driver.manage().window().setPosition(new Point(15,15));
        // icinde oldugu sayfanin  sol alt kosesini bizim yapacagimiz pixel noktasina tasir
         driver.manage().window().setPosition(new Point(15,15));

        //1-D driver.manage().window().setSize(new Dimension(900,600));
        // icinde oldugu sayfanin sol alt kosesi sabit olarak bizim yazacagimiz olculere getirir.

        driver.manage().window().setSize(new Dimension(900,600));


        // konum ve boyutu yeniledikten sonra tekrar yazdirirsak
        System.out.println("Yeni pencere olculeri:"+ driver.manage().window().getSize());// (902,602)
        System.out.println("Yeni pencere olculeri:"+ driver.manage().window().getPosition());//(13,13)

        //1- E driver.manage().window().maximize();-->icinde oldugu sayfayi maximize yapar
        driver.manage().window().maximize();
        System.out.println( driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //1-F driver.manage().window().fullscreen();-->icinde buludugu sayfayi fullscreen yapar
        driver.manage().window().fullscreen();
        System.out.println( driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //1-G driver.manage().window().minimize();-->icinde oldugu sayfayi simge durumunda kucultur
        driver.manage().window().minimize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
