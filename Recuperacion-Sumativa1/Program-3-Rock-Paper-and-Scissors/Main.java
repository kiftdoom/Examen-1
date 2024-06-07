import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Player1 = 0;
        int Player2 = 0;

        System.out.println("Enter 'r' for rock, 'p' for paper or 's' for scissors.");
        System.out.println("Enter 'end' to finish the game");

        while (true) {
            System.out.print("Player 1: ");
            String playeropcion1 = scanner.nextLine();

            if (playeropcion1.equals("end")) {
                break;
            }

            System.out.print("Player 2: ");
            String playeropcion2 = scanner.nextLine();

            if (playeropcion2.equals("end")) {
                break;
            }

            if (playeropcion1.equals(playeropcion2)) {
                System.out.println("tie!");
            } else if ((playeropcion1.equals("r") && playeropcion2.equals("s")) ||
                    (playeropcion1.equals("p") && playeropcion2.equals("r")) ||
                    (playeropcion1.equals("s") && playeropcion2.equals("p"))) {
                System.out.println("Player 1 won!");
                Player1++;
            } else {
                System.out.println("Player 2 won!");
                Player2++;
            }
        }

        System.out.println("Player 1 won " + Player1 + " times.");
        System.out.println("Player 2 won " + Player2 + " times.");

        if (Player1 > Player2) {
            System.out.println("¡Player 1 won the game!");
        } else if (Player1 < Player2) {
            System.out.println("¡Player 2 won the game!");
        } else {
            System.out.println("¡player 1 and player 2 tied!");
        }

    }
}