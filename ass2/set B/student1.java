 class student1{
    int rno,mark1,mark2;
    String name;
    student1(int r,String n,int m1,int m2){
        this.rno=r;
        this.mark1=m1;
        this.mark2=m2;
        this.name=n;
    }

public class result {
    float total;
    double per;
    void calculateanddisplay(){
        total=mark1+mark2;
        per=total / 2.0;
        System.out.println("-----------Result-----------");
        System.out.println("Roll No : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Mark 1 : "+mark1);
        System.out.println("Mark 2 : "+mark2);
        System.out.println("Total : "+total);
        System.out.println("Percentage : "+per);
    }
}
    public static void main(String args[]){
        student1 obj=new student1(101,"vaibhavi babar",90,78);
        student1.result resultobj=obj.new result();
        resultobj.calculateanddisplay();
    }
}
