package Geometry;

import org.junit.Assert;
import org.junit.Test;

public class TestRectangle {

    @Test
    public void testAreaFormula() {
        Rectangle r1 = new Rectangle(45, 20);

        int area1 = 900;
        int testArea1 = r1.calculatesArea();

        Assert.assertEquals(area1,testArea1);
    }

    @Test
    public void testPerimeterFormula(){
        Rectangle r2 = new Rectangle(50,25);


        Assert.assertEquals(150,r2.calculatesPerimeter());
    }
}
