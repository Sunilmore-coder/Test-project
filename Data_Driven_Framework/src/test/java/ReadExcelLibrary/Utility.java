
package ReadExcelLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	public static String captureScreenshot(WebDriver driver, String Screenshotname) {
		// TODO Auto-generated method stub

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+Screenshotname+".png"));

			System.out.println("Screenshot captured");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception while taking screenshot ="+e.getMessage());
		}
		return Screenshotname;

	}

}
