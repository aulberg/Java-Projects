import java.util.Scanner; 
import java.util.Random; 
public class SecretPhrase {
    public static void main(String[] args) {
    
    String phrase[] = {"blue in the face", "ignorance is bliss", 
        "my archilles heel", "hold your horses", "the worlds my oyster", 
        "point of no return", "shiver me timbers", "tell it to the judge", 
        "dont beat a dead horse", "no man is an island"};
    boolean isFinished = false;
    
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    
    //users phrase withoout astericks 
    int index = random.nextInt(phrase.length);
    String userPhrase = phrase[index];
    System.out.println(userPhrase);
    
    //usersphrase with astericks
    String userSecretPhrase = userPhrase.replaceAll("[a-zA-Z]", "*");
    
    //turns the users phrase into a char array
    char[] textArray = userPhrase.toCharArray(); 
    
    //used to compare the letters the user enters to what is in the textArray
    char[] answers = new char[textArray.length];
    for(int i = 0; i < textArray.length; ++i) {
        answers[i] = '?';
    }
    
    
    while(isFinished = false) {
        String letter = input.next();
        
        while(letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
            System.out.println("Invalid Input: Re-enter letter");
            letter = input.next();
        }
        
        boolean found = false; 
        for(int i = 0; i < textArray.length; ++i) {
            if(letter.charAt(0) == textArray[i]) {
                answers[i] = textArray[i];
                found = true; 
            }
        }
        
        if(!found) {
            System.out.println("Wrong letter");
        }
        
    }
}
}