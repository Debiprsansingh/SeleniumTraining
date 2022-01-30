package excelDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderBycolumnNumber {
	

		
		public static void main(String[] args) throws IOException 
		{
			FileInputStream fis= new FileInputStream("C:\\Users\\91828\\OneDrive\\Documents\\Book1.xlsx");
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("login");
			XSSFRow row = sheet.getRow(2);
			XSSFCell cell = row.getCell(1);
			
			String str=cell.getStringCellValue();
			System.out.println(str);
			
			wb.close();
			fis.close();
	}

}
