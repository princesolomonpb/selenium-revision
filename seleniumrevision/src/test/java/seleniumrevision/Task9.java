package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task9 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
WebElement fname = driver.findElement(By.xpath("//*[@type='text']"));
fname.sendKeys("prince");
WebElement sname = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
sname.sendKeys("solomon");
WebElement address = driver.findElement(By.xpath("//*[@rows='3']"));
address.sendKeys("65,vaguthankuppam road nazareth");
WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
email.sendKeys("prinsolomon@gmail.com");
WebElement pno = driver.findElement(By.xpath("//*[@type='tel']"));
pno.sendKeys("8973189890");
WebElement fpass = driver.findElement(By.xpath("//*[@id='firstpassword']"));
fpass.sendKeys("12345");
WebElement cpass = driver.findElement(By.xpath("//*[@id='secondpassword']"));
cpass.sendKeys("12345");

	}

}
