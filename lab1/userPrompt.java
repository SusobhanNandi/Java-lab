import java.util.Scanner;
public class userPrompt {
    public static void main(String[] args) {
        System.out.println("Name:Susobhan Nandi,Roll no: 2230214");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String Name=input.nextLine();
        System.out.println("Enter your roll no:");
        String roll = input.nextLine();
        System.out.println("Enter your branch:");
        String Branch =input.nextLine();
        System.out.println("Enter your university name:");
        String University =input.nextLine();
        System.out.println("The details are :"+"\n"+Name +"\n" +roll +"\n" +Branch +"\n" +University);
        input.close();
    }
}
