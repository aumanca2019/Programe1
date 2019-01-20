package TheNthFibonacciTerm;

import org.junit.Assert;
import org.junit.Test;

public class TestNthFibonacci {

    @Test
    public void TestNthFibonacciArray(){
        NthFibonacci term = new NthFibonacci();
        int Nthterm = 8;
        int actualResult = term.fibo(6);


        Assert.assertEquals(Nthterm,actualResult);
    }
}
