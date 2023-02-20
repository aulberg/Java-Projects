import java.util.Scanner;  
public class SecretPhrase {  
   
    private static String[] phrases = {"blue in the face", "ignorance is bliss",
        "my archilles heel", "hold your horses", "the worlds my oyster",
        "point of no return", "shiver me timbers", "tell it to the judge",
        "dont beat a dead horse", "no man is an island"};
private static String word = phrases[(int) (Math.random() * phrases.length)];
private static String secretPhrase = new String(new char[word.length()]).replace("\0", "*");
private static int counter = 0;

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

while (secretPhrase.contains("*")) {
System.out.println("Guess any letter in the phrase");
System.out.println(secretPhrase);
String playerGuess = input.next();
buildPhrase(playerGuess);
}
}

public static void buildPhrase(String playerGuess) {
String newPhrase = "";
for (int i = 0; i < word.length(); i++) {
if (word.charAt(i) == playerGuess.charAt(0)) {
newPhrase += playerGuess.charAt(0);
} else if (secretPhrase.charAt(i) != '*') {
newPhrase += word.charAt(i);
} else {
newPhrase += "*";
}
}

if (secretPhrase.equals(newPhrase)) {
counter++;
} else {
secretPhrase = newPhrase;
}
if (secretPhrase.equals(word)) {
System.out.println("You guessed the correct phrase!");
}
}
}
