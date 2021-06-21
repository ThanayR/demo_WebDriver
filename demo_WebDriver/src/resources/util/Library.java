package resources.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Library {
	public static WebDriver driver;
	
	public static WebDriver openBrowser() throws IOException {
		String browserName = readConfigFile("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", CONSTANTS.chromeDriverPath);			
			driver = new ChromeDriver(); 
		}else if (browserName.equalsIgnoreCase("ie")) {					  
			System.setProperty("webdriver.ie.driver", CONSTANTS.ieDriverPath);			
			driver = new InternetExplorerDriver();			
		}else if (browserName.equalsIgnoreCase("firefox")) {					  
			System.setProperty("webdriver.gecko.driver", CONSTANTS.geckoDriverPath);			
			driver = new FirefoxDriver(); 			
		}else
			System.out.println("Invalid Browser: " + browserName);
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static String readConfigFile(String key) throws IOException {		
		FileInputStream fis = new FileInputStream(CONSTANTS.configFilePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);
	}
	
	public static void navigateURL() throws IOException {
		String url = readConfigFile("url");
		// if response code = 200
		driver.get(url);
		// else throw new exception
	}
	
	public static boolean isElementPresent( String xPathExpr) {
		try {
			driver.findElement(By.xpath(xPathExpr));			
		}catch(Exception e) {
			System.out.println("No Such Element: " + xPathExpr);
			return false;
		}
		return true;
	}
}
