import java.util.*;
import java.util.ArrayList;
public class arraylist{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList arr=new ArrayList();
                System.out.println("How many numbers you want to enter in arraylist:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
     
        }
 System.out.println("the arraylist is :"+arr);
    }
}