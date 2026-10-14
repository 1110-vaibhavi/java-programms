class circle{
int r;
circle(int r){
    this.r=r;
}
void area(){
    double area= 3.14*r*r;
    System.out.println("The area of circle is :"+area);
}
}
class cylinder extends circle{
    int h;
    cylinder(int h,int r){
         super(r);
        this.h=h;
    }
    void area(){
    double area=2*3.14*r*(r+h);
     System.out.println("The area of cylinder is :"+area);
    }
}
public class area{
    public static void main(String args[]){
        circle c=new circle(2);
        c.area();
        cylinder cy=new cylinder(10,2);
        cy.area();
    }
}