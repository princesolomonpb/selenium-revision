package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver prince=new ChromeDriver();
prince.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
Thread.sleep(3000);
WebElement uname = prince.findElement(By.xpath("//*[@type='text']"));
uname.sendKeys("prince");
WebElement pass = prince.findElement(By.xpath("//*[@type='password']"));
pass.sendKeys("8973189890");
	}

}
