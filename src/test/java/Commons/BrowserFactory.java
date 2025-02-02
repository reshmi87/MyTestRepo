package Commons;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	private static ThreadLocal<WebDriver>driver = new ThreadLocal<>();
	private Properties prop = new Properties();
	private String browsername;
	WebDriver driverinstance;
	
	public WebDriver browsersetup() {
		try {
			prop.load(BrowserFactory.class.getClassLoader().getResourceAsStream("configuration.properties"));
			browsername = prop.getProperty("browser");
			LoggerLoad.info("Browser is: "+browsername);
			if(browsername.equalsIgnoreCase("Chrome")) {
				driver.set(new ChromeDriver());
				}
			else if(browsername.equalsIgnoreCase("Edge")) {
				driver.set(new EdgeDriver());
			}
			else if(browsername.equalsIgnoreCase("Firefox")) {
				driver.set(new FirefoxDriver());
			}
		} catch (IOException e) {
			e.printStackTrace(); 
			}
		driverinstance = driver.get();
		return driverinstance;
		}
	
	public static WebDriver getdriverinstance() {
		return driver.get();
	}
}