package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners 	(Listeners.TestNGListner.class)
public class MyFiestTestcase {

	
	@Test
	public void GoogletitleVerify()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
}
