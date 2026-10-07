import java.util.*;

public class person {

    int pid, age;
    String pname, gender;

    person() {
        System.out.println("----------------Person Catalog--------------");
    }

    person(String pname, int age, int pid, String gender) {
        this.pid = pid;
        this.age = age;
        this.pname = pname;
        this.gender = gender;
    }

    void showdetails() {
        System.out.println("----------Person Details-----------");
        System.out.println("ID: " + pid + "\t"
                + "NAME: " + pname + "\t"
                + "AGE: " + age + "\t"
                + "GENDER: " + gender);
        System.out.println("-----------------------------------------------------------------");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        person p1[] = new person[5];

        System.out.println("Enter 5 person details:");

        for (int i = 0; i < 5; i++) {

            p1[i] = new person();

            System.out.println(
                "_____________Enter Details of person "
                + (i + 1) + "_____________________"
            );

            System.out.println("Enter name:");
            p1[i].pname = sc.nextLine();

            System.out.println("Enter gender:");
            p1[i].gender = sc.nextLine();

            System.out.println("Enter id:");
            p1[i].pid = sc.nextInt();

            System.out.println("Enter age:");
            p1[i].age = sc.nextInt();

            // Clear the Enter key
            sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            p1[i].showdetails();
        }

        sc.close();
    }
}