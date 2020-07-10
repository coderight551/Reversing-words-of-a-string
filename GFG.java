/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int t = scanner.nextInt();
	    while(t>0)
	    {
	        String input = scanner.next();
	        String[] array = input.split("\\.");
	        StringBuilder result = new StringBuilder("");
	        for(int i=array.length-1;i>=0;i--)
	        {
	            result.append(array[i]);
	            if(i!=0)
	            {
	                result.append(".");
	            }
	            
	            
	        }
	        System.out.println(result);
	        
	        t--;
	    }
		//code
	}
}
