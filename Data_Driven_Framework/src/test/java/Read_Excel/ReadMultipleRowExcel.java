
package Read_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleRowExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("C:\\Users\\ADMIN\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);

		int rc = sh.getLastRowNum();
		int rowcount = rc + 1;
		System.out.println("number of Rows = " + rowcount);

		for (int i = 0; i <= rc; i++) {

			String data = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("data From Excel is =  " + data);

		}

	}

}
