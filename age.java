import java.util.Scanner;

public class age {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You should get a Driving License");
        }else{
            System.out.printf(" Bde ho jao phle ");
        }
    }
}
