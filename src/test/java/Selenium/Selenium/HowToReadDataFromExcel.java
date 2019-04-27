package Selenium.Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class HowToReadDataFromExcel {

	
	
	//https://www.allegisgroup.com
	@Test
	public void jobsearchOnAllegisGroupHomePageBasic() throws IOException {
		
	     FileInputStream fis = new FileInputStream("C:\\Users\\18482\\Desktop\\rkexcel.xlsx");
	    
	    // XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	     Workbook wb = new HSSFWorkbook(fis);
	     //XSSFSheet sheet = workbook.getSheet("Sheet1");
	     Sheet sheet = wb.getSheetAt(0);
	     
	     
	   //  int rows =sheet.getLastRowNum();
	     //int colums =sheet.getColumnWidth(columnIndex)
	     //Row row = sheet.getRow(0);
	     //Cell cell = row.getCell(0);
	     
	  //   System.out.println(rows);
	     //System.out.println(colums);
//	     System.out.println(sheet.getRow(0).getCell(0));
//	     String cellval = cell.getStringCellValue();
//	     System.out.println(cellval);
	    // String inputData [] [] = new String [rows] [colums];
	    		 
	    		 

	     
	           
	}
	
}
