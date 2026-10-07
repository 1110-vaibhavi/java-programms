 class car{
    String brand;
    String model;
    car(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    void display(){
        System.out.println("Brand="+brand+"\n"+"Model="+model);
    }
}
public class refvar{
    public static void main(String []args){
        System.out.println("first obj:");
        car c1=new car("bmw","M6");
        c1.display();
        System.out.println("first obj in second obj:");
        System.out.println("After refence variable used:");
        car c2 = c1;
        c2.display();
    }
}