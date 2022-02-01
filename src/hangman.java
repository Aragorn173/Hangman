import javax.swing.*;

public class hangman {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Word?");
        String underscore = "";
        String guess = "";
        char letterguess = 0;
        String wordguess = "";
        int lives = 3;
        int correct = 0;
        char[] letters = new char[word.length()];
        //skapar variablerna som kommer behövas


        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
            if (letters[i] == ' ') {
                underscore += " ";

            } else if (letters[i] == '-') {
                underscore += "-";

            } else {
                underscore += "_";
            }
            //Tittar på längden av ordet och printar ut ett understreck för varje bokstav


        }
        char[] underscorelist = new char[underscore.length()];
        for (int e = 0; e < underscore.length(); e++) {
            underscorelist[e] = underscore.charAt(e);
        }
        //Skapar en lista för understrecken så varje understreck kan jämföras enskilt


        while (lives > 0) {
            System.out.println(underscorelist);
            guess = JOptionPane.showInputDialog("Guess?");
            if (guess.length() > 1) {
                wordguess = guess;
                //Tittar om gissningen är en bokstav eller ord-gissning


                if (wordguess.equals(word)) {
                    System.out.println("Congrats you win!\n" + "The word was " + word);
                    System.exit(0);
                } else {
                    System.out.println("You lose!\n" + "The word was " + word + "\nYou guessed" + wordguess);
                    System.exit(0);
                }
                //Tittar om spelaren har liv kvar och om spelaren har vunnit eller förlorat, sedan avslutar programmet


            } else {
                letterguess = guess.charAt(0);
                for (int x = 0; x < word.length(); x++) {
                    if (letterguess == letters[x]) {
                        underscorelist[x] = letterguess;
                        correct = 1;
                    } else {
                    }
                }
                //Tittar om bokstaven finns med i ordet och byter ut rätt understreck vid korrekt gissning

                if (correct == 0) {
                    lives = lives - 1;
                    System.out.println("The letter you guessed was incorrect\n" + "you have " + lives + " lives remaining");
                } else {
                    correct = 0;
                }
                //Tittar om gissningen är fel och tar bort ett liv vid inkorrekt gissning
            }
        }
    }
}