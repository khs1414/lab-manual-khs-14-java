import java.util.Scanner;
public class prac4_4 {
    public static void main(String[] args) {
        System.out.println("Enter real part of complex numbers of 2 numbers :");
        Scanner inp = new Scanner(System.in);
        int real_part_1 = inp.nextInt();
        int complex_part_1 = inp.nextInt();
        int real_part_1 = inp.nextInt();
        int complex_part_2 = inp.nextInt();
        Complex case1 = new Complex(real_part_1,complex_part_1,real_part_2, complex_part_2);
    }


class Complex{
    int real_part_1;
    int complex_part_1;
    int complex_part_2;
    int real_part_2;

    void complex_add(){
        int complex_real_add = this.complex_part_1 + this.complex_part_2;
        int complex_complex_add = this.complex_part_1 + this.complex_part_2;
        System.out.println("The addition of complex numbers is "+ complex_real_add + " "+ complex_complex_add + "i");
    }
    void complex_sub(){
        int complex_real_sub = this.complex_part_1 - this.complex_part_2;
        int complex_complex_sub = this.complex_part_1 - this.complex_part_2;
        System.out.println("The subtraction of complex numbers is "+ complex_real_sub + " "+ complex_complex_sub + "i");
    }
    void complex_mul(){
        int complex_real_mul = (this.real_part_1*this.real_part_2) - (this.complex_part_1*this.complex_part_2);
        int complex_complex_mul = (this.complex_part_2*this.real_part_1) + (this.complex_part_1*this.real_part_2);
        System.out.println("The subtraction of complex numbers is "+ complex_real_mul + " "+ complex_complex_mul + "i");
    }
    

    Complex(int real_part_1,int complex_part_1, int real_part_2,int complex_part_2){
        this.complex_part_1 = complex_part_1;
        this.complex_part_2 = complex_part_2;
        this.real_part_1 = real_part_1;
        this.real_part_2 = real_part_2;
    }
    
}
    
}
