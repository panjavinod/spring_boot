package com.java.funFactor;

import java.util.ArrayList;
import java.util.List;

// Creating FunFactor class to calculate funFactor
public class FunFactor {

	//here creating funFactor method it takes three ArrayList of List as a parameter
	public void funFactor(ArrayList<List<String>> activity, ArrayList<List<String>> fun,ArrayList<List<String>> location) 
	{
		// Creating cost_one variable to add the total cost
		double cost_one=0;
		// creating loop for iterating the location data
		for(int i=1;i<location.size();i++) 
		{  
			// Getting the location 
	        String loc1=(location.get(i)).get(0);
	        System.out.println("--------------------"+loc1+"------------------");
	        double cost=0;
	     // creating loop for iterating the fun data
			for(int j=1;j<fun.size();j++) 
			{   
				// Getting the fun
				String fun1=(fun.get(j)).get(0);
				int funCount =0;
				// creating loop for iterating the location  data
				for(int k=1;k<activity.size();k++) 
				 {
					//here checking the fun 
					String funOriginal=(activity.get(k)).get(2);
					//here checking the location
					String locOriginal=(activity.get(k)).get(3);
					//here checking the equals method of string
					if(loc1.equals(locOriginal)&& fun1.equals(funOriginal))
					{
						// counting the number of Low,HIgh,Medium
						funCount++;
				 }			
			}
				// Changing the String to double format
				double funValue=Double.valueOf((fun.get(j)).get(1));
				// finding the cost of low's,High's,Medium's
				cost=funCount*funValue;
	            // printing 
				System.out.println(fun1+" "+funCount+" "+cost);
				// finding the total cost of location
				cost_one=cost_one+cost;		
		  }	
			System.out.println("total "+cost_one);
			cost_one=0;
		}
		
	}
public void path(String sl,String dl,int days,ArrayList<List<String>> activity, ArrayList<List<String>> fun,ArrayList<List<String>> location)
{
	System.out.println(sl+" path is"+dl);	
}
}

	

