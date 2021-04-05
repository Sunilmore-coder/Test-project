package ReadExcelLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sh;

	public ExcelDataConfig(String ExcelPath) throws Exception {

		try {
			File src = new File(ExcelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			//sh = wb.getSheetAt(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	
	public String getdata(int sheetnumber, int row, int column)
	
	{
		
		sh = wb.getSheetAt(sheetnumber);
		String data=sh.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	public int getRowCount (int SheetIndex)
	{
		int row=wb.getSheetAt(SheetIndex).getLastRowNum();
	
	return row=row+1;
		
	}
	
}
