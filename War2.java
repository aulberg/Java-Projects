import javax.swing.JOptionPane;
public class War2
{
    public static void main(String [] arg) {
       
    final int CARDS_IN_SUIT = 13;
   
    Card computerCard = new Card();
    Card yourCard = new Card();
 
    Random rand = new Random();
   
    int computerValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    int yourValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    String computerRank = "";
    String yourRank = "";
    String computerSuit = "";
    String yourSuit = "";
    String changeSuit = "";
   
    computerCard.setValue(computerValue, computerRank);
    yourCard.setValue(yourValue, yourRank);
   
    if(computerValue == 1) {
            computerRank = "ace";
     } else {
        if(computerValue == 2) {
            computerRank = "2";
        } else {
            if(computerValue == 3) {
                computerRank = "3";
            } else {
                if(computerValue == 4) {
                    computerRank = "4";
                } else {
                    if(computerValue == 5) {
                        computerRank = "5";
                    } else {
                        if(computerValue == 6) {
                            computerRank = "6";
                        } else {
                            if(computerValue == 7) {
                                computerRank = "7";
                            } else {
                                if(computerValue == 8) {
                                    computerRank = "8";
                                } else {
                                    if(computerValue == 9) {
                                        computerRank = "9";
                                    } else {
                                        if(computerValue == 10) {
                                            computerRank = "10";
                                        } else {
                                            if(computerValue == 11) {
                                                computerRank = "Jack";
                                            } else {
                                                if(computerValue == 12) {
                                                    computerRank = "Queen";
                                                } else {
                                                    if(computerValue == 13) {
                                                        computerRank = "King";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
     }
       
     
    if(yourValue == 1) {
            yourRank = "ace";
     } else {
        if(yourValue == 2) {
            yourRank = "2";
        } else {
            if(yourValue == 3) {
                yourRank = "3";
            } else {
                if(yourValue == 4) {
                    yourRank = "4";
                } else {
                    if(yourValue == 5) {
                        yourRank = "5";
                    } else {
                        if(yourValue == 6) {
                            yourRank = "6";
                        } else {
                            if(yourValue == 7) {
                                yourRank = "7";
                            } else {
                                if(yourValue == 8) {
                                    yourRank = "8";
                                } else {
                                    if(yourValue == 9) {
                                        yourRank = "9";
                                    } else {
                                        if(yourValue == 10) {
                                            yourRank = "10";
                                        } else {
                                            if(yourValue == 11) {
                                                yourRank = "Jack";
                                            } else {
                                                if(yourValue == 12) {
                                                    computerRank = "Queen";
                                                } else {
                                                    if(yourValue == 13) {
                                                        yourRank = "King";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
     }
     
   
    String chars = "hdsc";
    char computerChar = chars.charAt(rand.nextInt(chars.length()));
    char yourChar = chars.charAt(rand.nextInt(chars.length()));
    char changeChar = chars.charAt(rand.nextInt(chars.length()));

    if(computerChar == 'h') {
        computerSuit = "hearts";
    }  else {
        if(computerChar == 'd') {
            computerSuit = "diamonds";
        } else {
            if(computerChar == 's') {
                computerSuit = "diamonds";
            } else {
                if(computerChar == 'c') {
                    computerSuit = "clubs";
                }
            }
        }
    }
   
     if(yourChar == 'h') {
        computerSuit = "hearts";
    }  else {
        if(yourChar == 'd') {
            yourSuit = "diamonds";
        } else {
            if(yourChar == 's') {
                yourSuit = "diamonds";
            } else {
                if(yourChar == 'c') {
                    yourSuit = "clubs";
                }
            }
        }
    }
   
    if(changeChar == 'h') {
        computerSuit = "hearts";
    }  else {
        if(yourChar == 'd') {
            changeSuit = "diamonds";
        } else {
            if(changeChar == 's') {
                changeSuit = "diamonds";
            } else {
                if(changeChar == 'c') {
                    changeSuit = "clubs";
                }
            }
        }
    }
   
   
    JOptionPane.showMessageDialog(null, "The computers card is the " + computerRank + " of " + computerSuit); 
    JOptionPane.showMessageDialog(null, "Your card is the " + yourRank + " of " + yourSuit);
   
    if(computerValue == yourValue) {
        JOptionPane.showMessageDialog(null, "The cards values are equal");
    }
 
    if(computerValue > yourValue) {
        JOptionPane.showMessageDialog(null, "The computer has the higher card, the computer won");
    }
   
    if(computerValue < yourValue) {
       JOptionPane.showMessageDialog(null, "You have the higher card, you won!");
    }
   
    if((computerValue == yourValue) && (computerChar == yourChar)) {
        JOptionPane.showMessageDialog(null, "The two cards were exactly the same"
        + " The computers card is the " + computerRank + " of " + computerSuit
        + " Your card is the " + yourRank + " of " + changeSuit);
        System.out.println("The computers card is the " + computerRank + " of " + computerSuit);
        System.out.println("Your card is the " + yourRank + " of " + changeSuit);
       
    }
   
    }
}