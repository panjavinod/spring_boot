package com.java.excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// creating the class ExcelActivity to read the User excel data
public class ExcelActivity {
	
	// here creating validate method it takes uRl as a parameter
	public  ArrayList<List<String>> validate(String uRl){
		
		// here creating ArrayList of list to store the data
		ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
		try {
			//obtaining input bytes from a file  
			FileInputStream file=new FileInputStream(new File(uRl));
			//creating workbook instance that refers to .xls file  
			Workbook wb=new XSSFWorkbook(file);
			DataFormatter formatter = new DataFormatter();
			//creating a Sheet object to retrieve the object  
		    Sheet sheet=wb.getSheetAt(0);
		    System.out.println("Sheet name is "+sheet.getSheetName());
		    //creating a Row object to retrieve the object  
		        Iterator<Row> rowIterator = sheet.iterator();
		      //iterating the each row from excel sheet  
		           while(rowIterator.hasNext())
		           {
		               Row row = rowIterator.next();
		             //creating a Cell object to retrieve the object 
		    	       Iterator<Cell> cellIterator = row.iterator();
		    	       // Here creating the list to add the each column data 
		    	       List<String> list = new ArrayList<String>();
		    	     //iterating over each column 
		    	          while(cellIterator.hasNext()) 
		    	       {
		    		        Cell cell = cellIterator.next();
		    		
		    		      switch(cell.getCellType()) 
		    		      {
		    		      //field that represents number cell type  
		    		        case Cell.CELL_TYPE_NUMERIC:
		    		      // here adding the column data to the list
		    			    list.add(formatter.formatCellValue(cell));
		    			    break;
		    			  //field that represents string cell type  
		    		        case Cell.CELL_TYPE_STRING:
		    		       // here adding the column data to the list
		    			    list.add(formatter.formatCellValue(cell));
		    			    break;
		    		      }
		    		
		    	       }
		    	          //Here adding the list data to  the ArrayList
		    	          arrayList.add(list); 		    	     
		    	   } 
		    //here closing the file       
			file.close();	
	}
	    // catch block to handle the exception
		catch (Exception e) {
			System.out.println(e);
		}
        // return the arrayList data to the main method
		return arrayList;
		}
	// here creating validateOne method it takes uRl as a parameter
		public  ArrayList<List<String>> validateOne(String uRl){
	// here creating ArrayList of list to store the data
			ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
			try {
				//obtaining input bytes from a file  
				FileInputStream file=new FileInputStream(new File(uRl));
				//creating workbook instance that refers to .xls file  
				Workbook wb=new XSSFWorkbook(file);
				DataFormatter formatter = new DataFormatter();
				//creating a Sheet object to retrieve the object  
			    Sheet sheet=wb.getSheetAt(1);
			    System.out.println("Sheet name is "+sheet.getSheetName());
			    //creating a Row object to retrieve the object  
			        Iterator<Row> rowIterator = sheet.iterator();
			      //iterating the each row from excel sheet  
			           while(rowIterator.hasNext())
			           {
			               Row row = rowIterator.next();
			             //creating a Cell object to retrieve the object 
			    	       Iterator<Cell> cellIterator = row.iterator();
			    	       // Here creating the list to add the each column data 
			    	       List<String> list = new ArrayList<String>();
			    	     //iterating over each column 
			    	          while(cellIterator.hasNext()) 
			    	       {
			    		        Cell cell = cellIterator.next();
			    		
			    		      switch(cell.getCellType()) 
			    		      {
			    		      //field that represents number cell type  
			    		        case Cell.CELL_TYPE_NUMERIC:
			    		      // here adding the column data to the list
			    			    list.add(formatter.formatCellValue(cell));
			    			    break;
			    			  //field that represents string cell type  
			    		        case Cell.CELL_TYPE_STRING:
			    		       // here adding the column data to the list
			    			    list.add(formatter.formatCellValue(cell));
			    			    break;
			    		      }
			    		
			    	       }
			    	          //Here adding the list data to  the ArrayList
			    	          arrayList.add(list); 		    	     
			    	   } 
			    //here closing the file       
				file.close();	
		}
			// catch block to handle the exception
			catch (Exception e) {
				System.out.println(e);
			}
			 // return the arrayList data to the main method
			return arrayList;
			}
		// here creating validateOne method it takes uRl as a parameter
				public  ArrayList<List<String>> validateTwo(String uRl){
			// here creating ArrayList of list to store the data
					ArrayList<List<String>> arrayList = new ArrayList<List<String>>();
					try {
						//obtaining input bytes from a file  
						FileInputStream file=new FileInputStream(new File(uRl));
						//creating workbook instance that refers to .xls file  
						Workbook wb=new XSSFWorkbook(file);
						DataFormatter formatter = new DataFormatter();
						//creating a Sheet object to retrieve the object  
					    Sheet sheet=wb.getSheetAt(2);
					    System.out.println("Sheet name is "+sheet.getSheetName());
					    //creating a Row object to retrieve the object  
					        Iterator<Row> rowIterator = sheet.iterator();
					      //iterating the each row from excel sheet  
					           while(rowIterator.hasNext())
					           {
					               Row row = rowIterator.next();
					             //creating a Cell object to retrieve the object 
					    	       Iterator<Cell> cellIterator = row.iterator();
					    	       // Here creating the list to add the each column data 
					    	       List<String> list = new ArrayList<String>();
					    	     //iterating over each column 
					    	          while(cellIterator.hasNext()) 
					    	       {
					    		        Cell cell = cellIterator.next();
					    		
					    		      switch(cell.getCellType()) 
					    		      {
					    		      //field that represents number cell type  
					    		        case Cell.CELL_TYPE_NUMERIC:
					    		      // here adding the column data to the list
					    			    list.add(formatter.formatCellValue(cell));
					    			    break;
					    			  //field that represents string cell type  
					    		        case Cell.CELL_TYPE_STRING:
					    		       // here adding the column data to the list
					    			    list.add(formatter.formatCellValue(cell));
					    			    break;
					    		      }
					    		
					    	       }
					    	          //Here adding the list data to  the ArrayList
					    	          arrayList.add(list); 		    	     
					    	   } 
					    //here closing the file       
						file.close();	
				}
					// catch block to handle the exception
					catch (Exception e) {
						System.out.println(e);
					}
					 // return the arrayList data to the main method
					return arrayList;
					}
}
