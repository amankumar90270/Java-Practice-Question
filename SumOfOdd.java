import java.util.Scanner;

public class SumOfOdd {
    public static void  main(String[]args){
        Scanner sc  = new Scanner(System.in);

        int sum =0;
        int n=10;
        int i;
        System.out.print("Odd number are: ");
        for ( i =1; i<=n; i++){
            if (i%2 !=0){
                sum +=i;
            System.out.print(i + " ");
            }
        }
        System.out.println("\nSum of Odd Numbers  are " + sum );

    }
}
