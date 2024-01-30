import java.util.Scanner;

public class complex {

    private double x;
    private double y;

    public complex() {
        this(0, 0);
    }

    public complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part (x): ");
        x = scanner.nextDouble();
        System.out.print("Enter the imaginary part (y): ");
        y = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Complex Number: " + x + " + " + y + "i");
    }

    public complex add(complex other) {
        double sumX = this.x + other.x;
        double sumY = this.y + other.y;
        return new complex(sumX, sumY);
    }

    public complex multiply(complex other) {
        double productX = (this.x * other.x) - (this.y * other.y);
        double productY = (this.x * other.y) + (this.y * other.x);
        return new complex(productX, productY);
    }

    public static void main(String[] args) {

        
        complex complex1 = new complex();
        complex complex2 = new complex();

        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the first complex number:");
        complex1.input();

        
        System.out.println("Enter the second complex number:");
        complex2.input();

        
        sc.close();

        
        System.out.println("Complex Number 1:");
        complex1.display();

        System.out.println("\nComplex Number 2:");
        complex2.display();

        
        complex sum = complex1.add(complex2);
        System.out.println("\nSum of Complex Numbers:");
        sum.display();

        complex product = complex1.multiply(complex2);
        System.out.println("\nProduct of Complex Numbers:");
        product.display();
    }
}
