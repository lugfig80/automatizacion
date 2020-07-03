package excelExport;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class leerExcel {

	public void readEXcel(String filePath,String sheetName)throws IOException {
		
		//Crear un objeto de la clase archivo para abrir archivo xlsx
		File file = new File (filePath);
		
		FileInputStream inputStream = new FileInputStream (file);
		
		XSSFWorkbook newWorkBook = new XSSFWorkbook  (inputStream);

		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		
		int rowCount=newSheet.getLastRowNum()- newSheet.getFirstRowNum();
		
		for (int i=0;i < rowCount;i++) {
			XSSFRow row =newSheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j).getStringCellValue()+"||");
				
			}
		}
		
		
	}
	
	public String getCellValue (String filePath,String sheetName,int rowNumber ,int cellNumber) throws IOException {
		File file = new File (filePath);
		
		FileInputStream inputStream = new FileInputStream (file);
		
		XSSFWorkbook newWorkBook = new XSSFWorkbook  (inputStream);

		XSSFSheet newSheet = newWorkBook.getSheet(sheetName);
		
		XSSFRow row =newSheet.getRow(rowNumber);
		
		XSSFCell cell =row.getCell(cellNumber);
		
	
		return cell.getStringCellValue();
		
	}


}
