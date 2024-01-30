package lab2;
import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number=input.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        input.close();
    }
}
    

