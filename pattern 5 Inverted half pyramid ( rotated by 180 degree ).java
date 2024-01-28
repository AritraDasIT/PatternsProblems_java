/* 

    *
   **
  ***
 ****
*****                 print 

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the value of n: ");
	    int n= sc.nextInt();
	    
	    
	    for(int i=0;i<=n;i++)    //outer loop
	    {
	        
	        for(int j=1;j<=n-i;j++)     // inner loop for -> space print
	        {
	            System.out.print(" ");
	        }
	        
	        for(int j=1; j<=i;j++)      //inner loop for -> star print
	        {
	            System.out.print("*");
	        }
	        
	        System.out.println();      // for next line 
	    }
	}
}
