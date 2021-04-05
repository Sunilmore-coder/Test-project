package Data_Driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ReadExcelLibrary.ExcelDataConfig;

public class WordpressLoginExcel {

	WebDriver driver;

	@Test(dataProvider = "Wordpressdata")
	public void WordpressLogin(String uname, String password) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demosite.center/wordpress/wp-login.php");

		driver.findElement(By.id("user_login")).sendKeys(uname);

		driver.findElement(By.id("user_pass")).sendKeys(password);

		driver.findElement(By.id("wp-submit")).click();

		// System.out.println(driver.getTitle());
		Thread.sleep(5000);

		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is not able to Log In");

		System.out.println("Page Title is verified- user is able to login");
	}

	@DataProvider(name = "Wordpressdata")
	public Object[][] Passdata() throws Exception {

		ExcelDataConfig config = new ExcelDataConfig(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Data_Driven\\TestData\\inputdata.xlsx");
		int rows = config.getRowCount(0);

		Object[][] data = new Object[rows][2];

		for (int i = 0; i < rows; i++) {

			data[i][0] = config.getdata(0, i, 0);

			data[i][1] = config.getdata(0, i, 1);
		}

		return data;

	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}
