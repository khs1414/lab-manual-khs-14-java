import java.util.Scanner;
public class prac2_2 {
    public static void main(String[] args) {
        System.out.println("Enter a single character : ");
        Scanner inp = new Scanner(System.in);
        String c = inp.nextLine();
        c = c.toLowerCase();
        char char_c = c.charAt(0);
        int ord = (int) char_c;
        if(true){
            if(c.length()>1){
                System.out.println("Not a single character");
            }
            if(c.length() == 1){
                if((ord<65 && ord>90) || (ord<97 || ord>122)){
                    System.out.println("Enter b/w a-z");
                }
            else{
                
                boolean uppercase = c.charAt(0) >= 65 && c.charAt(0) <= 90;
                boolean lowercase = c.charAt(0) >= 97 && c.charAt(0) <= 122;
                boolean vowels = c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u");
                if(vowels){
                    System.out.println("Vowel");
                }
                else{
                    System.out.println("Consonant");
                }
            }
            }

        }
    }
    
}
