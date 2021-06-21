import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_JSExecutor extends Library {
	public static void main(String[] args) throws IOException {
		driver = openBrowser();
		navigateURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('Good morning')"); 
		System.out.println(js.executeScript("return document.title")); 			
		
		//js.executeScript("document.getElementsById('demo').value='abc';");
		
		//WebElement element = (WebElement) js.executeScript("return document.getElementById('demo');");
		//WebElement ele2 = driver.findElement(By.xpath(""));
		//js.executeScript("arguments[0].click()", ele2);
		//js.executeScript("JavaScriptFuncName", 1stArg, 2ndArgu ) );
		System.out.println( js.executeScript("return (arguments[0] + arguments[1])", 22, 90 ) );
		
		System.out.println( js.executeScript("return navigator.platform") );
		//navigator.platform
		
	}
}
