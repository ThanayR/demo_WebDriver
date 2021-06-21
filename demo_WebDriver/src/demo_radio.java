import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_radio extends Library{
	public static void main(String[] args) throws IOException {
		driver = openBrowser();
		navigateURL();
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='travelOptions']//input"));
		System.out.println("Items Count: " + items.size());
		
		for(WebElement element: items) 
			System.out.println(element.getAttribute("value") + " --- " + element.isSelected());
		
		items.get(1).click();
		
		System.out.println("********************");
		for(WebElement element: items) 
			System.out.println(element.getAttribute("value") + " --- " + element.isSelected());
		
	}
}
