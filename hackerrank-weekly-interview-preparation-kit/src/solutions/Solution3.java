package solutions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Solution3 {

	public static void main(String args[])
	{	
		String result = Solution3.timeConversion("07:05:45PM");
		System.out.println(result);

	}
	
	public static String timeConversion(String s) {
	        DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
	    DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");
	    
	    try {
	            return TWENTY_FOUR_TF.format(
	                    TWELVE_TF.parse(s));
	        } catch (ParseException e) {
	            return s;
	        }
	  }
}
