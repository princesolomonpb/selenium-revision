package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement uname = driver.findElement(By.xpath("//*[@id='email']"));
uname.sendKeys("prince solomon");
WebElement pass = driver.findElement(By.xpath("//*[@id='pass']"));
pass.sendKeys("123456789");
WebElement login = driver.findElement(By.xpath("//*[@value='1']"));
login.click();
}

}
