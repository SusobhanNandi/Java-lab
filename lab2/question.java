//print odd numbers between 0 to 20 
package lab2;

public class question {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }
    }
}
