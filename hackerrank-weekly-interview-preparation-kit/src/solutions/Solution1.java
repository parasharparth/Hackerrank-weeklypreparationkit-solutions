package solutions;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {

	public static void main(String args[])
	{
		//define a list here
		List<Integer> arr = new LinkedList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(0);
		arr.add(-1);
		
		arr.add(-2);
		arr.add(-3);
		Solution1.plusMinus(arr);
	}
public static void plusMinus(List<Integer> arr) {    
        
        double[] result = new double[3];
        NumberFormat nm = new DecimalFormat("#0.0000000");
        
        //the first step is to find the positive, negatives and zero
        for(int i=0; i<arr.size(); i++)
        {
            if(arr.get(i)>0)
            {
                //the number is positive
                result[0]++;
            }
            else if(arr.get(i) == 0)
            {
                //the number is zero
                result[1]++;
            }
            else
            {
                //the number is negative
                result[2]++;
            }
        }
        
        System.out.println(nm.format(result[0]/arr.size()));
        System.out.println(nm.format(result[1]/arr.size()));
        System.out.println(nm.format(result[2]/arr.size()));
    }

}	
	
