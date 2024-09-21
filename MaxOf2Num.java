import java.util.Scanner;

public class MaxOf2Num {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println( num1 + " is maximum");
        }else {
            System.out.printf( num2 + " is maximum");
        }
    }
}
