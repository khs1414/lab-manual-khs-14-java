abstract class Shape {
    public abstract void RectangleArea();
    public abstract void CircleArea();
    public abstract void SquareArea();
  }
class Area extends Shape {
      int l;
      int b;
      int r;
    public void RectangleArea() {
      System.out.println("The area is : " + (this.l*this.b));
    }
    public void SquareArea(){
        System.out.println("The area is : " + (this.r*this.r));
    }
    public void CircleArea(){
        System.out.println("The area is : " + (3.14*this.r*this.r));
    }
    Area(int l, int b){
        this.l = l;
        this.b = b;
    }
    Area(int r){
        this.r =r;
    }
    
  }
  class prac6_3 {
    public static void main(String[] args) {
      Area case1 = new Area(1,2);
      case1.RectangleArea();
      Area case2 = new Area(2);
      Area case3 = new Area(1);
      case3.CircleArea();
      case2.SquareArea();
    }
  }