package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver prince=new ChromeDriver();
prince.get("https://www.snapdeal.com/login");
WebElement login = prince.findElement(By.xpath("//*[@class='col-xs-24']"));
login.sendKeys("8973189890");
login.sendKeys("prinsolomon@gmail.com");
	}

}
