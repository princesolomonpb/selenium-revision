package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://toolsqa.com/");
Thread.sleep(20000);
WebElement enroll = driver.findElement(By.xpath("//*[@class='btn btn-primary-shadow btn-block']"));
enroll.click();
WebElement fname = driver.findElement(By.xpath("//*[@id='first-name']"));
fname.sendKeys("prince");
WebElement lname = driver.findElement(By.xpath("//*[@id='last-name']"));
lname.sendKeys("solomon");
WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
email.sendKeys("prinsolomon@fmail.com");
WebElement mobile = driver.findElement(By.xpath("//*[@id='mobile']"));
mobile.sendKeys("1234567890");
WebElement btn = driver.findElement(By.xpath("//*[@class='btn btn-block btn-primary']"));
btn.click();





	}

}
