
interface I1 {
    int a = 1;
    }
    
interface I2 {
    int b = 2;
    }
    
class C1 implements I1, I2 {
    int c = 3;
    }


public class prac6_1 {
    public static void main(String[] args) {
        C1 r1 = new C1();
        r1.display();
    }
    
}
