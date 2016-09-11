package Ravikumar.Sujatha.TooLargeOrTooSmall;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class GuessingGame {

    public void guessNumber(){

        boolean win = false;
        int userGuess;
        Random random = new Random();
        Input input = new Input();
        Set<Integer> set = new HashSet<Integer>();
        int compGuess = random.nextInt(10);
        int noOfTries = 0;


        while (win == false){
            userGuess = input.getInput();
            set.add(userGuess);

            if (userGuess == compGuess){
                win = true;
            }
            else if (userGuess < compGuess){
                System.out.println("Your guess is too low");
            }
            else if (userGuess > compGuess){
                System.out.println("Your guess is too high");
            }
        }

        noOfTries = set.size();

        System.out.println("The computer's secret number was "+compGuess);
        System.out.println("It took you "+noOfTries+ " tries to find the number");
    }

}
