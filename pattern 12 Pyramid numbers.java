/*

    1 
   2 2 
  3 3 3  
 4 4 4 4 
5 5 5 5 5 


*/ 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan= new Scanner(System.in);
		System.out.println("Enter n: ");
		
		int n= scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		    //For spaces
		    
		    for(int j=1;j<=n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    
		    //For numbers
		    
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(i + " ");
		    }
		    
		    System.out.println();
		}
	}
}
