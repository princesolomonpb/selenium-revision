package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement search = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
search.sendKeys("iphone");
WebElement button = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
button.click();
	}

}
