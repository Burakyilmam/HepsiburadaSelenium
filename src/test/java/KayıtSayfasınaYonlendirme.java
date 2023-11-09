import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KayıtSayfasınaYonlendirme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement myAccount = driver.findElement(By.id("myAccount"));
        actions.moveToElement(myAccount).perform();
        WebElement register = driver.findElement(By.id("register"));
        actions.moveToElement(myAccount).perform();
        register.click();
    }
}
