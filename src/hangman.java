import javax.swing.*;

public class hangman {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Word?");
        String underscore = "";
        char letterguess = 0;
        String wordguess = "";
        char[] letters = new char[word.length()];

        for(int i = 0;i < word.length(); i++) {
            letters[i] = word.charAt(i);
            if (letters[i] == ' ') {
                underscore += " ";

            } else if (letters[i] == '-') {
                underscore += " -";

            } else {
                underscore += " _";
            }
        }
        System.out.println(underscore);


        String guess = JOptionPane.showInputDialog("Guess?");
        if (guess.length()>1){
            wordguess = guess;

        } else {
            letterguess = guess.charAt(0);

        }

        if (wordguess.equals(word)) {
            System.out.println("Conrgrats you win!\n"+"The word was " + word);
        }

        for (int l = 0; l < word.length(); l++) {
            if (letterguess == letters[l]) {
                letters[l] = letterguess;


            } else {

            }
        }
    }
}
