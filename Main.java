import java.util.Scanner;

class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Player1 = 0;
        int Player2 = 0;

        System.out.println("Enter 'r' for rock, 'p' for paper or 's' for scissors.");
        System.out.println("Enter 'end' to finish the game");

        while (true) {
            System.out.print("Player 1: ");
            String play1 = scanner.nextLine();

            if (play1.equals("end")) {
                break;
            }

            System.out.print("Player 2: ");
            String play2 = scanner.nextLine();

            if (play2.equals("end")) {
                break;
            }

            if (play1.equals(play2)) {
                System.out.println("tie!");
            } else if ((play1.equals("r") && play2.equals("s")) ||
                    (play1.equals("p") && play2.equals("r")) ||
                    (play1.equals("s") && play2.equals("p"))) {
                System.out.println("Player 1 won!");
                Player1++;
            } else {
                System.out.println("Player 2 won!");
                Player2++;
            }
        }

        System.out.println("Player 1 won " + Player1 + " items.");
        System.out.println("Player 2 won " + Player2 + " items.");

        if (Player1 > Player2) {
            System.out.println("¡Player 1 won the game!");
        } else if (Player1 < Player2) {
            System.out.println("¡Player 2 won the game!");
        } else {
            System.out.println("¡player 1 and player 2 tied!");
        }

        scanner.close();
    }
}


