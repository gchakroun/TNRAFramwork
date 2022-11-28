package glue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;
import utils.ConnectDriver;
import utils.Time;

public class Set {
	private WebDriver webDriver = ConnectDriver.webDriver;

	@When("^Set the value \"(.*)\" in the xpath \"(.*)\"$")
	public void set_value(String value, String xpath) throws Throwable {

		WebElement input = null;

		input = new WebDriverWait(webDriver, Duration.ofSeconds(Time.DEFALUT_WEB_WELEMENT_WAIT))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		input = webDriver.findElement(By.xpath(xpath));
		input.sendKeys(value);
//		System.out.println("Value : " + value + " has been set in the field with path: " + xpath);
//		System.out.println("********************************************************************\n");
	}

}
