abstract class Shape{
    abstract void area();
}
class Rectangle extends Shape{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    void area(){
        float area=length*width;
        System.out.println("The area of Rectangle : "+area);
    }
}
class Triangle extends Shape{
    int base;
    int height;
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    void area(){
        double area=0.5*base*height;
        System.out.println("The area of Triangle : "+area);
    }
}
public class recttriarea{
public static void main(String args[]){
    Rectangle r=new Rectangle(6,8);
    Triangle t=new Triangle(4,8);
    r.area();
    t.area();
}
}