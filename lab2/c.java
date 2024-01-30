package lab2;
import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        int r= 5;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x and y ");
        float x=input.nextFloat();
        float y=input.nextFloat();
        float X=(float) Math.pow(x,2);
        float Y =(float)Math.pow(y,2);
        float R=(float)Math.pow(r,2);

        if(X+Y <=R){
            System.out.println("The point,"+x +","+y +"lies in the circle");
        }
        else if(X+Y >R){
            System.out.println("The point," + x + "," + y + " does not lie in the circle");
        }
        input.close();
    }
}
