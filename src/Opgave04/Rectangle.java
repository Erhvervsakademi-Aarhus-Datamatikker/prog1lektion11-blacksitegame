package Opgave04;

public class Rectangle {
    public double width;
    public double height;


    Rectangle (){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.height = height;
        rectangle1.width = width;
    }

    Rectangle (double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getArea (){

        return height*width;
    }

    public double getPerimeter (){

        return (height+width)*2;
    }
}
