import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/lindagaribay/Documents/Project/SeleniumSauceDemoProject/src/main/resources/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
    
            driver.get("https://formy-project.herokuapp.com/fileupload");
           
            WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
            fileUploadField.sendKeys("PNG_transparency_demonstration_1.png");
            
            driver.quit();
        }
        
    } 
