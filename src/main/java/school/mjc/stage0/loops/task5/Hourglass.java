package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0 || height % 2 == 0) {
            System.out.println("Please provide a valid odd height greater than 0.");
            return;
        }

        int width = 2 * height - 1;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                // Print '8' only for positions within the hourglass pattern
                if (j >= i && j <= width - i + 1) {
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