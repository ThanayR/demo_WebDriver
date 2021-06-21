import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.util.Library;

public class demo_list extends Library {
	public static void main(String[] args) throws IOException {
		driver = openBrowser();
		navigateURL();
		
		WebElement dropDownList = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		/*
		 * //List<WebElement> items = dropDownList.findElements(By.tagName("option"));
		 * List<WebElement> items = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option"));
		 * List<WebElement> items = dropDownList.findElements(By.xpath("option"));
		 * 
		 * System.out.println("Items Count: " + items.size());
		 * 
		 * for(WebElement element: items) System.out.println(element.getText() + " --- "
		 * + element.isSelected());
		 * System.out.println("*******************************");
		 * 
		 * dropDownList.sendKeys("AED"); for(WebElement element: items)
		 * System.out.println(element.getText() + " --- " + element.isSelected());
		 */
		
		Select sel = new Select(dropDownList);
		List<WebElement> items = sel.getOptions();
		
		System.out.println("Items Count: " + items.size());
		for(WebElement element: items) 
			System.out.println(element.getText() + " --- " + element.isSelected());
		
		sel.selectByIndex(1);
		System.out.println("*******************************");
		for(WebElement element: items) 
			System.out.println(element.getText() + " --- " + element.isSelected());
	}
}
