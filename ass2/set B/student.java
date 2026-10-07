import java.util.*;

class StudentDemo {
    int rollno;
    String name;
    double per;

    // Parameterized constructor
    StudentDemo(int rollno, String name, double per) {
        this.rollno = rollno;
        this.name = name;
        this.per = per;
    }

    // toString() method
    public String toString() {
        return "Roll No: " + rollno +
               "\tName: " + name +
               "\tPercentage: " + per;
    }
}

public class student {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        StudentDemo s[] = new StudentDemo[n];

        // Create n objects
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Roll No: ");
            int rollno = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Percentage: ");
            double per = sc.nextDouble();

            // Parameterized constructor
            s[i] = new StudentDemo(rollno, name, per);
        }

        // Display objects using toString()
        System.out.println("\n--------- Student Details ---------");

        for (int i = 0; i < n; i++) {
            System.out.println(s[i].toString());
        }

        sc.close();
    }
}