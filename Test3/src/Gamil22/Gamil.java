package Gamil22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PradeeGopalz\\eclipse-workspace\\Test3\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
	    driver.findElement(By.id("email")).sendKeys("dhinesh");
	    driver.findElement(By.id("pass")).sendKeys("52252Gff");
	    driver.findElement(By.id("loginbutton")).click();
	    
	
	    

	}

}
