import java.util.*;

public class thirdex2 {
	
	public static void main(String[] args)
	  {
	    writeNums(12);
	    //writeNums(5);
	    //writeNums(1);
	    //writeNums(0);
	  }

	private static void writeNums(int n)
	  {
	    if (n == 1)
	    {
	      // Base case: print "1"
	      System.out.print(n);
	    }
	    else
	    //recursive case
	    {
	      int y = n - 1;
	      
	      //call the function 
	      writeNums(y);
	      
	      // ...then print n
	      System.out.print("," + n);
	    }
	  }
	/*@Test
	public void testwriteNums() 
	{
	    int n  = 3 ; 
	    assertEquals(1,2,3, thirdEx2.(3));
	}*/
	}

