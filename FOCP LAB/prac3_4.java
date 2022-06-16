import java.util.Scanner;


public class prac3_4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int range = inp.nextInt();
        int[] arr = new int[range];
        System.out.println("Enter the elements ");
        for(int i = 0;i<range;i++){
            arr[i] = inp.nextInt();
        }
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 to calculate the sum of all elements ");
            System.out.println("Enter 2 to calculate the alternative sum of the elements ");
            System.out.println("Enter anything else to exit");
            int input = inp.nextInt();
            if(input==1){
                sum(arr);
            }
            else if(input==2){
                alt_sum(arr);
            }
            else{
                flag = false;
            }
        }
    }
    public static void sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum is : "+ sum);
    }
    public static void alt_sum(int[] arr){
        int sum = 0;
        for(int j = 0; j<arr.length;j++){
            if(j%2==0){
                sum = sum + arr[j];
            }
        }
        System.out.println("The alternative sum is : "+ sum);
    } 
}
