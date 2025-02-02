package Hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Commons.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public BrowserFactory bf=new BrowserFactory();
	public WebDriver driver;
	private String appurl;
	private Properties prop = new Properties();
	
	@Before
	public void homepage() {
		driver =bf.browsersetup();
		try {
			prop.load(BrowserFactory.class.getClassLoader().getResourceAsStream("configuration.properties"));
			appurl = prop.getProperty("appurl");
			driver.get(appurl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After
	public void closebrowser() {
		driver.quit();
	}
}
