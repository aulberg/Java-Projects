import javax.swing.JOptionPane;
public class SecretPhrase {
    public static void main(String[] args) {
    
    String secretPhrase = "G* T***";
    final String correctPhrase = "Go Team";
    String usersGuess; 
    boolean isDone = false; 
    
    JOptionPane.showMessageDialog(null, "The objective of the game is to uncover the secret phrase");
    JOptionPane.showMessageDialog(null, "Your secret phrase is (" + secretPhrase + ")");
    
    do {
        
        usersGuess = JOptionPane.showInputDialog("Enter a letter for (" + secretPhrase + ")");
        
        if((!usersGuess.equalsIgnoreCase("o")) && (!usersGuess.equalsIgnoreCase("e")) && (!usersGuess.equalsIgnoreCase("a")) && (!usersGuess.equalsIgnoreCase("m"))) {
            usersGuess = JOptionPane.showInputDialog("You entered a wrong letter! Please re-enter a letter for (" + secretPhrase + ")");
        }
        
        if(usersGuess.equalsIgnoreCase("o")) {
            JOptionPane.showMessageDialog(null, "You guess a correct letter!");
            char ch = 'o';
            int index = 1;
            secretPhrase = secretPhrase.substring(0, index) + ch + secretPhrase.substring(index + 1);
            JOptionPane.showMessageDialog(null, "The new phrase is " + secretPhrase);
        }
        
        if(usersGuess.equalsIgnoreCase("e")) {
            JOptionPane.showMessageDialog(null, "You guessed a correct letter!");
            char ch = 'e';
            int index = 4;
            secretPhrase = secretPhrase.substring(0, index) + ch + secretPhrase.substring(index + 1);
            JOptionPane.showMessageDialog(null, "The new phrase is " + secretPhrase);
        }
        
        if(usersGuess.equalsIgnoreCase("a")) {
            JOptionPane.showMessageDialog(null, "You guessed a correct letter!");
            char ch = 'a';
            int index = 5;
            secretPhrase = secretPhrase.substring(0, index) + ch + secretPhrase.substring(index + 1);
            JOptionPane.showMessageDialog(null, "The new phrase is " + secretPhrase);
        }
        
        if(usersGuess.equalsIgnoreCase("m")) {
            JOptionPane.showMessageDialog(null, "You guessed a correct letter!");
            char ch = 'm';
            int index = 6;
            secretPhrase = secretPhrase.substring(0, index) + ch + secretPhrase.substring(index + 1);
            JOptionPane.showMessageDialog(null, "The new phrase is " + secretPhrase);
        }
        
        if (secretPhrase.equals(correctPhrase)) {
            JOptionPane.showMessageDialog(null, "Congradulations! You guessed all of the correct letters!");
            isDone = true; 
        }
    } while(isDone == false);
    }
}