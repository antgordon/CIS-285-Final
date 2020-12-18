package code;


import org.junit.Assert;
import org.junit.Test;
public class TestLargest {



	@Test
	public void testPositive() {
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        Largest temp1 = new Largest();
        int maxValue = temp1.largest(arr);
        int expected = 11;
        Assert.assertEquals("Values was not max", expected,  maxValue);
        
	/** add tests to check for this unit test **/	
    }

	@Test
	public void testNegative(){
        int[] arr = new int[4];
        arr[0] = -11;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        Largest temp1 = new Largest();
        int maxValue = temp1.largest(arr);
        int expected = -7;
        Assert.assertEquals("Values was not max", expected,  maxValue);
        
	}

}
