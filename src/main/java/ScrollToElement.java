    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.By;
    import org.openqa.selenium.interactions.Actions;
    
    public class ScrollToElement {
        public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "/Users/lindagaribay/Documents/Project/SeleniumSauceDemoProject/src/main/resources/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
    
            driver.get("https://formy-project.herokuapp.com/scroll");
            WebElement name = driver.findElement(By.id("name"));
            Actions actions = new Actions(driver);
            actions.moveToElement(name);
            name.sendKeys("Linda Garibay");
            WebElement date = driver.findElement(By.id("date"));
            date.sendKeys("23/08/2022");   
            driver.quit();
        }
        
    }     

