package Geometry;

public class Rectangle {
    int length,width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }


    public int calculatesArea(){
        int area;
        area = getLength()*getWidth();

        return area;

    }

    public int calculatesPerimeter(){
        int perim;
        perim = (getLength() + getWidth())*2;

        return perim;
    }




    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}



