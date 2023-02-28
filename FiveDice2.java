public class FiveDice2 {
   public static void main(String[] args) {
       
       
        System.out.println("The computer will roll 5 dice");
        System.out.println("You will role 5 dice");
        System.out.println("Whoever has the higher hierarchy wins : Five of a kind, four of a kind, three of kind, or pair ");
        
        int counter = 0; 
        boolean isDone = false; 
        String msg; 
        System.out.println();

        while (!isDone) {
            
                Dice computerDice = new Dice();
                Dice userDice = new Dice();
                
                int userValue1 = userDice.getFaceValue();
                int userValue2 = userDice.getFaceValue();
                int userValue3 = userDice.getFaceValue();
                int userValue4 = userDice.getFaceValue();
                int userValue5 = userDice.getFaceValue();
                
                int computerValue1 = computerDice.getFaceValue();
                int computerValue2 = computerDice.getFaceValue();
                int computerValue3 = computerDice.getFaceValue();
                int computerValue4 = computerDice.getFaceValue();
                int computerValue5 = computerDice.getFaceValue();        
        } 
    }
}