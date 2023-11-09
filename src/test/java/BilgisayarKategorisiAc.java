import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BilgisayarKategorisiAc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        WebElement elektronik = driver.findElement(By.xpath("//span[contains(text(), 'Elektronik')]"));
        actions.moveToElement(elektronik).perform();

        WebElement bilgisayar = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Bilgisayar/Tablet']")));
        actions.moveToElement(bilgisayar).perform();
        bilgisayar.click();
    }
}
