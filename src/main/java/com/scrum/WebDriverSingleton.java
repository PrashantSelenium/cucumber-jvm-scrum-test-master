package com.scrum;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * @author saikrishna
 */
public class WebDriverSingleton {

	private static WebDriver driver;
	public static Properties CONFIG = null;

	public static WebDriver getInstance() throws IOException {
		loadConfig();
		if (driver == null) {

			if (CONFIG.getProperty("testBrowser").equals("Firefox")) {

				File pathToBinary = new File(
						"C:\\Users\\saikrish\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
				FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
				FirefoxProfile firefoxProfile = new FirefoxProfile();
				driver = new FirefoxDriver(ffBinary, firefoxProfile);
				// driver = new HtmlUnitDriver();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
		}
		return driver;
	}

	public static void loadConfig() throws IOException {
		CONFIG = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")
				+ "\\config\\config.properties");
		CONFIG.load(fs);
	}

}
