import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the ladder: ");
        int tiernumber = scanner.nextInt();

        if (tiernumber > 0) {
            for(int i = 1; i <= tiernumber; i++) {

                for(int j = 1; j <= tiernumber - i; j++) {
                    System.out.print("  ");

                }

                System.out.print("_|");
                System.out.println();
            }
        } else if (tiernumber < 0) {
            for(int i = tiernumber; i <= 1; i++) {
                for(int j = tiernumber; j < i; j++) {

                    System.out.print("  ");

                }
                System.out.print("|_");
                System.out.println();
            }
        } else if (tiernumber == 0) {

            System.out.println("__");

        }
    }
}