import java.io.IOException;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.util.Library;

public class demo_EL extends Library {
	
	@Test
	public void test() throws IOException {
	//public static void main(String[] args) throws IOException, InterruptedException {
		driver = openBrowser();
		navigateURL();

		getElement("//a[text()='Courses' and @target]").click();
		
		System.out.println("****** 2nd Window**************");
		//Set<String> windows = driver.getWindowHandles();
		//driver.switchTo().window(getWindowHwndID());
		
		driver.switchTo().window( driver.getWindowHandles().toArray()[1].toString());
		getElement("//a[normalize-space()='Software Test Automation (123)']").click();
		
		if (driver.getPageSource().contains("Selenium WebDriver using Java"))
			getElement("//a[text()='Selenium WebDriver using Java']").click();
		else
			Assert.fail("Course Does Not Exist");				
		
		System.out.println("****** 3rd Window**************");		
		//driver.switchTo().window(getWindowHwndID());
		
		driver.switchTo().window( driver.getWindowHandles().toArray()[2].toString());
		getElement("//a[text()='Contact' and not(@onclick)]").click();
		driver.quit();
	}
}
