package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		 WebDriver driver = new ChromeDriver();
		 String baseUrl = "http://retailm1.upskills.in/account/login";
		 driver.get(baseUrl);
		 WebElement email = driver.findElement(By.id("input-email"));
		 WebElement password = driver.findElement(By.name("password"));
		 email.sendKeys("manzoor@gmail.com");					
		 password.sendKeys("manzoor1");
		 WebElement login = driver.findElement(By.id("Login"));
		login.click();
	 }

}
