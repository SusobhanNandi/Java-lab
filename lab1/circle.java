import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius number :");
        float r = input.nextFloat();
        float area =(float) (3.14*r*r);
        float circumference =(float)(2*3.14*r);
        System.out.println("The area is :"+area);
        System.out.println("The circumference is :"+circumference);
        input.close();
        
    }
    
}
