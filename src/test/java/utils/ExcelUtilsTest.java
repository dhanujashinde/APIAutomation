package utils;

public class ExcelUtilsTest {
	
	public static void main(String[] args) {
		
		String excelpath = "./data/testdata.xlsx";
		String sheetname = "Sheet1";
		Excelutils excel = new Excelutils(excelpath, sheetname);
		
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
	}

}
