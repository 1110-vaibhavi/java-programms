public class area{
    public static double Area(int r){
        return 3.14*r*r;
    }
    public static double Area(int l, float w){
        return l*w;
    }
    public static double Area(int b,int h){
        return 0.5*b*h;
    }
    public static void main(String []args){
        System.out.println("area of circle:"+Area(4));
        System.out.println("area of rectangle:"+Area(6,5.0f));
        System.out.println("area of triangle:"+Area(4,6));
    }
}