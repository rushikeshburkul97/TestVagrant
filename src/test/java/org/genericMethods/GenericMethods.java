package org.genericMethods;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class GenericMethods {

	public WebDriver startUP(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			option.addArguments("start-maximized");

			driver = new ChromeDriver(option);

		} else if (browserName.equalsIgnoreCase("edge") || browserName.equalsIgnoreCase("ed")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--disable-notification");
			option.addArguments("start-maximized"); // no need to use hyphen between start and maximized.

			driver = new EdgeDriver(option);

		} else {
			System.out.println("invalid browser name");
		}
		driver.get(url);
		return driver;
	}
//	*******************************************
	
	public Properties getProp() {
		try {
			FileInputStream fis = new FileInputStream("./Properties_Files/Config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			return prop;
		}catch(Exception e) {
			e.printStackTrace();
			return null ;
		}
	}
}
