import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.String;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchButton = driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@class=\"gNO89b\"]"));
        String searchButtonText = searchButton.getText();
        System.out.println(searchButtonText);
        if (searchButtonText == "searchButton"){
            System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
        }
        WebElement textBoxID = driver.findElement(By.id("APjFqb"));
        WebElement textBoxName = driver.findElement(By.name("q"));
        WebElement textBoxXpath = driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
        textBoxXpath.sendKeys("Testing");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement button = driver.findElement(By.xpath("//div[@class=\"lJ9FBc\"]//input[@name=\"btnK\"]"));
        button.click();
        driver.quit();
    }
}