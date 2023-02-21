package Arrays;
import java.util.Scanner;

public class hangman {
    private static final int MAX_GUESSES = 10;
    private String secretWord;
    private boolean[] guessedLetters;

    public static void main(String[] args) {
    	hangman game = new hangman();
        game.play();
    }

    public void play() {
        secretWord = chooseWord();
        guessedLetters = new boolean[secretWord.length()];
        int remainingGuesses = MAX_GUESSES;

        while (remainingGuesses > 0) {
            System.out.println(getCurrentState());
            char guess = getGuess();
            if (alreadyGuessed(guess)) {
                System.out.println("Dummkopf, du hast dieses Zeichen bereits geraten!");
            } else if (guessInWord(guess)) {
                System.out.println("Richtig geraten!");
                if (wordGuessed()) {
                    System.out.println("Herzlichen Glückwunsch, du hast das Wort erraten!");
                    return;
                }
            } else {
                System.out.println("Pech gehabt!");
                remainingGuesses--;
            }
        }

        System.out.println("Leider verloren! Das gesuchte Wort war: " + secretWord);
    }

    private String getCurrentState() {
        StringBuilder state = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            if (guessedLetters[i]) {
                state.append(secretWord.charAt(i));
            } else {
                state.append("_");
            }
            state.append(" ");
        }
        return state.toString();
    }

    private char getGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib einen Buchstaben ein: ");
        return scanner.next().charAt(0);
    }

    private boolean alreadyGuessed(char guess) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess && guessedLetters[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean guessInWord(char guess) {
        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                found = true;
                guessedLetters[i] = true;
            }
        }
        return found;
    }

    private boolean wordGuessed() {
        for (int i = 0; i < secretWord.length(); i++) {
            if (!guessedLetters[i]) {
                return false;
            }
        }
        return true;
    }

    private static String chooseWord() {
        String[] words = {"Apfel", "Banane", "Cherry", "Dattel", "Erdbeere", "Feige", "Grapefruit", "Himbeere", "Igel", "Johannisbeere", "Kirsche", "Limette", "Mango", "Nektarine", "Orange", "Papaya", "Quitte", "Rhabarber", "Stachelbeere", "Tomate", "Umbrella", "Veilchen", "Walnuss", "Xylit", "Ysop", "Zitrone"};
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }
}
