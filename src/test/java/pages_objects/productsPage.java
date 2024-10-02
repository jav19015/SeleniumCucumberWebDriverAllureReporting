package pages_objects;


import org.openqa.selenium.By;


import static org.junit.Assert.assertEquals;
import static pages_objects.homePage.driver;

public class productsPage {


    public static String category_1_xpath = "/html/body/div[2]/div/div[1]/center[1]/h3";
    public static String category_2_xpath = "/html/body/div[2]/div/div[2]/center[1]/h3";
    public static String category_3_xpath = "/html/body/div[2]/div/div[3]/center[1]/h3";


    public static void FormalShoesCategory()  {

        String formalShoes = driver.findElement(By.xpath(category_1_xpath)).getText();
        assertEquals(formalShoes,"Formal Shoes");

    }
    public static void SportsCategory()  {

        String formalShoes = driver.findElement(By.xpath(category_2_xpath)).getText();
        assertEquals(formalShoes,"Sports");

    }
    public static void SneakersCategory()  {

        String formalShoes = driver.findElement(By.xpath(category_3_xpath)).getText();
        assertEquals(formalShoes,"Sneakers");

    }




}
