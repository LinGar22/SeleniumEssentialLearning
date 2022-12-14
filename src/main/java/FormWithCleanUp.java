/*
 * import static org.junit.Assert.assertEquals;
 * import org.openqa.selenium.By;
 * import org.openqa.selenium.Keys;
 * import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.chrome.ChromeDriver;
 * import org.openqa.selenium.support.ui.ExpectedConditions;
 * import org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class FormWithCleanUp {
 * public static void main(String[] args) {
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "/Users/lindagaribay/Documents/Project/SeleniumSauceDemoProject/src/main/resources/drivers/chromedriver"
 * );
 * WebDriver driver = new ChromeDriver();
 * 
 * driver.get("https://formy-project.herokuapp.com/form");
 * 
 * 
 * FormPage formPage = new FormPage();
 * FormPage.submitForm(driver);
 * 
 * waitForAlertBanner(driver);
 * 
 * assertEquals("The form was successfully submitted!",
 * getAlertBannerText(driver));
 * 
 * driver.quit();
 * }
 * 
 * public static void waitForAlertBanner(WebDriver driver) {
 * 
 * WebDriverWait wait = new WebDriverWait(driver, 10);
 * wait.until((ExpectedConditions.visibilityOfElementLocated(By.className(
 * "alert"))));
 * 
 * }
 * 
 * public static String getAlertBannerText(WebDriver driver) {
 * return driver.findElement(By.className("alert")).getText();
 * }
 * 
 * }
 */