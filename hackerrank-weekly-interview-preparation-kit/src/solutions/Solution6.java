package solutions;
import java.util.*;

public class Solution6 {

	public static void main(String args[])
	{
		List<Integer> arr = new LinkedList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
		Solution6.lonelyInteger(arr);
	}
	
	public static void lonelyInteger(List<Integer> arr)
	{
		
//    int x = 0;
//        
//        for(int iter : a){
//            x ^= iter;
//        }
//        
//        return x;
		
		Collections.sort(arr);
		for(int i=0; i<arr.size();i++)
		{
			//System.out.println("the value of i is:- "+i);
			if(i+1==arr.size())
			{
				System.out.println(arr.get(arr.size()-1));
			}
			else
			{
				if(arr.get(i) == arr.get(i+1))
				{
					System.out.println("The element being checked is: -"+arr.get(i));
					i=i+1;
					System.out.println("The next element that will be checked is: -"+arr.get(i+1));
					System.out.println();
					System.out.println();
				}
				else
				{
					System.out.println("the answer condition");
					System.out.println(i);
				}
			}
		}
	}
}
