// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
       int ans[]=new int[n+m]; 
       int i=0,j=0,t=0;
        while(i<n && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                ans[t]=arr2[j];
                j++;
                t++;
            }
            else{
                ans[t]=arr1[i];
                i++;
                t++;
            }
        }
        while(i<n){
             ans[t]=arr1[i];
             i++;
             t++;
         }
         while(j<m){
             ans[t]=arr2[j];
             j++;
             t++;
         }
          int q=1;
         for(int s=0;s<ans.length;s++){
             if(s==k-1){
             q= ans[s];
                break;
                 
             }
         }
         return q;
    }
}
