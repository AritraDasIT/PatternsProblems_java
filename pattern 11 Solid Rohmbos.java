/*

    *****
   *****
  *****
 *****
*****             Solid Rohmbos
   

 
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan= new Scanner(System.in);
		System.out.print("Enter n: ");
		
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		    //space
		    
		    for(int j=1;j<=n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    
		    // Stars
		    
		    for(int j=1;j<=n;j++)
		    {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
	}
}
