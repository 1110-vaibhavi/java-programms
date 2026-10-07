public class countingobject{
    public static int count=0;
   countingobject(){
    count++;
    
   }
   void display(){
     System.out.println("the object cout is :"+count);
   }
    public static void main(String args[]){
        countingobject p=new countingobject();
        countingobject x=new countingobject();
        countingobject q=new countingobject();
       p.display();
    }
}