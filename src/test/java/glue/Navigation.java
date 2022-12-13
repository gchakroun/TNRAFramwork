package glue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WindowType;

import io.cucumber.java.en.When;
import utils.Colors;
import utils.ConnectDriver;
import utils.Time;

public class Navigation {
	private WebDriver webDriver = ConnectDriver.webDriver;

	@When("^Connect to the url \"(.*)\"$")
	public void connect(String url) throws Throwable {

		// (Duration.ofSeconds(10))

		
		
		try {
			webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Time.DEFALUT_LOAD_TIME));
			webDriver.get(url);
			webDriver.manage().window().maximize();
			System.out.println(Colors.YELLOW_CONSOLE_COLOR + "============= > Connected to the url: " + url
					+ Colors.RESET_CONSOLE_COLOR);

		} catch (WebDriverException e) {

			System.out.println("Page load time is end");
			System.out.println("The default load time is: " + Time.DEFALUT_LOAD_TIME);
			System.out.println(
					Colors.RED_CONSOLE_COLOR + "Error in the get url WebDriver" + e + Colors.RESET_CONSOLE_COLOR);

		}
	}
	@When("^Open new tab$")
	public void open_new_tab() throws Throwable {

		webDriver.switchTo().newWindow(WindowType.TAB);
//		System.out.println(Colors.YELLOW_CONSOLE_COLOR + "************ New Tab is opned ***************"
//				+ Colors.RESET_CONSOLE_COLOR);

	}

	@When("^Close current tab$")
	public void close_new_tab() throws Throwable {

		webDriver.close();
//		System.out.println(Colors.YELLOW_CONSOLE_COLOR + "************ Current Tab is closed ***************"
//				+ Colors.RESET_CONSOLE_COLOR);

	}

	@When("^Close the web drivr and quit$")
	public void close_the_web_driver() {
		webDriver.quit();
		System.out.println(Colors.YELLOW_CONSOLE_COLOR + "************ Web Driver is closed ***************"
				+ Colors.RESET_CONSOLE_COLOR);
		System.out.println(Colors.YELLOW_CONSOLE_COLOR + "************ End of the Feature ***************"
				+ Colors.RESET_CONSOLE_COLOR);
		System.out.println(Colors.YELLOW_CONSOLE_COLOR + "******************************************"
				+ Colors.RESET_CONSOLE_COLOR);
		System.out.println(
				Colors.YELLOW_CONSOLE_COLOR + "*****************************************" + Colors.RESET_CONSOLE_COLOR);
		System.out.println(
				Colors.YELLOW_CONSOLE_COLOR + "****************************************" + Colors.RESET_CONSOLE_COLOR);
	}
	
	@When("^Get coockies$")
	public void get_cookies () {
		
		
		System.out.println(webDriver.manage().getCookies());
	}
}
