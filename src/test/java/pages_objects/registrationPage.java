package pages_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static pages_objects.homePage.driver;

public class registrationPage {



    public static String registration_button = "//*[@id=\"NewRegistration\"]";
    public static String salutation_field = "//*[@id=\"Salutation\"]";
    public static String first_name_field = "//*[@id=\"firstname\"]";
    public static String last_name_field = "//*[@id=\"lastname\"]";
    public static String emailId_field = "//*[@id=\"emailId\"]";
    public static String phoneNumber_field = "//*[@id=\"contactNumber\"]";
    public static String username_field = "//*[@id=\"usr\"]";
    public static String password_field = "/html/body/center/div/form/div/input[6]";

    public static String submit_button = "//*[@id=\"first_form\"]/div/div[2]/center/input";
    public static String registration_message = "/html/body/center[1]/h1";

    public final static String slt = "Mr";
    public final static String fName = "john";
    public final static String lName = "Doe";
    public final static String email = "johnDoe@auto-test.fr";
    public final static String phone = "0723010102";
    public final static String usr = "test";
    public final static String pwd = "test";

    public static void click_on_registration_button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(registration_button)).click();

    }
    public static void registration_form() throws InterruptedException
    {
        Thread.sleep(2000);
        Select salutation = new Select(driver.findElement(By.xpath(salutation_field)));
        salutation.selectByValue(slt);
        WebElement firstname = driver.findElement(By.xpath(first_name_field));
        firstname.sendKeys(fName);
        WebElement lastname = driver.findElement(By.xpath(last_name_field));
        lastname.sendKeys(lName);
        WebElement emailId = driver.findElement(By.xpath(emailId_field));
        emailId.sendKeys(email);
        WebElement phoneNumber = driver.findElement(By.xpath(phoneNumber_field));
        phoneNumber.sendKeys(phone);
        WebElement username = driver.findElement(By.xpath(username_field));
        username.sendKeys(usr);
        WebElement password = driver.findElement(By.xpath(password_field));
        password.sendKeys(pwd);
        driver.findElement(By.xpath(submit_button)).click();
    }

    public static void successful_registration()
    {
        String message = driver.findElement(By.xpath(registration_message)).getText();
        assertEquals(message,"User Registered Successfully !!!");
    }
}
