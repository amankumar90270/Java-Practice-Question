import javax.security.sasl.SaslClient;
import java.util.*;
public class TransposeMatrix {
    public static void main(String[]args){
        int rows,columns;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        System.out.println("Enter number of columns");
        columns = sc.nextInt();

        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];
        int transpose[][] = new int[rows][columns];

        System.out.println("Enter Elements of Matrix 1");
        for (int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matrix2[i][j] = matrix1[j][i];
            }
        }

        System.out.println("Transpose of Matrix: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.printf(matrix2[i][j] + " ");
            }
            System.out.println( );
        }


    }

}
