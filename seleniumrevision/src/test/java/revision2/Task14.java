package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task14 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.swiggy.com/");
		WebElement signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signup.click();
		WebElement pno = driver.findElement(By.xpath("//*[@class='_381fS']"));
		pno.sendKeys("897121480");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		name.sendKeys("prince solomon");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("prince@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("12345678980");
		WebElement submit = driver.findElement(By.xpath("//*[@class='a-ayg']"));
		submit.click();
		
		
		
	}

}
