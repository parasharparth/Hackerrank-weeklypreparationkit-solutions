package solutions;

import java.util.Collections;
import java.util.LinkedList;

public class Solution2 {

	public static void main(String args[])
	{
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(1);
		arr.add(5);
		arr.add(3);
		arr.add(9);
		arr.add(7);
		
		Solution2.miniMaxSum(arr);
	}
	
	public static void miniMaxSum(LinkedList<Integer> arr)
	{
		//The first step is to sort the given array
		Collections.sort(arr);
	
		long maxSum=0;
		long minSum=0;
		
		//find the maximum sum (leave the first element)
		for(int i=1;i<arr.size();i++)
		{
			maxSum = maxSum+arr.get(i);
		}
		
		//find the minimum sum (leave the last element)
		for(int i=0;i<arr.size()-1;i++)
		{
			minSum = minSum+arr.get(i);
		}
		
		System.out.println(minSum + " " + maxSum);
		
	}
	
}
