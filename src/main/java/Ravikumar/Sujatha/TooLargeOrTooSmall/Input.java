package Ravikumar.Sujatha.TooLargeOrTooSmall;

import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class Input {

    Scanner input = new Scanner(System.in);

    public int getInput(){
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        return num;
    }

    public String getStringInput(){
        String value = input.nextLine();
        return value;
    }

}
