package Opgave04;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[2];

        rectangle[0] = new Rectangle(4,40);
        rectangle[1] = new Rectangle(3.5,35.9);

        for (int i = 0; i<rectangle.length; i++){
            System.out.println("The height of the rectangle is " + rectangle[i].height + " And the width is " + rectangle[i].width);
            System.out.println("The area is " + rectangle[i].getArea() + " and the perimeter is " + rectangle[i].getPerimeter());
        }

    }
}
