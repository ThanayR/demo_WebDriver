import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import resources.util.Library;

public class demo_popUp extends Library {
	public static void main(String[] args) throws IOException, InterruptedException {
		driver = openBrowser();
		navigateURL();

		getElement("//a[text()='Courses' and @target]").click();
		
		System.out.println("****** 2nd Window**************");
		Set<String> windows = driver.getWindowHandles();
		System.out.println("# of Open Windows: " + windows.size());

		Iterator<String> itr = windows.iterator();
		String homePageWndID = itr.next();
		String secPageWndID = itr.next();

		System.out.println("home Page Window Handler ID: " + homePageWndID);
		System.out.println("2nd Page Window Handler ID: " + secPageWndID);

		driver.switchTo().window(secPageWndID);
		getElement("//a[normalize-space()='Software Test Automation (123)']").click();
		
		//driver.findElement(By.linkText("Selenium WebDriver using Java"));
		//driver.findElement(By.partialLinkText("WebDriver using Java"));
		
		getElement("//a[text()='Selenium WebDriver using Java']").click();
		
		System.out.println("****** 3rd Window**************");
		windows = driver.getWindowHandles();
		System.out.println("# of Open Windows: " + windows.size());

		itr = windows.iterator();
		homePageWndID = itr.next();
		secPageWndID = itr.next();
		String thirdPageWndID = itr.next();

		System.out.println("home Page Window Handler ID: " + homePageWndID);
		System.out.println("2nd Page Window Handler ID: " + secPageWndID);
		System.out.println("3rd Page Window Handler ID: " + thirdPageWndID);

		driver.switchTo().window(thirdPageWndID);
		getElement("//a[text()='Contact' and not(@onclick)]").click();
		
		/*
		 * driver.close(); Thread.sleep(3000); driver.switchTo().window(secPageWndID);
		 * driver.close(); Thread.sleep(3000); driver.switchTo().window(homePageWndID);
		 * driver.close();
		 */	 
		driver.quit();
	}
}
