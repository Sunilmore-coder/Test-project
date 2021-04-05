package Read_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("C:\\Users\\ADMIN\\Desktop\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);

		String data0 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);

		String data1 = sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);

	}

}
