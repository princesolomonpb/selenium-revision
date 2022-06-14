package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task10 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get(" http://adactinhotelapp.com/");
WebElement uname = driver.findElement(By.xpath("//*[@name='username']"));
uname.sendKeys("princesolomon");
WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
pass.sendKeys("123456");
	}

}
