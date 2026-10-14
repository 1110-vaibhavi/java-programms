import java.util.Scanner;
interface Integer{
    public void check();
}
public class posorneg implements Integer{
    int n;
    posorneg(int num){
        n=num;
    }
    public void check(){
        if(n>0){
            System.out.println("the number is positive");
        }
        else{
            System.out.println("the number is negetive");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        posorneg n= new posorneg(num);
        n.check();
    }
}