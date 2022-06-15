package revision2;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task12 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get(" https://www.snapdeal.com/");
Thread.sleep(5000);
WebElement sign = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
sign.click();
WebElement reg = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
reg.click();
Thread.sleep(5000);

driver.switchTo().frame(0);
WebElement no = driver.findElement(By.xpath("//*[@id=\"userName\"]"));

no.sendKeys("1234567890");
WebElement btn = driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
btn.click();





}

}
