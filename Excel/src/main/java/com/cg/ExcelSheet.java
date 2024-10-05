package com.cg;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) {
		try {
			
			String filename = "C:\\Users\\pvinod\\eclipse-workspace\\Excel.xlsx";
			
			
			
			XSSFWorkbook workbook = new XSSFWorkbook();
			
			XSSFSheet sheet = workbook.createSheet("January");
			XSSFCellStyle style = workbook.createCellStyle();
			style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
			style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
			
			XSSFRow rowhead = sheet.createRow((short)0);
		    Cell  cell=rowhead.createCell(0);
			cell.setCellValue("S.No.");
			sheet.setColumnWidth(0,5000);
			cell.setCellStyle(style);
			
			Cell  cell1=rowhead.createCell(1);
			cell1.setCellValue("Customer Name");  
			sheet.setColumnWidth(1,5000);
			cell1.setCellStyle(style);
			
			Cell  cell2=rowhead.createCell(2);
			cell2.setCellValue("Account Number"); 
			sheet.setColumnWidth(2,5000);
			cell2.setCellStyle(style);
			
			Cell  cell3=rowhead.createCell(3);
			cell3.setCellValue("e-mail");  
			sheet.setColumnWidth(3,5000);
			cell3.setCellStyle(style);
			
			
			Cell  cell4=rowhead.createCell(4);
			cell4.setCellValue("Balance");
			sheet.setColumnWidth(4,5000);
			cell4.setCellStyle(style);
			
			
			//creating the 1st row  
			XSSFRow row = sheet.createRow((short)1); 
			
			//inserting data in the first row  
			row.createCell(0).setCellValue("1");  
			sheet.setColumnWidth(0,5000);
			row.createCell(1).setCellValue("John William"); 
			sheet.setColumnWidth(1,5000);
			row.createCell(2).setCellValue("9999999");
			sheet.setColumnWidth(2,5000);
			row.createCell(3).setCellValue("william.john@gmail.com"); 
			sheet.setColumnWidth(3,5000);
			row.createCell(4).setCellValue("700000.00");  
			sheet.setColumnWidth(4,5000);
			//creating the 2nd row  
			XSSFRow row1 = sheet.createRow((short)2);  
			//inserting data in the second row  
			row1.createCell(0).setCellValue("2");  
			row1.createCell(1).setCellValue("Mathew Parker");  
			row1.createCell(2).setCellValue("22222222");  
			row1.createCell(3).setCellValue("parker.mathew@gmail.com");  
			row1.createCell(4).setCellValue("200000.00");  
			FileOutputStream fileout = new FileOutputStream(filename);
			workbook.write(fileout);
			fileout.close();
			workbook.close();
			
			
			
			System.out.println("file has been created successfully");
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
