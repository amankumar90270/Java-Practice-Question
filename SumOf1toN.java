import java.util.Scanner;

public class SumOf1toN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of n ");
        int n = sc.nextInt();

        int sum =0;
        for (int count=1; count<=n; count++){
            sum= sum+ count;
        }
            System.out.println("The Sum of Numbers from 1 to : \n" + n + " is " + sum );

    }
}
