import java.util.*;
abstract class Shape{

    int a , b;

    Shape(int a , int b){
        this.a = a ;
        this.b = b;
    }
    abstract void PrintArea();
}

class Rectangle extends Shape{
    Rectangle (int length , int width){
        super(length, width);
    }
    void  PrintArea(){
        System.out.println("Area of Rectangle: "+ (a*b));

    }
}

class Triangle extends Shape{
    Triangle (int base , int height){
        super(base , height);
    }
    void PrintArea(){
        System.out.println("Area of triangle:"+(0.5*a*b));
    }
}

class Circle extends Shape{
    Circle (int radius ){
        super(radius , 0);
    }
    void PrintArea(){
        System.out.println("Area of Circle: "+(Math.PI*a*a));
    }
}



public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        int width = sc.nextInt();
        Shape r = new Rectangle(length, width);
        r.PrintArea();
        System.out.println();


        System.out.print("Enter base of triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = sc.nextInt();
        Shape t = new Triangle(base, height);
        t.PrintArea();
        System.out.println();

        
        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        Shape c = new Circle(radius);
        c.PrintArea();

        sc.close();
    }
}
