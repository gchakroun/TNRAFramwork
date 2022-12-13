package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConnectDriver {

	public static WebDriver webDriver = ConnectDriver.getChromeWebDriver();
	//public static WebDriver webDriver;




	private static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		return options;
	}


	public static WebDriver getChromeWebDriver() {

		System.out.println(Colors.CYAN_CONSOLE_COLOR + "====>Default Settings : \n"
				+ "Web Element default wait time: " + Time.DEFALUT_WEB_WELEMENT_WAIT
				+ "\nLoad Time default wait: " + Time.DEFALUT_LOAD_TIME + Colors.RESET_CONSOLE_COLOR);


/*		System.setProperty("webdriver.chrome.driver",
				"C://webdriver107//chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		return webDriver;*/

		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver(getChromeOptions());

		return webDriver;
	}

}
