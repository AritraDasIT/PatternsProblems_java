/******************************************************************************

print     *****
          *   *
          *   *           (hollow rectangle)
          *****

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		int n= 4;
		int m= 5;
		
		for(int i=1 ; i<=4 ; i++)  // outer loop for rows
		{
		    for(int j=1; j<=5; j++)
		    {
		        if(i==1 ||i==n || j==1 ||j==m)     //inner loop for column
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		    }
		    
		    System.out.println();
		}
	}
}
