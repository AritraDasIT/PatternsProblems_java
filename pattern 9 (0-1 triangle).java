/*

1
01
101
0101
10101

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1; i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        int sum= (i+j);
		        if(sum%2==0)
		        {
		            System.out.print("1") ;           // if (i+j) = even then 1
		        }
		        else
		        {
		            System.out.print("0");               // if (i+j)= odd print 0
		        }
		    }
		    
		    System.out.println();
		}
	}
}
