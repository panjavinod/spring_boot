package com.java.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.excelRead.ExcelActivity;
import com.java.funFactor.FunFactor;

 // This is the mail class of the Program 
public class Travel {
	
	// This main method execute the program
	public static void main(String[] args) {
		
		// Scanner is the Class Of The Java.util Package it is used to read the data from User
		Scanner sc=new Scanner(System.in);
		// Enter Source Location from user
		System.out.println("Enter the source location");
		String sL=sc.next();
		// Enter Destination Location from User
		System.out.println("Enter the destination location");
		String dL=sc.next();
		// Enter the days of Trip from User
		System.out.println("Enter the No of Days");
	    int days=sc.nextInt();
	    // Enter the excel data form location from User 
	    System.out.println("Enter the Excel location");
		String uRl=sc.next();
		
		//Creating ExcelActivity class Object 
		ExcelActivity obj = new ExcelActivity();
		// Here calling Validate method with help of ExcelActivity object obj
		ArrayList<List<String>> arrayList=obj.validate(uRl);
		for(List sheet1:arrayList) {
			System.out.println(sheet1);
		}
		// Here calling ValidateOne method with help of ExcelActivity object obj
		ArrayList<List<String>> arrayListOne=obj.validateOne(uRl);
		for(List sheet2:arrayListOne) {
			System.out.println(sheet2);
		}
		// Here calling ValidateTwo method with help of ExcelActivity object obj
		ArrayList<List<String>> arrayListTwo=obj.validateTwo(uRl);
		for(List sheet3:arrayListTwo) {
			System.out.println(sheet3);
		}
		//Creating FunFactor class Object 
		FunFactor fn=new FunFactor();
		// Here calling funFactor method with help of FunFactor object fn
        fn.funFactor(arrayList, arrayListOne, arrayListTwo);
        fn.path(sL, dL, days, arrayList, arrayListOne, arrayListTwo);
	}
}
