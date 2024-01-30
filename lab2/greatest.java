package lab2;

import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a=input.nextInt();
        System.out.println("Enter the second Number:");
        int b = input.nextInt();
        System.out.println("Enter the third Number:");
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println("The Greatest Number is :"+a);
        }
        else if(b>a && b>c){
            System.out.println("The Greatest Number is :" + b);
        }
        else if(c>a && c>b){
            System.out.println("The Greatest Number is :"+c);
        }
        input.close();
    }
}
