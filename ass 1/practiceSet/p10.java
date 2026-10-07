import java.io.*;
public class p10{
    public static void main(String args[]){
        int arr[]={1,2,8,6,5,10,7,9};
         int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               sum=sum+arr[i];
            }
        }
        System.out.println("The Sum of Even no. in array is : "+sum);
    }

}