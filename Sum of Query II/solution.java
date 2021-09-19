// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int y = 0;
      double w = 0;
      int[] x = new int[n+m];
      
      for(int i=0;i<n;i++)
          x[i]= a[i];
          
      for(int i=0;i<m;i++)
          x[i+n]= b[i];
          
      Arrays.sort(x);
      
      if(x.length<2)
      {
          w= (x[0]+x[1])/2;
          return w;  
      }
      
      if(x.length%2==0)
      {
          y= x.length/2;
          w= (double)(x[y-1]+x[y])/2;
          return w;
      }
      
      else
      y= (int)Math.ceil((x.length)/2);
      
      return x[y];
    }
}
