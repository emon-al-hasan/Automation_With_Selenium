package seleniumnetlify8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		/* First name & Last Name */
		driver.findElement(By.id("fname")).sendKeys("Emon");
		driver.findElement(By.id("lname")).sendKeys("Al Hasan");
		
		/* First name & last name end*/
		
		//Radio button
	WebElement radiobutton=	driver.findElement(By.id("male"));
	WebElement radiobutton1=driver.findElement(By.id("female"));
	radiobutton.click();
	System.out.println(radiobutton.isSelected());
	
	radiobutton1.isEnabled();
	System.out.println(radiobutton1.isEnabled());
	
  // Radio Button end
	
	//DropDown Start
	
	WebElement testdropdown=driver.findElement(By.id("option"));
	Select dropdown=new Select(testdropdown);
	//dropdown.selectByIndex(2);
	//dropdown.selectByValue("option 1");
	dropdown.selectByVisibleText("Option 3");
	
	//checkbox select
	
    WebElement l=driver.findElement(By.xpath("//*[@value='Option 3']"));
    l.click();

	
	
	
	
	}

}
