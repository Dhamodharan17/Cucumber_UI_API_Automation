package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.FacebookLoginScreenPage;

public class PageObjectManager {
	
	protected static WebDriver driver;
	
	
	
	private FacebookLoginScreenPage facebookLoginScreenPage;
	
	
	
	public PageObjectManager(WebDriver driver) {
		PageObjectManager.driver = driver;

	}
	


	//Singleton design
	public FacebookLoginScreenPage getFacebookPage()
	{
		return (facebookLoginScreenPage == null) ? facebookLoginScreenPage 
				= new FacebookLoginScreenPage(driver) :	facebookLoginScreenPage;	
	}
	

}
