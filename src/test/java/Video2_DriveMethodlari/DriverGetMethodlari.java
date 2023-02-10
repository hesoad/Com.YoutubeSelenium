package Video2_DriveMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //1- driver.get("url)--> yazdigimiz url'e gider

        driver.get("https://www.amazon.com");

        //2- driver.getTitle()--> icinde oldugu sayfanin basligini dondurur.

        System.out.println("Sayfa title : "+ driver.getTitle());

       //3- driver.getCurrentUrl()-->icinde oldugu sayfanin url'ini  döndürür

        System.out.println(driver.getCurrentUrl());// https://www.amazon.com/


        //4- driver.getPageSource()-->icinde oldugu sayfanin kaynak kodlarini dondürür
        System.out.println("===========================================================");
        System.out.println(driver.getPageSource());//Arka planda calisan sayfa kodlarini yazdirir
        System.out.println("============================================================");

        // 5 - driver.getWindowHandle() --> icinde oldugu sayfanin unique hash kodunu dondurur
        System.out.println(driver.getWindowHandle());//CDwindow-8C2F6D847F60C26D7E479C4E7EDCAD00

        //6-driver.getWindowHandles()--> dirver calisirken acilan tum sayfalarin UNOQUE HASH KODUNU DONDURUR

         }
}
