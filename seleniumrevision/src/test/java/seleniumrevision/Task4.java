package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://infinity.icicibank.com/corp/Login.jsp");
WebElement uname = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
uname.sendKeys("prince solomon");
WebElement findElement = driver.findElement(By.xpath("//*[@id=\'user-id-goahead\']"));
findElement.click();
Thread.sleep(5000);

WebElement pass = driver.findElement(By.xpath("//*[@id=\'AuthenticationFG.ACCESS_CODE\']"));
pass.sendKeys("pr123456");
	}

}
