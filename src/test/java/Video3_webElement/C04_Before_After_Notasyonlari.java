package Video3_webElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.jimage.BasicImageReader;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Before_After_Notasyonlari {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        driver.get("https:www.amazon.com");
    }
    @Test @Ignore
    public void test02() {
        // title yazdiralim
        System.out.println(driver.getTitle());

    }
    @Test
    public void test03() {

        driver.get("https:www.facebook.com");
    }
}
