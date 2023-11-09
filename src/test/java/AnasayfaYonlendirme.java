import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnasayfaYonlendirme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/ara?q=çay");
        driver.manage().window().maximize();

        WebElement Home = driver.findElement(By.cssSelector("a[title='Hepsiburada']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Home).perform();
        Home.click();
    }
}
