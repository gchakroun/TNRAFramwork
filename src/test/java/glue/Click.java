package glue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;
import utils.Colors;
import utils.ConnectDriver;
import utils.Time;

public class Click extends ConnectDriver {
	private WebDriver webDriver = ConnectDriver.webDriver;

	@When("^Click normal the webElement with xpath \"(.*)\"$")
	public void click(String xpath) throws Throwable {

		WebElement click = null;

		click = new WebDriverWait(webDriver, Duration.ofSeconds(Time.DEFALUT_WEB_WELEMENT_WAIT))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		click.click();
//		System.out.println(Colors.GREEN_CONSOLE_COLOR + "Element with xpath: " + xpath + " has been clicked"
//				+ Colors.RESET_CONSOLE_COLOR);

	}

}
