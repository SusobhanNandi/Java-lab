package lab2;

public class a {
    public static void main(String[] args) {
            System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
            System.out.println("x   |   y = e^(-x)");
            System.out.println("-------------------");
    
            for (double x = 0; x <= 1; x += 0.1) {
                double y = Math.exp(-x);
                System.out.printf("%.1f | %.4f\n", x, y);
            }
    }

}
