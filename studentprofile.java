import java.io.*;
public class studentprofile{
    int rollno;
    String name;
    String classname;

    studentprofile(int r,String n,String c){
        this.rollno=r;
        this.name=n;
        this.classname=c;
    }
    public void profile(){
        System.out.println("Name : "+name+"\n"+"Rollno : "+rollno+"\n"+"ClassName : "+classname+"\n");
    }
    public static void main(){
        studentprofile s1=new studentprofile(1,"Vaibhavi","T.Y.BBA(CA)");
        s1.profile();
    }
}