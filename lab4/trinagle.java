import java.util.Scanner;
public class trinagle {
    
    private double a, b, c;

    
    public void Triangle() {
    
    }

    public void Triangle(double sideA, double sideB, double sideC) {
        
        a = sideA;
        b = sideB;
        c = sideC;
    }

    
    public void acceptSides() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();
        System.out.print("Enter the length of side c: ");
        c = scanner.nextDouble();
        scanner.close();
    }

    
    public void displaySides() {
        System.out.println("Sides of the triangle: a = " + a + ", b = " + b + ", c = " + c);
    }

    
    public void determineTriangleType() {
        if (a == b && b == c) {
            System.out.println("The triangle is an equilateral triangle.");
        } else if (a == b || b == c || c == a) {
            System.out.println("The triangle is an isosceles triangle.");
        } else if (isRightAngledTriangle()) {
            System.out.println("The triangle is a right-angled triangle.");
        } else {
            System.out.println("The triangle is a scalene triangle.");
        }
    }

    
    private boolean isRightAngledTriangle() {
        double aSquare = a * a;
        double bSquare = b * b;
        double cSquare = c * c;

        return (aSquare + bSquare == cSquare) || (bSquare + cSquare == aSquare) || (cSquare + aSquare == bSquare);
    }

    public static void main(String[] args) {
        // Example usage
        trinagle triangle = new trinagle();
        triangle.acceptSides();
        triangle.displaySides();
        triangle.determineTriangleType();
    }
}

    
