import java.util.Scanner;
class shape {

    String name;

    static class square {
        double side;

        double sqarea() {
            return (double) (side * side);
        }
    }

    static class rectangle{
			 double length;
			 double breath;
		 
		 double recarea() {
			 return (double) (length*breath);
		 }
	}

    public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		System.out.println("enter the objective");
		String str=sc.nextLine();
		
		shape sh=new shape();
		sh.name=str;
		if(sh.name.equals("Square")|| sh.name.equals("square")) {
			square sq=new square();
			System.out.println("enter the side of the square");
			sq.side=sc.nextDouble();
			System.out.println("the area  of the square is:"+sq.sqarea());
		}
		else if(sh.name.equals("rectangle") || sh.name.equals("Rectangle")) {
			rectangle re=new rectangle();
			System.out.println("enter the length of the ");
			re.length=sc.nextDouble();
			System.out.println("enter the breath of the rectangle");
			re.breath=sc.nextDouble();
			
			System.out.println("the are of the rectangle is :"+re.recarea());
		}
		else {
			System.out.println("wrong input entered");
		}
    }
}