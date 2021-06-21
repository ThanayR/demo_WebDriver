import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo_headlessBrowser {

	public static void main(String[] args) {
		String currPrjPath = System.getProperty("user.dir"); 
		String chromeDriverPath = currPrjPath + "\\src\\resources\\browserDrivers\\chromedriver.exe";
				  
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver cd = new ChromeDriver(options); 
		cd.get("https://www.vfislk.com/");
		System.out.println(cd.getTitle());
	}
}
