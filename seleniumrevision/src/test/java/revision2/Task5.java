package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
WebElement btn1 = driver.findElement(By.xpath("//*[@id='heading20']"));
btn1.click();
WebElement btn2 = driver.findElement(By.xpath("//*[@title='Interview Questions']"));
btn2.click();



	}

}
