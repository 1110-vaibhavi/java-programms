import java.util.Scanner;
public class teacher{
     
    int Tid;
    String Tname;
    String Designation ;
    double salary;
    String subject;
    teacher(int id,String name,String desig,String sub,double salary){
       Tid=id;
        Tname=name;
        Designation=desig;
        this.salary=salary;
        subject=sub;
    }
   public String getsubject(){
    return subject;
   }
   public void display(){
    System.out.println("ID :"+Tid);
System.out.println("Name:"+Tname);
System.out.println("Designation: "+Designation);
System.out.println("Salary:"+salary);
    System.out.println("Subject:"+subject);
   }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of teacher :");
        int n=sc.nextInt();
        teacher[] t=new teacher[n];
        for(int i=0;i<n;i++){
        System.out.println("----------------Enter Teacher Details-----------------");
        System.out.println("Enter Id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name :");
       String name=sc.nextLine();
        System.out.println("Enter Designation:");
       String desig=sc.nextLine();
        System.out.println("Enter Subject:");
        String sub=sc.nextLine();
        System.out.println("Enter Salary:");
        float salary=sc.nextInt();
        t[i]=new teacher(id,name,desig,sub,salary);
        }
        System.out.println("\n========= Java Subject Teacher==========");
        boolean found = false;
        for(teacher teacher :t){
            if (teacher.getsubject().equalsIgnoreCase("Java")){
                teacher.display();
                found=true;
            }
            if(!found){
                System.out.println("No teacher found");
            }
        }
        sc.close();
    }
    
}