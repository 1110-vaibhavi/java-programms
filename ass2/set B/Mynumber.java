public class Mynumber{
    private int num;
    Mynumber(){
        this.num=0;
    }
    Mynumber(int n){
        this.num=n;
    }
    public boolean isPositive(){
        return this.num > 0;
    }
    public boolean isNegative(){
       return this.num<0;
    }
    public static void main(String args[]){
       int no=Integer.parseInt(args[0]);
        Mynumber num=new Mynumber(no);
        System.out.println("The value is : ");
         System.out.println("The number is negetive : "+num.isNegative());
            System.out.println("the number is positive : "+num.isPositive()); 

    }
        
}