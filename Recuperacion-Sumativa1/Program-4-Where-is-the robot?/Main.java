public class Main {
    public static void main(String[] args) {
        int[] robotsteps = {10, 5, -2};
        int x = 0;
        int y = 0;
        int direction = 0;

        for (int steps : robotsteps) {

            switch (direction) {
                case 0:
                    y += steps;
                    break;
                case 1:
                    x -= steps;
                    break;
                case 2:
                    y -= steps;
                    break;
                case 3:
                    x += steps;
                    break;
            }
            direction = (direction + 1) % 4;
        }

        System.out.println("final coordinates: (x: " + x + ", y: " + y + ")");

    }
}