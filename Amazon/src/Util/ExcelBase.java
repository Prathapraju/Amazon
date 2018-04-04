package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.io.File;


public class ExcelBase {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
  @Test
  public static void getExcel() {
	  try {
		//String ExcelFile= "E:\\Selenium_workspace\\Oxygen\\Amazon\\src\\Util\\TestData.xlsx";
		  File fil=new File("E:\\Selenium_workspace\\Oxygen\\Amazon\\src\\Util\\TestData.xlsx");
		  FileInputStream fis=new FileInputStream(fil);
		  wb=new XSSFWorkbook(fis);		  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test
  public static String getData(int Sheetnum, int row, int col)
  {
	  sheet=wb.getSheetAt(Sheetnum);
	  String data=sheet.getRow(row).getCell(col).getStringCellValue();
	return data;
	  
  }
  
}
