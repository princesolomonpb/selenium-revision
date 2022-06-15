package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://www.redbus.in/");
Thread.sleep(5000);
WebElement sign = driver.findElement(By.xpath("//*[@class=\'icon ich dib icon-down_WO_BAL icon-down\']"));

		sign.click();
		Thread.sleep(5000);
		WebElement signup = driver.findElement(By.xpath("//li[@id='signInLink']"));
		signup.click();
		Thread.sleep(5000);
		WebElement mob = driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[1]/div[4]/div[3]"));
		mob.sendKeys("1234567890");
		
		
		
		
		
		
		
	}

}
