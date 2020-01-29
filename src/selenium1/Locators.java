package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\Priya\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	WebElement username=driver.findElement(By.name("username"));
	username.sendKeys("kavipriya");
	WebElement pass=driver.findElement(By.name("password"));
	pass.sendKeys("12344"); 
    String attribute = pass.getAttribute("name");
		
	//SNAPDEAL
	driver.get("https://www.snapdeal.com/login");
	WebElement w=driver.findElement(By.id("userName"));
	w.sendKeys("priya@gmail.com");
	
	//SWIGGY
	driver.get("https://www.swiggy.com/");
	WebElement l=driver.findElement(By.id("location"));
	l.sendKeys("velachery");
	
	driver.get("https://www.google.com/");
			
	WebElement w=driver.findElement(By.name("q"));
	w.sendKeys("greenstechnology");
	
	//RED BUS
	 driver.get("https://www.redbus.in/");
	WebElement from=driver.findElement(By.id("src"));
	from.sendKeys("karur");
	WebElement to=driver.findElement(By.id("dest"));
	to.sendKeys("chennai");*/
	
	//FACEBOOK
	/*driver.get("https://www.facebook.com/");
	WebElement txtUser=driver.findElement(By.id("email"));
	 txtUser.sendKeys("priya8972@gmail.com");
	 WebElement pass=driver.findElement(By.id("pass"));
	 pass.sendKeys("igagihuhsns");*/
	 
	 
	 
	    driver.get("https://www.instagram.com/accounts/login/?hl=en )login page");
	 	
		WebElement dri=driver.findElement(By.name("username"));

	    dri.sendKeys("priya");
	    WebElement driv=driver.findElement(By.name("password"));

	    driv.sendKeys("priya");
	
	    /*driver.get("www.adactin.com/HotelApp/");
	    WebElement w= driver.findElement(By.id("username"));
	    w.sendKeys("sksJlfl");
	    WebElement wa= driver.findElement(By.name("password"));
	    wa.sendKeys("priya");*/


	 
	 
	 
	 
	 
}
}