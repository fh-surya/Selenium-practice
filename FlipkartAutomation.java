import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FlipkartAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
            WebElement phones = driver.findElement(By.xpath("//a[@aria-label='Mobiles & Tablets']"));
            phones.click();
            Thread.sleep(2000);
            WebElement moto = driver.findElement(By.xpath("//a[@title='MOTOROLA G96 5G (Pantone Ashleigh Blue, 256 GB)']"));
            Actions action = new Actions(driver);
            action.scrollToElement(moto);
            Thread.sleep(2000);
            moto.click();
            ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(handles.get(1));
            WebElement addToCart = driver.findElement(By.xpath("//button[@class='dSM5Ub ugg2XR IUmgrZ']"));
            addToCart.click();
            Thread.sleep(2000);
            driver.switchTo().window(handles.get(0));
            Thread.sleep(2000);
            WebElement viewAll= driver.findElement(By.xpath("//a[@class='dSM5Ub KtnAdx'][1]"));
            viewAll.click();
            Thread.sleep(10000);
            List<WebElement> totalCount = driver.findElements(By.xpath("//div[@class=\"RG5Slk\"]"));
            System.out.println(totalCount.size());






        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
