package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public Excelutils(String excelpath, String sheetname) {
		try {
			
			 workbook = new XSSFWorkbook(excelpath);
			 sheet = workbook.getSheet(sheetname);
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	
	public static void getCellData(int rownum, int colnum) {
			
				//String value = sheet.getRow(1).getCell(0).getStringCellValue();
				
			DataFormatter formatter = new DataFormatter();
			Object obj = formatter.formatCellValue(sheet.getRow(rownum).getCell(colnum));
			System.out.println(obj);
				
			
		
	}
	
	public static void getRowCount() {
		
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows"+rowcount);
			
		
	}
	

}
