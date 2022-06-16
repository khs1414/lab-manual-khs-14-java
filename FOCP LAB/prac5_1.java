import java.util.Scanner;

public class prac5_1{
    public static void main(String[] args) {
        Shape case1 = new Shape();
        Circle case2 = new Circle();
        Rectangle case3 = new Rectangle();
        Square case4 = new Square();
        case1.display();
        case2.display();
        case3.display();
        case4.display();
        
    }
}

class Shape {
    void display(){
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape{
    @Override
    void display(){
        System.out.println("This is a Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void display(){
        System.out.println("This is a Rectangle");
    }
}

class Square extends Rectangle{
    @Override
    void display(){
        System.out.println("This is a Square");
    }
}