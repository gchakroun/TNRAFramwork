package glue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;
import utils.ConnectDriver;
import utils.Time;


public class SaveFile {
	private WebDriver webDriver = ConnectDriver.webDriver;

	@When("^Save File$")
	public void click() throws Throwable {

		webDriver.get("file:///C:/Users/GChakroun/Downloads/REORG%20Bulletins%202019.pdf");

		Thread.sleep(5000);
		WebElement wb = null;

		wb = new WebDriverWait(webDriver, Duration.ofSeconds(Time.DEFALUT_WEB_WELEMENT_WAIT))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html")));
		
		
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
	wb.sendKeys(s); 
	
		

	}

}
