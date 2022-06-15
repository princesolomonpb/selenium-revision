package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task9 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get(" https://www.flipkart.com/");
Thread.sleep(5000);
WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
login.click();
WebElement uname = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
uname.sendKeys("prince solomon");
WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
pass.sendKeys("123456789");


	}

}
