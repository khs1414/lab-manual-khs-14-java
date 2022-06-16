import java.util.Scanner;

public class prac3_1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int len = inp.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements ");
        for(int i = 0;i<len;i++){
            arr[i] = inp.nextInt();
        }
        int max = arr[0];
        for(int m = 0;m<len;m++){
            if(arr[m]>max){
                max = arr[m];
            }
        }
        System.out.println("Max value was : "+max);
        int min = arr[0];
        for(int n = 0; n<len; n++){
            if(arr[n]<min){
                min = arr[n];
            }
        }
        System.out.println("Min value was : "+min);
        inp.close();
        
    }
    
}
