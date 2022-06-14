package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.redbus.in/ ");
WebElement from = driver.findElement(By.xpath("//*[@type='text']"));
from.sendKeys("nazareth");
WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
to.sendKeys("chennai");

}
}
