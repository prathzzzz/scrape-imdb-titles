import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class ScrapeTopTitles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://m.imdb.com/chart/top/");
        driver.manage().window().maximize();
        List<WebElement> movieElements = driver.findElements(By.xpath("//li[contains(@class, 'ipc-metadata-list-summary-item')]//h3[contains(@class, 'ipc-title__text')]"));

        for (WebElement movieElement : movieElements) {
            System.out.println(movieElement.getText());
        }
    }
}
