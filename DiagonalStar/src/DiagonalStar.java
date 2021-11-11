public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0, countStart = 0, countEnd = (number - 1); row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if ((row == 0) ||
                            (row == (number - 1)) ||
                            (column == 0) ||
                            (column == (number - 1)) ||
                            (row == column) ||
                            (countEnd == column)) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                countEnd--;
                System.out.println();
            }
        }
    }
}
