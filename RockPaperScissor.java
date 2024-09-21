import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose any Number from 1 to 3");
        System.out.println("1=Rock\n2=Paper\n3=Scissor");
        int userchoice = sc.nextInt();
        if (userchoice<1 || userchoice>3){
            System.out.println("Choose only Number from 1 to 3");
        }else {
            System.out.println("You choose " + userchoice);
            System.out.println("Wait for Computer choice.......");

            Random rand = new Random();
            int computerchoice = rand.nextInt(1, 4);
            System.out.println("Computer choose " + computerchoice);

            if (userchoice == computerchoice) {
                System.out.println("Match is tie");
            } else if (userchoice == 1 && computerchoice == 3 || userchoice == 2 && computerchoice == 1 || userchoice == 3 && computerchoice == 2) {
                System.out.println("You Won");
            } else {
                System.out.printf("Computer Won");
            }
        }
        }
    }

