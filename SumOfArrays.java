import java.util.*;
        public class SumOfArrays {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number of Rows");
                int rows = sc.nextInt();
                System.out.println("Enter Number of Columns");
                int cols = sc.nextInt();

                int matrix1[][] = new int[rows][cols];
                int matrix2[][] = new int[rows][cols];
                int sumMatrix[][] = new int[rows][cols];

                System.out.println("Enter elements of first Matrix: ");
               for(int i= 0; i<rows; i++){
                   for (int j=0; j<rows; j++){
                       matrix1[i][j] = sc.nextInt();
                   }
               }

                System.out.println("Enter elements of Second Matrix");
               for (int i=0; i<cols; i++){
                   for (int j=0; j<cols; j++){
                       matrix2[i][j] = sc.nextInt();
                   }
               }

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("Sum of Matrix 1 and Matrix 2");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.printf(sumMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }