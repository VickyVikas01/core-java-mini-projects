import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        
        int userNumber = 0;

        do {
            System.out.println("Guess the number between 0-100 :");
            userNumber = sc.nextInt();

            if(myNumber == userNumber){
            System.out.println("Super You Guess the Coreect Number");
            break;
            }
            else if (myNumber > userNumber){
                System.out.println("Your number is smaller than mine");
                }
            else {
                System.out.println("Your number is bigger than mine");
            }
            
        } while (userNumber >= 0 && userNumber <= 100);
        System.out.println("You Should not guess >100 and <0.So my number is " + myNumber);
    }
}
