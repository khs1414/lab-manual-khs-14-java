import java.util.Scanner;
public class prac3_3 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        Scanner askval = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int a = askval.nextInt();
        int[] arr = new int[a];
        int[] oddarr = new int[a];
        int[] evenarr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter the element of the array: ");
            int b = askval.nextInt();
            arr[i] = b;
        }
        for (int j = 0; j < a; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        System.out.println("Size of array is " + arr.length);
        for (int k = 0; k < a; k++) {
            if (arr[k] % 2 == 0) {
                evenarr[even] = arr[k];
                System.out.println(evenarr[even]);
                even++;
            } else {
                oddarr[odd] = arr[k];
                odd++;
            }
        }
        System.out.println("For odd:");
        for (int x = 0; x <= odd - 1; x++) {
            System.out.print(oddarr[x] + " ");
        }
        System.out.println("Size of array is " + odd);
        System.out.println("For even");
        for (int y = 0; y < even; y++) {
            System.out.print(evenarr[y] + " ");
        }
        System.out.println("Size of array is " + even);
    }
}
