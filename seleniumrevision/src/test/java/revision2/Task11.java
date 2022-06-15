package revision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task11 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
WebElement fname = driver.findElement(By.xpath("//input[@name='firstName']"));
fname.sendKeys("prince");
WebElement lname = driver.findElement(By.xpath("//input[@name='lastName']"));
lname.sendKeys("solomon");
WebElement uname = driver.findElement(By.xpath("//input[@autocapitalize='none']"));
uname.sendKeys("seleniumlearning");
WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
pass.sendKeys("123456");
WebElement cpass = driver.findElement(By.xpath("//input[@aria-label='Confirm']"));
cpass.sendKeys("123456");
WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
checkbox.click();


	}

}
