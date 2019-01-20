package Geometry;

import static java.lang.Math.PI;


public class Circle {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public float calculatesCircleArea(){
        float circleArea;
        circleArea = (float) (PI * Math.pow(radius,2));

        return (float)circleArea;

    }

    public float calculatesCircleCircumference(){
        float circleCircumference;
        circleCircumference = (float)(2 * PI * radius);

        return (float)circleCircumference;

    }



    public int getRadius() {
        return radius;
    }
}

