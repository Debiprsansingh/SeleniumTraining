package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



	public class ExcelWriterByColumnNumber
	{

		public static void main(String[] args) throws Exception
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\91828\\OneDrive\\Documents\\Book1.xlsx");
			FileOutputStream fos = null;
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("login");
			XSSFRow row = sheet.getRow(1);
			XSSFCell cell = row.getCell(4);
			cell.setCellValue("Passed");
			
			fos = new FileOutputStream("C:\\Users\\91828\\OneDrive\\Documents\\Book1.xlsx");
			wb.write(fos);
			wb.close();
			fis.close();
		}

	
	}

