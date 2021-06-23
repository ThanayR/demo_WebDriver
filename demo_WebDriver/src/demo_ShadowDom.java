
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_ShadowDom extends Library{

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = openBrowser();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Testing");
		//driver.findElement(By.cssSelector("input#input")).sendKeys("Testing");
		
		//create the ShadowHost
		WebElement root = driver.findElement(By.tagName("book-app"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowDom1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", root);
		
		/*
		 * WebElement appHeader = shadowDom1.findElement(By.tagName("app-header"));
		 * WebElement appToolbar =
		 * appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		 * WebElement bookInputDecorator =
		 * appToolbar.findElement(By.tagName("book-input-decorator"));
		 */
		shadowDom1.findElement(By.cssSelector("input#input")).sendKeys("testing");
	}
}
