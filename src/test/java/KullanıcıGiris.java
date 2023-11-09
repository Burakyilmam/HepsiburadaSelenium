import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KullanıcıGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement myAccount = driver.findElement(By.id("myAccount"));
        actions.moveToElement(myAccount).perform();
        WebElement login = driver.findElement(By.id("login"));
        actions.moveToElement(myAccount).perform();
        login.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='username']")));
        WebElement txtUser = driver.findElement(By.cssSelector("input[name='username']"));
        txtUser.sendKeys("deneme@deneme.com");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[name='btnLogin']")));
        WebElement LoginBtn = driver.findElement(By.cssSelector(("button[name='btnLogin']")));
        LoginBtn.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='password']")));
        WebElement Password = driver.findElement(By.cssSelector(("input[name='password']")));
        Password.sendKeys("123");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[name='btnEmailSelect']")));
        WebElement btnEmailSelect = driver.findElement(By.cssSelector(("button[name='btnEmailSelect']")));
        btnEmailSelect.click();
    }
}
