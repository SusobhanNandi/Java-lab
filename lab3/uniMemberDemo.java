import java.util.Scanner;

class UniMember {
    String name;
    String gender;

    
    UniMember(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Student extends UniMember {
    int rollNumber;

    
    Student(String name, String gender, int rollNumber) {
        super(name, gender);
        this.rollNumber = rollNumber;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Faculty extends UniMember {
    int employeeId;

    
    Faculty(String name, String gender, int employeeId) {
        super(name, gender);
        this.employeeId = employeeId;
    }

    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class uniMemberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter student's name: ");
        String studentName = input.nextLine();
        System.out.print("Enter student's gender: ");
        String studentGender = input.nextLine();
        System.out.print("Enter student's roll number: ");
        int rollNumber = input.nextInt();

        Student student = new Student(studentName, studentGender, rollNumber);

        
        input.nextLine(); 
        System.out.print("\nEnter faculty's name: ");
        String facultyName = input.nextLine();
        System.out.print("Enter faculty's gender: ");
        String facultyGender = input.nextLine();
        System.out.print("Enter faculty's employee ID: ");
        int employeeId = input.nextInt();

        Faculty faculty = new Faculty(facultyName, facultyGender, employeeId);

        
        System.out.println("\nStudent Details:");
        student.displayDetails();

        System.out.println("\nFaculty Details:");
        faculty.displayDetails();
    }
}