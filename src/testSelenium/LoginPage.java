package testSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends LaunchingWebdrivers {
	
	
	
	 void LoginPageMethod() {
		
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));  //implicitlyWait(10,TimeUnit.SECONDS) method has been deprecated
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); 
		
		WebElement username = driver.findElement(By.cssSelector("input#user-name"));
		username.clear();
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		password.clear();
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		if(("Swag Labs").equalsIgnoreCase(PagesHelper.getTitle())) {
		System.out.println("Login Successful");
		}
		else {
			System.out.println("Login unsuccessfull");
		}
		
		}
	

}
