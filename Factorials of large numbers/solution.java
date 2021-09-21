// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public static void helper(ArrayList<Integer> result, int x)
    {
        // Inititalise carryOver as 0.
        int carryOver = 0;

        for (int i = 0; i < result.size(); i++)
        {
            int value = result.get(i) * x + carryOver;

            // Store last digit of value in the result.        
            result.set(i , value % 10);

            // Remove the last digit from value and carry the remaining value.        
            carryOver = value / 10;
        }

        // Run the loop until carryOver doesn't become zero.
        while (carryOver != 0)
        {
            // Push the last digit of carryOver in result array.
            result.add(carryOver % 10);

            // Update the carryOver.        
            carryOver = carryOver / 10;
        }
    }

    static ArrayList<Integer> factorial(int N){
        //code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Enter 1 as the first element in the factorial array/list.    
        result.add(1);

        // Run loop for calculating factorial for rest of the elements.
        for (int x = 2; x <= N; x++)
        {
            // Call the helper function for each x and update the result array/list.
            helper(result, x);
        }
Collections.reverse(result);
        return result;
    }
}
