import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DemoQAAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        Actions actions = new Actions(driver);
        try{
            driver.get("https://demoqa.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//h5[text()=\"Elements\"]")).click();
            driver.findElement(By.xpath("//span[text()=\"Check Box\"]")).click();
            driver.findElement((By.xpath("//button[@aria-label=\"Expand all\"]"))).click();
            driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]")).click();
            List<WebElement> child = driver.findElements(By.xpath("//li[@class='rct-node rct-node-leaf']//label"));
            for (WebElement e : child) {
                e.click();
                System.out.println(driver.findElement(By.xpath("//span[@class='text-success']")).getText());
                Thread.sleep(2000);
            }

            System.out.println(driver.findElement(By.id("result")).getText());

            driver.findElement((By.xpath("//span[text()=\"Buttons\"]"))).click();

            WebElement doubleClick= driver.findElement(By.xpath("//button[text()=\"Double Click Me\"]"));
            actions.doubleClick(doubleClick).perform();
            System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

            WebElement rightClick = driver.findElement(By.xpath("//button[text()=\"Right Click Me\"]"));
            actions.contextClick(rightClick).perform();
            System.out.println(driver.findElement(By.id("rightClickMessage")).getText());

            driver.findElement((By.xpath("//span[text()=\"Web Tables\"]"))).click();

            driver.findElement((By.xpath("//button[@id=\"addNewRecordButton\"]"))).click();

            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Surya");
            driver.findElement((By.xpath("//input[@id='lastName']"))).sendKeys("Muthu");
            driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("demo@example.com");
            driver.findElement(By.xpath("//input[@id='age']")).sendKeys("12345");
            driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("50000");
            driver.findElement(By.xpath("//input[@id='department']")).sendKeys("automation");
            driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();

//            driver.findElement(By.xpath("//div[text()=\"Elements\"]")).click();
//            Thread.sleep(4000);
//            driver.findElement(By.xpath("//div[text()=\"Widgets\"]")).click();
//            Thread.sleep(4000);
//            driver.findElement(By.xpath("//span[text()=\"Slider\"]")).click();
//            Thread.sleep(4000);
//            WebElement start = driver.findElement(By.xpath("//input[@value=\"25\"]"));
//            actions.clickAndHold(start)
//                    .moveByOffset(40,0)
//                    .release()
//                    .perform();
//            WebElement start1 = driver.findElement(By.xpath("//input[@value=\"55\"]"));
//            actions.clickAndHold(start1).moveByOffset(3, 1).release().perform();
//            Thread.sleep(4000);
            driver.findElement(By.xpath("//span[@title=\"Edit\"]")).click();
            WebElement department = driver.findElement(By.xpath("//input[@id=\"department\"]"));
            department.clear();
            department.sendKeys("Automation");
            driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
            driver.findElement(By.xpath("//span[@title=\"Delete\"]")).click();






        }
        catch(Exception e){
            driver.quit();
        }
        finally{
            driver.quit();
        }
    }

}
