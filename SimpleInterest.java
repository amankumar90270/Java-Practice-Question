import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal ");
        int principal = sc.nextInt();

        System.out.println("Enter the Rate ");
        int rate = sc.nextInt();

        System.out.println("Enter the Time  ");
        int time = sc.nextInt();


        int Interest = principal*rate*time;

        System.out.println("Interest of Principal " + principal+ ",rate " + rate + " and time " + time + " is : " + Interest);
    }
}
