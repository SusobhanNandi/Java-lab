package lab2;
import java.util.Scanner;
public class e {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the series: ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i) + " ");
        }
        input.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        
    }

}
