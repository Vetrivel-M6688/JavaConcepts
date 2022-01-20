package com.cofingFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigPropertyFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		FileInputStream iStrem = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(iStrem);

		String browserType = properties.getProperty("browser");
		String driverLoc = properties.getProperty("location");

		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLoc);
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLoc);
			driver = new FirefoxDriver();
		}

		driver.get("https://www.google.co.in");

	}
}
