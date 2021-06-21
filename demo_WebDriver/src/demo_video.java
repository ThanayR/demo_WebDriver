import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_video extends Library {
	public static void main(String[] args) throws IOException, InterruptedException {
		driver = openBrowser();
		navigateURL();
		
		WebElement video = driver.findElement(By.xpath("//video[@preload='metadata']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView()",video);
		
		System.out.println(js.executeScript("return arguments[0].duration",video));
		System.out.println(js.executeScript("return arguments[0].currentSrc",video));
		
		js.executeScript("arguments[0].play()",video);
		Thread.sleep(3000);
		js.executeScript("arguments[0].pause()",video);
		Thread.sleep(3000);
		

		js.executeScript("arguments[0].play()",video);
		Thread.sleep(5000);
		js.executeScript("arguments[0].pause()",video);
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].play()",video);
		
	}

}
