package Geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestCircle {

   @Test
    public void testCircleArea(){
        Circle c1 = new Circle(9);

        Assert.assertEquals(254.4690,c1.calculatesCircleArea(),0.1);

    }
    @Test
    public void TestCircleCircumference(){
       Circle c2 = new Circle(8);

       Assert.assertEquals(50.264,c2.calculatesCircleCircumference(),0.1);
    }
}
