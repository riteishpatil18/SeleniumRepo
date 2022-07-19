package myPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		
		File src = new File("E:\\Selenium\\Demo\\Demo.xlsx");
		//Load File
		FileInputStream fis = new FileInputStream(src);
		
		//load wrokbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		System.out.println(sh.getSheetName());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());

	}

}
