import java.util.Scanner;

public class exchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much money do you want to change : ");
        int USD = scanner.nextInt();
        System.out.print("Your money before change : " + USD + " $\n");
        int VND = USD * 23000;
        System.out.print("Your money after change : " + VND + " VND");
    }
}
