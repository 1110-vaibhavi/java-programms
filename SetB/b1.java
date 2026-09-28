import java.util.Scanner;
public class b1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of cities you want:");
        int n=sc.nextInt();
        String[] cities=new String[n];
        System.out.println("Enter Cities name:");
        for(int i=0;i<n;i++){
             cities[i]=sc.nextLine();
            
        }
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-1-i;j++){
                 if(cities[j].compareTo(cities[j+1])>0){
                    String temp=cities[j];
                    cities[j]=cities[j+1];
                    cities[j+1]=temp;
                 }
            }
           
        }
        System.out.println("\n Cities in ascending order:");
        for(String city:cities){
            System.out.println(city);
        }
    }
}