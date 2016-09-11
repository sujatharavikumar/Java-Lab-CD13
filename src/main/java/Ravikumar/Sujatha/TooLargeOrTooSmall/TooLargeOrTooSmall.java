package Ravikumar.Sujatha.TooLargeOrTooSmall;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class TooLargeOrTooSmall {

    public static void main(String args[]){

        GuessingGame guess = new GuessingGame();

        System.out.println("The computer has thought of  a secret number between 1 and 10.");
        System.out.println("You have to guess the number and remember it has to be between 1 and 10 : ");
        guess.guessNumber();

    }

}
