public class fibonic{
      public static void fibo(int n){
        int a=0;
            int b=1;
            System.out.println("the fibonic series is:");
            while(n>0){
             System.out.print(a+"\t");
             int temp=a+b;
            a=b;
            b=temp;
            n--;

            }
        }
    public static void main(String []args){
     
        int n=10;
            fibo(n);
    }
}