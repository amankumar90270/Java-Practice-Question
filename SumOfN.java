import java.util.Scanner;

public class SumOfN {
    public static void main(String[]args){


        int n =3;
        int sum =0;
        for (int i = 1; i<=n; i++)
            sum += i;
        System.out.println("Sum of 1 to " + n + " is :" + sum  );
    }
}
