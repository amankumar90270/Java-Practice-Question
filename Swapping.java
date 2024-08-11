import java.util.Scanner;
public class Swapping {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int firstnumber,secondnumber,c;

        System.out.println("Enter First Number");
        firstnumber =sc.nextInt();

        System.out.println("Enter Second Number");
        secondnumber=sc.nextInt();

        System.out.println("Number before Swapping is: " + firstnumber + " and " + secondnumber);

        firstnumber = firstnumber+secondnumber;
        secondnumber = firstnumber-secondnumber;
        firstnumber= firstnumber-secondnumber;

        System.out.println("Number After Swapping is: " + firstnumber + " and " + secondnumber);

    }
}
