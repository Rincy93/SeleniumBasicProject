package testSelenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities; 

public class LaunchingWebdrivers {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.out.println("Select a browser to be launced: "+ "\n1. Firefox" + "\n2. Chrome");
		Scanner insert = new Scanner(System.in);
		int options = insert.nextInt();

		
		switch(options) {
		
		case 1:
		
			System.out.println("Launching Mozilla Firefox");
			System.setProperty("webdriver.gecko.driver", "/Users/rincyrajan/Downloads/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.gmail.com/");
			System.out.println("Firefox with test-url opened");
			LoginPage object = new LoginPage();
			object.LoginPageMethod();
			driver.quit();
			break;
			
		case 2: 
			
			System.out.println("Launching Google Chrome");
			System.setProperty("webdriver.chrome.driver", "/Users/rincyrajan/Downloads/chromedriver");
			ChromeOptions options1 = new ChromeOptions();
			options1.addArguments("--incognito");
			driver = new ChromeDriver(options1);
			driver.get("https://www.saucedemo.com/");
			System.out.println("Chrome with test-url opened");
			LoginPage obj1 = new LoginPage();
			obj1.LoginPageMethod();
			driver.quit();
			break;
			
			default:
				System.out.println("Incorrect Input");
			}	
		
	}

}
