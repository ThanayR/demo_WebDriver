import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_bbc extends Library {
	public static void main(String[] args) throws IOException, InterruptedException {
		driver = openBrowser();
		navigateURL();
		
		Thread.sleep(3000);
		//html[1]/body[1]/div[7]/div[1]/section[6]/div[1]/ul[1]/li[1]/div[1]/div[2]/h3[1]/a[1]
		String p1 = "//section[6]/div/ul/li[";
		String p2 = "]/div/div[2]/h3/a";
		
		int ctr = 1;
		
		while(isElementPresent(p1 + ctr + p2)) {
			WebElement element = driver.findElement(By.xpath(p1 + ctr + p2));
			String homePageNewsTitle = element.getText(); 
			System.out.println("homePage News Title: " + homePageNewsTitle); 			
			element.click();			
			 
			Thread.sleep(3000);
			String detPageNewsHeader = driver.findElement(By.xpath("//h1[@id='main-heading' or @id='page']")).getText();

			System.out.println("Detailed Page News Header: " + detPageNewsHeader);
			driver.navigate().back(); 
			Thread.sleep(3000);
			ctr++;
		}
				
		/*
		 * List<WebElement> items = driver.findElements(By.xpath(
		 * "//section[6]//div[1]//ul[1]//a[@class='media__link']"));
		 * System.out.println("Items Count: " + items.size());
		 * 
		 * for(int ctr=0; ctr<items.size(); ctr++) { String homePageNewsTitle =
		 * items.get(ctr).getText(); System.out.println("homePage News Title: " +
		 * homePageNewsTitle); items.get(ctr).click();
		 * 
		 * String detPageNewsHeader =
		 * driver.findElement(By.xpath("//h1[@id='main-heading' or @id='page']")).
		 * getText(); System.out.println("Detailed Page News Header: " +
		 * detPageNewsHeader); //driver.get(bbc.com) // page load sync
		 * //driver.navigate().to("bbc.com"); //
		 * 
		 * driver.navigate().back(); items = driver.findElements(By.xpath(
		 * "//section[6]//div[1]//ul[1]//a[@class='media__link']")); }
		 */
		
	}
}
