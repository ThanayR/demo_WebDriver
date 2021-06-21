import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_links extends Library{
	public static void main(String[] args) throws IOException {
		driver = openBrowser();
		navigateURL();
				
		List<WebElement> items = driver.findElements(By.xpath("//a"));
		
		//List<WebElement> items = driver.findElements(By.tagName("a"));
		System.out.println("Items Count: " + items.size());
		
		for(WebElement element: items) 
			System.out.println(element.getText());
		
		driver.quit();
	}
}
