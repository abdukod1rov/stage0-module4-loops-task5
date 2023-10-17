package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
            System.out.println("Please provide a valid side length greater than 0.");
            return;
        }

        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                // Print '8' only for the main diagonal, secondary diagonal, and center row/column
                if (i == j || i + j == sideLength + 1 || i == sideLength / 2 + 1 || j == sideLength / 2 + 1) {
                    System.out.print('8');
                } else {
                    // Print space for other positions
                    System.out.print(' ');
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}