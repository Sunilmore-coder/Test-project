package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver StartBrowser(String BrowserName, String URL) {

		if (BrowserName.equalsIgnoreCase("chrome"))
			
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		//driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.get(URL);

		return driver;

	}

}
