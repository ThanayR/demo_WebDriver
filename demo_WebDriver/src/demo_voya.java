import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import resources.util.Library;

public class demo_voya extends Library {

	public static void main(String[] args) throws IOException {
		driver = openBrowser();
		navigateURL();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowHost = getElement("//div[@id='block-voya-footer']//v-footer");
		//WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot",shadowHost);
		WebElement shadowRoot = getShadowRootElement(shadowHost);
		WebElement element = shadowRoot.findElement(By.cssSelector("#menu_list > ul:nth-child(2) > li:nth-child(4) > a"));
		//String linkText = element.getText();
		System.out.println(element.getText() );
		
		element.click();
		//js.executeScript("document.querySelector(\"#block-voya-footer > v-footer\").shadowRoot.querySelector(\"#menu_list > ul:nth-child(2) > li:nth-child(4) > a\").click();");
		//System.out.println(js.executeScript("document.querySelector(\"#block-voya-footer > v-footer\").shadowRoot.querySelector(\"#menu_list > ul:nth-child(2) > li:nth-child(4) > a\").value;"));
		
		//js.executeScript(".click()");
		
		/*
		 * List<WebElement> links = shadowRoot.findElements(By.cssSelector("a"));
		 * System.out.println("Items Count: " + links.size()); for(WebElement ele:
		 * links) System.out.println(ele.getText());
		 */
	}

}
