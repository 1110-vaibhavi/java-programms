
import java.util.*;
public class doctor{
    int dno;
    String Dname;
    String qualification;
    String Specialization;
    doctor(int id,String name,String qua,String spe){
        dno=id;
        Dname=name;
        qualification=qua;
        Specialization=spe;
    }
    void display(){
        System.out.println("Id: "+dno+"| Name : "+Dname+"| Qualification : "+qualification+"|Specia;iztion : "+Specialization);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ht number of Doctors:");
        int n=sc.nextInt();
        sc.nextLine();
        doctor[] doctors=new doctor[n];
        for(int i=0;i<n;i++){
        System.out.println("----------------Enter Doctor Details-----------------");
        System.out.println("Enter Dr.no:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Doctor Name :");
       String name=sc.nextLine();
        System.out.println("Enter Qualification:");
       String qua=sc.nextLine();
        System.out.println("Enter Specialization:");
        String spe=sc.nextLine();
       
        doctors[i]=new doctor(id,name,qua,spe);
        }
        Arrays.sort(doctors,new  Comparator<doctor>(){
            public int compare(doctor d1,doctor d2){
                return d1.Dname.compareToIgnoreCase(d2.Dname);
            }
        });
        System.out.println("\n ======Doctor list ");
        for(doctor doc : doctors){
            doc.display();''
        }
    }

}