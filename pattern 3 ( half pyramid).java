/******************************************************************************

*
**
***
****
*****
******         print {half pyramid}
 
 
 
*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("Enter the value of n : ");
	    Scanner sc= new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i=0; i<=n;i++)
	    {
	        for(int j=1; j<=i;j++)
	        {
	            	System.out.print("*");
	        }
	        
	        	System.out.println();
	    }
	         
	         
	}
}
