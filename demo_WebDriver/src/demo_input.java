import java.io.IOException;

import org.openqa.selenium.By;

import resources.util.Library;

public class demo_input extends Library {
	public static void main(String[] args) throws IOException, InterruptedException {
		driver = openBrowser();
		driver.get("https://login.yahoo.com/");  // Page Load Sync	
				
		driver.findElement(By.cssSelector("*[id='login-username']")).sendKeys("cisco");
		//driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).sendKeys("cisco");
		//driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).sendKeys(readConfigFile("userName"));
		//driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).sendKeys(Keys.chord(Keys.ALT, Keys.CONTROL, keys.DELETE));
		//driver.findElement(By.xpath("//input[@id='login-username' and @name='username']")).submit();
		
		//driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("1234");
		//driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		
		//By userName = By.id("login-username");  //unique
		//By userName = By.name("username");
		// By userName = By.className("phone-no show-icon used");		// First
		//By userName = By.xpath("html/body/div/div[2]/div/div[2]/div[2]/form/div/div[3]/input");	
		/*
		 * By userName = By.xpath("//input[@id='login-username' and @name='username']");
		 * 
		 * //WebElement emailID = driver.findElement(By.id("login-username"));
		 * WebElement emailID = driver.findElement(userName); emailID.sendKeys("cisco");
		 * 
		 * System.out.println("using getText(): " + emailID.getText());
		 * System.out.println("x co-ordinate: : " + emailID.getLocation().getX());
		 * System.out.println("enabled: : " + emailID.isEnabled());
		 * System.out.println("tagName: " + emailID.getTagName());
		 * 
		 * System.out.println("tagName: " + emailID.getAttribute("tagName"));
		 * System.out.println("using getAttribute: " + emailID.getAttribute("value"));
		 * 
		 * WebElement nextBtn =
		 * driver.findElement(By.xpath("//input[@id='login-signin']")); nextBtn.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement pwd = driver.findElement(By.xpath("//input[@id='login-passwd']"));
		 * pwd.sendKeys("abcd");
		 * 
		 * WebElement signInBtn =
		 * driver.findElement(By.xpath("//button[@id='login-signin']"));
		 * signInBtn.click();
		 */
		
		/*
		 * xPath: Flexibility cssSelector: Performance
		 * 
		 * absolute: unique, stable relative:
		 * 
		 * /html/body/div/div[2]/div/div[2]/div[2]/form/div/div[3]/input
		 * html>body>div>div:nth-child(2)>div>div:nth-child(2)>div:nth-child(2)>form>div
		 * >div:nth-child(3)>input
		 * 
		 * /html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/
		 * input[1]
		 * 
		 * //tagName[@property=value] //*[@id='login-username'] [id='login-username']
		 * 
		 * //input[@id='login-username'] input[id='login-username']
		 * 
		 * //input[@id='login-username' and @name='username']
		 * input[id='login-username'][name='username']
		 * 
		 * //input[@id='login-username' and @name='username'
		 * and @autocomplete='username']
		 * input[id='login-username'][name='username'][autocomplete='username']
		 * 
		 * //input[@class='phone-no show-icon used'] input[class='phone-no show-icon
		 * used']
		 * 
		 * //input[@autocapitalize='none']
		 * 
		 * /html/body//input[@id='login-username'] html>body input[id='login-username']
		 * 
		 * /html/body//form/div/div[3]/input html>body form>div>div:nth-child(3)>input
		 */
	}
}
