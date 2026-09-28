public class c5{
    public static void main(String args[]){
        String str="JAVA PROGRAMMING LANGUAGE";
        int len=str.length();
        String alternate="";
        for(int i=0;i<len;i++){
            if(i%2 != 0){
               alternate= alternate + str.charAt(i);
            }
           
        }
         System.out.println(alternate);
    }
}