package Commons;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop = new Properties();
	private String username;
	private String password;
	
	public String getusername() throws IOException {
	prop.load(ConfigReader.class.getClassLoader().getResourceAsStream("configuration.properties"));
	username = prop.getProperty("username");
	return username;
	}
	
	public String getpassword() throws IOException {
		prop.load(ConfigReader.class.getClassLoader().getResourceAsStream("configuration.properties"));
		password = prop.getProperty("password");
		return password;
		}
}
