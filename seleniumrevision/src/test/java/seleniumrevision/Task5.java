package seleniumrevision;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get(" https://netbanking.hdfcbank.com/");
driver.switchTo().frame(0);
WebElement id = driver.findElement(By.xpath("//*[@size='13']"));
id.sendKeys("8973189890");
	}

}
