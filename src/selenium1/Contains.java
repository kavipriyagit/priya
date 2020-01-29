package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Contains {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\R.KAVINYA\\Priya\\selenium1\\driver\\chromedriver.exe");
	WebDriver dri = new ChromeDriver();
	dri.get("https://www.facebook.com/");
	WebElement e = dri.findElement(By.id("email"));
	e.sendKeys("Midhun");
	WebElement t = dri.findElement(By.id("pass"));
	t.sendKeys("123465");
	WebElement p = dri.findElement(By.id("u_0_2"));
	p.click();
	
}}
