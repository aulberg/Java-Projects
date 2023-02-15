//same as twodice3 right now
import java.util.Scanner;
public class FiveDice2 {
   public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("You get three tries to roll your guessed number");
        System.out.println("Choose a number between 2 and 12");
        int usersNumber = input.nextInt();
        int counter = 0;
        int value1; 
        int value2; 
        boolean isDone = false; 
        String msg; 
        System.out.println();
       
        if(usersNumber < 2 && usersNumber > 12) {
             System.out.println("Please enter a valid number");
             usersNumber = input.nextInt();
             System.out.println();
        }

        while (!isDone) {
            
                Dice dice1 = new Dice();
                Dice dice2 = new Dice();
                value1 = dice1.getFaceValue();
                value2 = dice2.getFaceValue();
                int diceTotal = value1 + value2; 
                counter++;
                msg = "Roll " + counter + ": " + value1 + " and " + value2 + "\nTotal: " + diceTotal;
                System.out.println(msg);
                System.out.println();
                
               
                if((usersNumber != diceTotal) && (counter >= 3)) {
                System.out.println("You did not roll your number!");
                System.out.println("The computer wins.");
                isDone = true; 
                }

                if((usersNumber == diceTotal) && (counter <= 3)) {
                System.out.println("You rolled your number");
                System.out.println("You win!");
                isDone = true;
                } 
                
            } 
    }
}