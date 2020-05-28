package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;
	public ExcelUtils(String excelPath, String sheetName){ 

		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getCellData(int rownum, int colnum){

		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rownum).getCell(colnum));
		System.out.println(value);


	}

	public static void getRowCount(){
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);


	}
}
