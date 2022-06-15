package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get(" https://www.cleartrip.com/trains");
WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
from.sendKeys("chennai egmore");
WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
to.sendKeys("tirunelveli");
WebElement class1 = driver.findElement(By.xpath("//select[@title='Class']"));
Select select1=new Select(class1);
select1.selectByIndex(2);
WebElement date = driver.findElement(By.xpath("//input[@title='Journey date']"));
date.click();
WebElement journeydate = driver.findElement(By.xpath("//*[@id=\"datePickerWrapper\"]/table[1]/tbody/tr[3]/td[5]/a"));
journeydate.click();
WebElement adult = driver.findElement(By.xpath("//select[@name='adults']"));
Select select2=new Select(adult);
select2.selectByIndex(1);
WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
btn.click();

	}

}
