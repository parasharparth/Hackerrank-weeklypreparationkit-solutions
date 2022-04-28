package solutions;

import java.util.*;

public class Solution5 {

	public static void main(String args[])
	{
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(Solution5.findMedian(list));
	}
	
	public static int findMedian(List<Integer> list)
	{
		//The first step is to check whether the number of elements are even or odd
		if(list.size() %2 == 1)
		{
			return list.get((list.size()+1)/2-1);
		}
		else
		{
			return list.get(list.size()/2-1 + list.get(list.size()/2)/2);
		}
		
	}
}

