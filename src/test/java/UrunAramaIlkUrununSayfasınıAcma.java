import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UrunAramaIlkUrununSayfasınıAcma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Ürün, kategori veya marka ara']")));
        searchInput.click();
        searchInput.sendKeys("Kılıç");

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".searchBoxOld-yDJzsIfi_S5gVgoapx6f")));
        searchButton.click();

        WebElement ulElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.productListContent-frGrtf5XrVXRwJ05HUfU.productListContent-rEYj2_8SETJUeqNhyzSm")));
        WebElement liElement = ulElement.findElement(By.cssSelector("li.productListContent-zAP0Y5msy8OHn5z7T_K_"));
        WebElement pictureElement = liElement.findElement(By.tagName("picture"));
        WebElement imgElement = pictureElement.findElement(By.tagName("img"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", imgElement);
    }
}
