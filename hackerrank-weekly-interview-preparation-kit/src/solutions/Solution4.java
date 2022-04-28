package solutions;

public class Solution4 {

	public static void main(String args[])
	{
		Solution4.fizzBuzz(15);
	}
	
public static void fizzBuzz(int n) {
        
	for (int i = 1; i <= n; i++) 
	{
	  if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 5 & 3?
	    System.out.println("FizzBuzz");
	  else if ((i % 5) == 0) // Is it a multiple of 5?
	    System.out.println("Buzz");
	  else if ((i % 3) == 0) // Is it a multiple of 3?
	    System.out.println("Fizz");
	  else
	    System.out.println(i); // Not a multiple of 5 or 7
	}    
    }
}
