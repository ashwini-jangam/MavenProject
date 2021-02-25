package stMavenProject.stMavenProject;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public void luanchUrl() {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com");
    
	}
        
}
