package Read_Excel;

import ReadExcelLibrary.ExcelDataConfig;

public class ReadExcelFromLibrary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\ADMIN\\Desktop\\Test.xlsx");
		
		System.out.println(excel.getdata(1, 0, 1));
		
		
	}

}
