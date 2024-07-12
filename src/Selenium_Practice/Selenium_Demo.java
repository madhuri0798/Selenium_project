package Selenium_Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Demo {

	public static void main(String[] args) {
		
		//set chrome driver properties 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		
		
		//create Chrome driver Object Ex Chrome
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		
		

	}

}
