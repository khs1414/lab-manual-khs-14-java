import java.util.Scanner;

public class prac3_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements ");
        for(int i = 0;i<10;i++){
            arr[i] = inp.nextInt();
        }
        int a = 0;
        System.out.println("Enter the item to be searched ");
        int x = inp.nextInt();
        
        for(int j = 0;j<10;j++){
            if(x==arr[j]){
                System.out.println("The element was at index "+j );
                a = 1;
            }
        }
        if(a==0){
            System.out.println("-1");
        }
        inp.close();
        
    }
    
}
