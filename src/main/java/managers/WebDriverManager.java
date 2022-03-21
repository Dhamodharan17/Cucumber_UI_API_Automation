package managers;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverManager {
	
	
	private static WebDriver driver;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String CHROME = System.getProperty("user.dir") + "/drivers/chromedriver";
	private Properties properties;
	private final String propertyFilePath= System.getProperty("user.dir") + "/config.properties";


	
	
	public WebDriverManager() {

	}
	
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
	
	
	private WebDriver createDriver() {	      
	       return  driver = createLocalDriver();        	
	}


	private WebDriver createLocalDriver() { 
			ConfigFileReader();
			String url = properties.getProperty("url");
			//System.out.print(url);
        	System.setProperty(CHROME_DRIVER_PROPERTY, CHROME);
        	driver = new ChromeDriver();      	
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            return driver;
	}	
	

	public void quitDriver() {
		if(driver!= null)	driver.close();		driver.quit();
		driver=null;	

	}

	
	public void ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	
	
	
	
}
