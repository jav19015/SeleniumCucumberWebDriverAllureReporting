package pages_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages_objects.homePage.driver;

public class loginPage {


    public static String username_field_xpath = "//*[@id=\"usr\"]";
    public static String password_field_xpath = "//*[@id=\"pwd\"]";
    public static String login_button_xpath = "//*[@id=\"second_form\"]/input";
    private final static String username = "so";
    private final static String password = "so";

    public static void types_username() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(username_field_xpath)).sendKeys(username);
    }
    public static void types_password() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field_xpath)).sendKeys(password);
    }

    public static void click_on_login_button() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(By.xpath(login_button_xpath)).click();
    }
}
