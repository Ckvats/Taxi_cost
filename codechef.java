/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a = sc.nextInt();
		    long b = sc.nextInt();
		    int c =0;
		    int arr[] = new int[a];
		    for(int j=0;j<a;j++)
		    {
		        arr[j] = sc.nextInt();
		    }
		    if(arr[0]==1)
		    {
		        c++;
		    }
		    for(int k=1;k<a;k++)
		    {
		        if(arr[k]==1)
		        {
		            c++;
		        }
		        else if(arr[k-1]==1 && arr[k]==0)
		        {
		            c++;
		        }
		        
		    }
		    System.out.println(b*c);
		}
	}
}
