package solutions;

import java.util.*;

public class Solution7 {

	public static void main(String args[])
	{
		List<List<Integer>> arr = new LinkedList<List<Integer>>();
		List<Integer> row1 = new LinkedList<Integer>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		arr.add(row1);
		List<Integer> row2 = new LinkedList<Integer>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		arr.add(row2);
		List<Integer> row3 = new LinkedList<Integer>();
		row3.add(9);
		row3.add(8);
		row3.add(9);
		arr.add(row3);
		int result = Solution7.diagonalDifference(arr);
		System.out.println(result);
	}
	
	public static int diagonalDifference(List<List<Integer>> arr)
	{
		int primary_diagonal = 0;
		int secondary_diagonal = 0;
		for(int i=0; i<arr.size();i++)
		{
			primary_diagonal = primary_diagonal+arr.get(i).get(i);
			secondary_diagonal = secondary_diagonal+arr.get(i).get(arr.size()-i-1);
		}
		return Math.abs(primary_diagonal-secondary_diagonal);
	}
}
