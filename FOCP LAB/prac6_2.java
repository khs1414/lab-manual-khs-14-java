import java.util.Scanner;
interface GeometricObject{
    double getPerimeter();
    double getArea();
}

class Circle{
    double radius = 1.0;
    double r;
    double getPerimeter(){
        double parameter_circle = 2*3.14*this.radius;
        return parameter_circle; 
    }
    double getArea(){
        double area = 3.14*this.radius*this.radius;
        return area;
    }
    Circle(){
        this.radius = 1.0;
    }
    Circle(double r){
        this.radius = r;
    }
}

class ResizableCircle {
    double radius;
    double Re_getPerimeter(){
        double parameter_circle = 2*3.14*this.radius;
        return parameter_circle; 
    }
    double Re_getArea(){
        double area = 3.14*this.radius*this.radius;
        return area;
    }
    ResizableCircle(){
        System.out.println("Enter radius");
        Scanner inp = new Scanner(System.in);
        this.radius = inp.nextInt();
    }
}

public class prac6_2 {
    public static void main(String[] args) {
        Circle case1 = new Circle();
        System.out.println(case1.getArea());
        System.out.println(case1.getPerimeter()); 
    }
}
