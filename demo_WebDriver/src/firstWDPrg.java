import java.io.IOException;

import resources.util.Library;

public class firstWDPrg extends Library {
	public static void main(String[] args) throws IOException {
		/*
		 * Library lib = new Library(); WebDriver driver = lib.openBrowser("ie"); ///
		 * 1st Approach driver.get("http://www.google.com");
		 */
		
		driver = openBrowser();
		driver.get("http://www.google.com");
		System.out.println(driver.getPageSource());
		//navigateURL();	
		
		
		/*
		 * String currPrjPath = System.getProperty("user.dir"); String chromeDriverPath
		 * = currPrjPath + "\\src\\resources\\browserDrivers\\chromedriver.exe";
		 * System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		 */
		  //interface object => class Reference
		  //WebDriver cd = new ChromeDriver();    // Browser Compatible		 
		  //cd.get("http://www.google.com");	
		  //cd.getNetworkConnection();
	}
}
