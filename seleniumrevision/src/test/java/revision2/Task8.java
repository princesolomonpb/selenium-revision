package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task8 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
WebElement fb = driver.findElement(By.xpath("//div[@id='heading201']"));
fb.click();
WebElement r1 = driver.findElement(By.xpath("//a[@title='Model Resume training in chennai']"));
r1.click();



	}

}
