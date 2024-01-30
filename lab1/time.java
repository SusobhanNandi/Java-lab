import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

    
        int S = seconds % 60;  
        int H = seconds / 60;  
        int M = H % 60;        
        H = H / 60;            

    
        System.out.print(H + ":" + M + ":" + S);
        System.out.print("\n");
        input.close();
    }
}

