import java.util.Scanner;

public class prac1_2 {
    public static void main(String[] args) {
        System.out.println("Enter number of minutes : ");
        Scanner inp = new Scanner(System.in);
        int min = inp.nextInt();
        System.out.println("Minutes " + min + " in YY-MM-DD format is :");
        int years = min / 525600;
        min = min - (years * 525600);
        int months = min / 43800;
        min = min - (min * 43800);
        int days = min / 1440;
        System.out.println(years + "-" + months + "-" + days);

    }

}
