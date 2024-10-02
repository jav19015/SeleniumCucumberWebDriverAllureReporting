package pages_objects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {

    public static WebDriver driver;

    public static String hamburger_menu = "//*[@id=\"menuToggle\"]/input";
    public static String signInPortal_menu_link = "//*[@id=\"menu\"]/a[2]/li";


    public static void click_hamburger_menu() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu)).click();
    }

    public static void click_signInPortal_link() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(signInPortal_menu_link)).click();
    }




    public static void close_navigator()
    {
        driver.quit();
    }

}
