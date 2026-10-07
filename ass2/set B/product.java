import java.util.Scanner;
public class product{
    int pid;
    String pname;
    float price;
    void acceptdetails(Scanner s){
        System.out.println("Enter Product ID:");
        pid=s.nextInt();
        s.nextLine(); //clears the buffer after nextInt
        System.out.println("Enter Product Name:");
        pname=s.nextLine();
        System.out.println("Enter Price:");
        price=s.nextFloat();
    }
    void dispalydetails(){
        System.out.println("_________Product Details____________")
        System.out.println("Product ID: "+pid);
        System.out.println("Product Name: "+pname);
        System.out.println("Product Price: "+price);
        System.out.println("__________________________________________")
    }
    public static void main(){
        Scanner s=new Scanner(System.in);
       product P[]=new product[3];
        for(int i=0;i<3;i++){
            P[i]=new product();
            P[i].acceptdetails(s);
        }
        for(int i=0;i<3;i++){
            P[i].dispalydetails();
        }
        s.close();
    }
}