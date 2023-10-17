package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength <= 0) {
            System.out.println("Please provide a valid side length greater than 0.");
            return;
        }

        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                // Print '8' only for the border or corners
                if (i == 1 || i == sideLength || j == 1 || j == sideLength) {
                    System.out.print('8');
                } else {
                    // Print space for the interior
                    System.out.print(' ');
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}