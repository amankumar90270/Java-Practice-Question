import java.util.*;
public class Operators {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float num1,num2,sum,subtract,multiply,divide,modules;

        System.out.println("Enter num1");
        num1=sc.nextFloat();
        System.out.println("Enter num2");
        num2=sc.nextFloat();

        sum=num1+num2;
        subtract=num1-num2;
        multiply=num1*num2;
        divide=num1/num2;
        modules=num1%num2;

        System.out.println(" Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println(" Subtraction  of " + num1 + " and " + num2 + " is: " + subtract);
        System.out.println(" Multiplication  of " + num1 + " and " + num2 + " is: " + multiply);
        System.out.println(" Divide of " + num1 + " and " + num2 + " is: " + divide);
        System.out.println(" Modules of " + num1 + " and " + num2 + " is: " + modules);
    }
}
