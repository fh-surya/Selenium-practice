import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts();
        Actions actions = new Actions(driver);
        try{
            driver.get("https://demoqa.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//h5[text()=\"Elements\"]")).click();
            driver.findElement(By.xpath("//span[text()=\"Check Box\"]")).click();
            driver.findElement((By.xpath("//button[@aria-label=\"Expand all\"]"))).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//button[@aria-label=\"Expand all\"]"));
            Thread.sleep(4000);
            driver.findElement(By.xpath("//label[@for=\"tree-node-home\"]")).click();
            Thread.sleep(4000);
            driver.findElement((By.xpath("//span[text()=\"Buttons\"]"))).click();
            Thread.sleep(4000);
            WebElement doubleClick= driver.findElement(By.xpath("//button[text()=\"Double Click Me\"]"));
            actions.doubleClick(doubleClick).perform();
            Thread.sleep(4000);
            WebElement rightClick = driver.findElement(By.xpath("//button[text()=\"Right Click Me\"]"));
            actions.contextClick(rightClick).perform();
            Thread.sleep(4000);
            driver.findElement((By.xpath("//span[text()=\"Web Tables\"]"))).click();
            Thread.sleep(4000);
            driver.findElement((By.xpath("//button[@id=\"addNewRecordButton\"]"))).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Surya");
            driver.findElement((By.xpath("//input[@id='lastName']"))).sendKeys("Muthu");
            driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("demo@example.com");
            driver.findElement(By.xpath("//input[@id='age']")).sendKeys("12345");
            driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("50000");
            driver.findElement(By.xpath("//input[@id='department']")).sendKeys("automation");
            Thread.sleep(4000);
            driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
            Thread.sleep(4000);
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
            Thread.sleep(4000);


            WebElement department = driver.findElement(By.xpath("//input[@id=\"department\"]"));
            department.clear();
            department.sendKeys("Automation");

            driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
            Thread.sleep(4000);






        }
        catch(Exception e){
            driver.quit();
        }
        finally{
            driver.quit();
        }
    }

}
