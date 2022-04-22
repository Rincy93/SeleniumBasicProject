package testSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class PagesHelper extends LaunchingWebdrivers {
	
	public static void javascriptClick(WebElement element) {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);
	}
	
	public static String getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
	}
	
	public static String getTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	

}
