package lab2;
import java.util.Scanner;
public class primeusingfunction {
    public static void main(String[] args) {
        System.out.print("Enter n value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 to " + n + " are ");
        prime(n);
        sc.close();
    }
    public static void prime(int n){
        int i,count;
        for (int j = 2; j <= n; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j+" ");
        }
        
    }
}
