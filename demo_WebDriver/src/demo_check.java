import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_check extends Library {
	public static void main(String[] args) throws IOException {
		driver = openBrowser();
		navigateURL();		
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='flex flex-between flex-middle px-4 mt-2 mb-4']//input"));
		List<WebElement> labels = driver.findElements(By.xpath("//div[@class='flex flex-between flex-middle px-4 mt-2 mb-4']//label//div//p"));
		System.out.println("Items Count: " + items.size());
		
		for(int ctr = 0; ctr<items.size(); ctr++) 
			System.out.println(labels.get(ctr).getText() + " --- " + items.get(ctr).isSelected());
		
		items.get(1).click();
		
		System.out.println("********************");
		for(int ctr = 0; ctr<items.size(); ctr++) 
			System.out.println(labels.get(ctr).getText() + " --- " + items.get(ctr).isSelected());		
	}
}
