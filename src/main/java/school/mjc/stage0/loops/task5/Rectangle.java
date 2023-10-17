package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        if (length <= 0 || height <= 0) {
            System.out.println("Please provide valid length and height greater than 0.");
            return;
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= length; j++) {
                // Print '8' only for the border or corners
                if (i == 1 || i == height || j == 1 || j == length) {
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