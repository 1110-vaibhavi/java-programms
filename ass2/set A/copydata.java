class copy{
    String name;
    copy(String name){
        this.name=name;
    }
    copy(copy c1){
        this.name=c1.name;
    }
    void display(){
        System.out.println("Name is :"+name);
    }
}
public class copydata{
    public static void main(String args[]){
        System.out.println("first obj data:");
        copy c=new copy("Vaibhavi");
        c.display();
        System.out.println("second obj data:");
        copy c2=new copy(c);
        c.display();
    }
}