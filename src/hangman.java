import javax.swing.*;
import java.sql.SQLOutput;

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

        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
            if (letters[i] == ' ') {
                underscore += " ";

            } else if (letters[i] == '-') {
                underscore += "-";

            } else {
                underscore += "_";
            }
        }
        char[] underscorelist = new char[underscore.length()];
        for (int e = 0; e < underscore.length(); e++) {
            underscorelist[e] = underscore.charAt(e);
        }
        while (lives > 0) {
            System.out.println(underscorelist);
            guess = JOptionPane.showInputDialog("Guess?");
            if (guess.length() > 1) {
                wordguess = guess;
                if (wordguess.equals(word)) {
                    System.out.println("Conrgrats you win!\n" + "The word was " + word);
                    System.exit(0);
                } else {
                    System.out.println("You lose!\n" + "The word was " + word + "\nYou guessed" + wordguess);
                    System.exit(0);
                }
            }











        /*


        for (int g = 0; g < 1000; g++) {
            String guess = JOptionPane.showInputDialog("Guess?");

            if (guess.length() > 1) {
                wordguess = guess;

            } else {
                letterguess = guess.charAt(0);
                if (guess.charAt(g) == letters[g]) {
                    System.out.println(guess.charAt(g));
                }
                }
            }

        if (wordguess.equals(word)) {
            System.out.println("Conrgrats you win!\n"+"The word was " + word);

        }

        for (int l = 0; l < word.length(); l++) {
            if (letterguess == letters[l]) {
                letters[l] = letterguess;


            } else {

            }*/
        }
    }
}
