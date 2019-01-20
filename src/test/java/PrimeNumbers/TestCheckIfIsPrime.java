package PrimeNumbers;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestCheckIfIsPrime {

   @Test
    public void testIfIsPrime(){
        CheckIfIsPrime candidat = new CheckIfIsPrime();
        boolean a = candidat.isPrime(23);
        boolean e = true;

       Assert.assertEquals(e,a);
       Assert.assertEquals(false,candidat.isPrime(6));

    }
    @Test
    public void testArray(){
       CheckIfIsPrime arrayPrime = new CheckIfIsPrime();
       int[] arr1 = new int[]{1, 2, 3, 5, 7, 10, 12};
       int[] expected = new int[]{2, 3, 5, 7};
       int[] actual = arrayPrime.allPrimeNumbers(arr1);
        System.out.println(Arrays.toString(actual));

       Assert.assertEquals(expected[0],actual[0]);
       Assert.assertEquals(expected[3],actual[3]);
       Assert.assertEquals(expected[2],actual[2]);



    }
}
