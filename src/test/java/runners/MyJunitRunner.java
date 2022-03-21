package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,  //this means it will just check whether the Project is fine or not, if we make it true. It just checks that all the step definitions corresponding to the feature file are working fine or not. So better keep it false else results will not display
		strict = false,  //as the name suggests this is going to have a very strong vigil on anything which has an error and it will report the error. But if you make it false it will give the suggestion in the output to rectify 
		monochrome = true, //this actually beautifies the output and removes the un-necessary images and other symbols. So better to keep it true
	    features = {"src/test/resources/stepdefinitionpackage/FacebookLoginScreen.feature"},  //this is the place where the feature file(s) is/are located
		glue = {"stepdefinitionpackage"},   //package where the step definitions are lying. Let's say you want to move one feature file from this location to some other location then we need to give the path of the location but only that feature file whose exact path will be executed
		                                // glue is comma-separated. So in case there are multiple packages then it can be mentioned 
	    plugin = {"pretty",
	    		  "html:target/site/cucumber-html",  //helps to generate reports in form of html, json, etc
			      "json:target/cucumber1.json"},
	    
	    tags = {"@BookHotelAndFlights", "not @ShoppingInEbay"}  //this helps us to decide which tags in the feature file we want to run. In case you do not want a particular tag not to run then use the symbol ~ for example "~@OnlineShopping" then this tag will not run
			)
public class MyJunitRunner {

}
