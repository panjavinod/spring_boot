package com.cg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,List<String>>map = new LinkedHashMap<Integer,List<String>>();
		try {
			FileInputStream file=new FileInputStream(new File("C:\\Users\\pvinod\\eclipse-workspace\\Excel.xlsx"));
		    
			Workbook wb=new XSSFWorkbook(file);
			
		    Sheet sheet=wb.getSheetAt(0);
		    DataFormatter formatter = new DataFormatter();
		    
		    Iterator<Row> rowIterator = sheet.iterator();
		    int a=0;
		    Row row;
		    while(rowIterator.hasNext()) {
		          row = rowIterator.next();		    	
		    	Iterator<Cell> cellIterator = row.iterator();
		    	List<String> list = new ArrayList<String>();
		    	
		    	while(cellIterator.hasNext()) {
		    		Cell cell = cellIterator.next();
		    		
		    		switch(cell.getCellType()) {
		    		case Cell.CELL_TYPE_NUMERIC:
		    			list.add(formatter.formatCellValue(cell));
		    			
		    			//System.out.print(cell.getNumericCellValue()+" ");
		    			break;
		    		case Cell.CELL_TYPE_STRING:
		    			list.add(formatter.formatCellValue(cell));
		    			//System.out.print(cell.getStringCellValue()+" ");
		    			break;
		    		}
		    		
		    	}
		    	
		    	map.put(a++,list);	 
		    	
		    }
		   
		    for (Map.Entry<Integer,List<String>> entry : map.entrySet()) {
		    System.out.println(entry.getValue());
		    
		   
		    }
		    System.out.println(sheet.getPhysicalNumberOfRows());
		    System.out.println(wb.getNumberOfSheets());
		    
		    
		    FileOutputStream fileout=new FileOutputStream("C:\\Users\\pvinod\\eclipse-workspace\\Excel2.xlsx");
		    Workbook workbook=new XSSFWorkbook();
		    
		    for(int i=0;i<wb.getNumberOfSheets();i++) {
		        Sheet sheett= workbook.createSheet(wb.getSheetName(i));
		        System.out.println(wb.getSheetName(i));
		      for(int j=0;j<sheet.getPhysicalNumberOfRows();j++) {
		    	  Row row1=sheett.createRow(j);
		    	  
		          }
		       
			    }
		       
		    
		    
		    file.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}



