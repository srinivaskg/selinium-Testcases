package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest_Positive {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		 WebDriver driver = new ChromeDriver();
		 String baseUrl = "http://retailm1.upskills.in/account/register";
		 driver.get(baseUrl);
		 WebElement firstName = driver.findElement(By.name("firstname"));
		 WebElement lastName = driver.findElement(By.name("lastname"));
		 WebElement eMail = driver.findElement(By.name("email"));
		 WebElement telephone = driver.findElement(By.name("telephone"));
		 WebElement address1 = driver.findElement(By.id("input-address-1"));
		 WebElement address2 = driver.findElement(By.name("address_2"));
		 WebElement city = driver.findElement(By.id("input-city"));
		 WebElement postCode = driver.findElement(By.name("postcode"));
		 Select drpCountry = new Select(driver.findElement(By.name("country_id")));
		 Select drpState = new Select(driver.findElement(By.name("zone_id")));
		 WebElement password = driver.findElement(By.id("input-password"));
		 WebElement passwordConfirm = driver.findElement(By.name("confirm"));
		 WebElement subscribe = driver.findElement(By.name("newsletter"));
		 WebElement agree = driver.findElement(By.name("agree"));
		 WebElement continueButton = driver.findElement(By.name("continue"));
		 firstName.sendKeys("manzoor");
		 lastName.sendKeys("mehadi");
		 eMail.sendKeys("manzoor@gmail.com");
		 telephone.sendKeys("9876543210");
		 address1.sendKeys("yeshwanthpur");
		 address2.sendKeys("Bangalore");
		 city.sendKeys("Bangalore");
		 postCode.sendKeys("560022");		 
		 drpCountry.selectByVisibleText("India");
		 drpState.selectByVisibleText("Karnataka");
		 password.sendKeys("manzoor1");
		 passwordConfirm.sendKeys("manzoor1");
		 subscribe.click();
		 agree.click();
		 continueButton.submit();
		 driver.close();
	}

}
