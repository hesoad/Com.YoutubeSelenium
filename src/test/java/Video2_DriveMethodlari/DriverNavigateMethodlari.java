package Video2_DriveMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //1- driver.navigate.to ("url)--> yazdigimiz url'e gider
        // dirver.get("url ") ile ayni islemi yapar ama forward ve back yapilmasi imkan tanir

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");
        // dirver.get("url ") ile ayni islemi yapar ama forward ve back yapilmasi imkan tanir

       //2-driver.navigate().back();--> Bir onceki  sayfaya donus yapar
        driver.navigate().back();// ornegimizde amazona donus yapacaktir


       //3- driver.navigate().forward();--> back() ile geldigi sayfaya yeniden gider

        driver.navigate().forward();// ornegimizde facebook'a donus yapacaktir

       //4- driver.navigate().refresh(); --> icinde oldugu sayfayi yeniler

        driver.navigate().refresh();

       //5- Dirver olusturuldugunda Acilan sayfayi kapatmak  istersek kullaniriz .
      driver.close();

      //6-Driver calisirken birden fazla tab veya window actiysa tumunu kapatmak icin
        //driver.quit();






    }
}
