import java.util.*;
class Rectangle {
    double length;
    double width;

    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    
    double calculateArea() {
        return length * width;
    }

    
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class rectangledemo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the length :");
        double length =input.nextDouble();
        System.out.print("Enter the Breadth :");
        double breadth = input.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);

        
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}