import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/lindagaribay/Documents/Project/SeleniumSauceDemoProject/src/main/resources/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
    
            driver.get("https://formy-project.herokuapp.com/datepicker");
        
            WebElement dateField = driver.findElement(By.id("datepicker"));
            dateField.sendKeys("29/08/2022");
            dateField.sendKeys(Keys.RETURN);

            driver.quit();
        }
        
    }     


