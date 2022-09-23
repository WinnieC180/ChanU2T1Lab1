// Rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and prints area
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }

    public void printPerimeter() {
        int perimeter = (2 * length) + (2 * width);
        System.out.println("My perimeter is: " + perimeter);
    }
}


