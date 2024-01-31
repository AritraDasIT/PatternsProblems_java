/*

    1
   212
  32123
 4321234
543212345

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n: ");
		
		int n= scan.nextInt();
		
		for(int i=1; i<=n;i++)
		{
		    //for spaces
		    
		    for(int j=1;j<=n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    
		    // for left half 
		    
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print(j);
		    }
		    
		    //for right half
		    for(int j=2;j<=i;j++)
		    {
		        System.out.print(j);
		    }
		    
		    System.out.println();
		}
	}
}
