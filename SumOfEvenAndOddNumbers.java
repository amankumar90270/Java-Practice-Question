import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a limit ");
        int n = sc.nextInt();

        int sumEven =0;
        int sumOdd = 0;

        System.out.println(" Enter " + n + " natural Numbers ");
        for (int i=0; i<=n;i++){
            int number= sc.nextInt();

            if (number % 2 == 0){
                sumEven += number;
            }else {
                sumOdd +=number;
            }
        }

        System.out.println(" Sum of Even Numbers; " + sumEven );
        System.out.println(" Sum of Odd Numbers: " + sumOdd);
    }
}
