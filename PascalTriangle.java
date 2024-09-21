public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        for (int i = 0; i < numRows; i++) {
            for (int k = 0; k < numRows - i - 1; k++) {
                System.out.printf(" ");
            }
            int number = 1;
            for (int j = 0; j <= 1; j++) {
                System.out.printf(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}