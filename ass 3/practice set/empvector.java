
import java.util.*;

public class empvector{
    public static void main(String args[]){
    int length=args.length;
    Vector<String> v= new Vector<String>(length);
    
        for(int i=0;i<length;i++){
            v.add(args[i]);
        }
         System.out.println("Employee Name:");
        System.out.println(v);
        System.out.println("Employee Names Starting with S:");
    for (int i=0;i<v.size();i++){
        if(v.get(i).toLowerCase().startsWith("s"))
        System.out.println(v.get(i));
    }
    }
  
}