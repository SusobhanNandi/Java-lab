import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle :");
        float length= input.nextFloat();
        System.out.print("Enter the breadth of the rectangle :");
        float breadth= input.nextFloat();
        float area=length*breadth;
        float perimeter =2*(length+breadth);
        System.out.println("The area is :" + area);
        System.out.println("The perimeter is :" + perimeter);
        input.close();
    }
    
}
