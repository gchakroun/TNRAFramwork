package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConnectDriver {

	public static WebDriver webDriver = ConnectDriver.getChromeWebDriver();

	public static WebDriver getChromeWebDriver() {

		System.out.println(Colors.CYAN_CONSOLE_COLOR + "====>Default Settings : \n"
				+ "Web Element default wait time: " + Time.DEFALUT_WEB_WELEMENT_WAIT
				+ "\nLoad Time default wait: " + Time.DEFALUT_LOAD_TIME + Colors.RESET_CONSOLE_COLOR);
		// System.setProperty("webdriver.chrome.driver",
		// "C://webdriver107//chromedriver.exe");
//		webDriver = new ChromeDriver();
//		webDriver.manage().window().maximize();
//		return webDriver ;

		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		
		try {
	
//			Cookie cookie1 = new Cookie("ARRAffinitySameSite","45c2f29a8df79aca7a435224476c82da7dbef7c863029ef3caf8a694bd4a3dcb");
//			Cookie cookie2 = new Cookie("ARRAffinity","45c2f29a8df79aca7a435224476c82da7dbef7c863029ef3caf8a694bd4a3dcb");
//		
//			webDriver.manage().addCookie(cookie1);
//			webDriver.manage().addCookie(cookie2);
//			
		} catch (Exception e) {
			System.out.println("Coockie error" + e);
		}
		
		
		
		return webDriver;
	}

}
