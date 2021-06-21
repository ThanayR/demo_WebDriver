import org.openqa.selenium.firefox.FirefoxDriver;

public class firstSelPrg {
	public static void main(String[] args) {		
		//String chromeDriverPath = "D:\\SeleniumDump\\chromedriver.exe";
		
		//String chromeDriverPath = "C:\\Users\\Ravi\\Desktop\\SLK_Trng\\demo_WebDriver\\src\\resources\\browserDrivers\\chromedriver.exe";	
		/*
		 * String currPrjPath = System.getProperty("user.dir"); String chromeDriverPath
		 * = currPrjPath + "\\src\\resources\\browserDrivers\\chromedriver.exe";
		 * 
		 * System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		 * 
		 * ChromeDriver cd = new ChromeDriver(); cd.get("http://www.google.com");
		 */		
		
		/*
		 * String currPrjPath = System.getProperty("user.dir"); String ieDriverPath =
		 * currPrjPath + "\\src\\resources\\browserDrivers\\IEDriverServer.exe";
		 * 
		 * System.setProperty("webdriver.ie.driver", ieDriverPath);
		 * 
		 * InternetExplorerDriver cd = new InternetExplorerDriver();
		 * cd.get("http://www.google.com");
		 */			
		
		String currPrjPath = System.getProperty("user.dir");		
		String geckoDriverPath = currPrjPath + "\\src\\resources\\browserDrivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		
		FirefoxDriver cd = new FirefoxDriver();
		cd.get("http://www.google.com");
	}
}
