//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Main
{
	public static void main(String[] args)
	{
		
    int[] nums = {7,28,496,1111,199,201,17};
    for( int num : nums )
      {
        Number one = new Number(num);
        if (one.isOdd(num))
	      System.out.print( num + " is odd.\n" );
        else 
	      System.out.print( num + " is not odd.\n" );
	
        if (one.isPerfect(num))
	      System.out.print( num + " is perfect.\n" );
        else 
	      System.out.print( num + " is not perfect.\n" );
      }
            //see readme file for additional code
           
	}
}