package saucedemo8website;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 driver.navigate().refresh();
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		   driver.findElement(By.id("login-button")).click();
		  driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Emon");
		  driver.findElement(By.id("last-name")).sendKeys("Al hasan");
		  driver.findElement(By.id("postal-code")).sendKeys("8888");
		  driver.findElement(By.id("continue")).click();
		  driver.findElement(By.id("finish")).click();
		  driver.findElement(By.id("back-to-products")).click();
		  
		  

	}

}
