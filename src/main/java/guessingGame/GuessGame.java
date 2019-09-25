package guessingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int guessingNum = (int) (Math.random() * 10);

        Scanner scanner2 = new Scanner(System.in);
        ArrayList <Integer> guessing = new ArrayList<Integer>();
        System.out.println("I'm thinking of a number between 0 and 9...");
        while(true){
            int userInput = scanner2.nextInt();

            if(userInput == (guessingNum)){
                System.out.println("You got it! It's " + guessingNum + "!");
                break;
            }else if(userInput > guessingNum){
                System.out.println("Too large");
            }else{
                System.out.println("Too short");

            }
            if(!guessing.contains(userInput)){
             guessing.add(userInput);
            }
        } System.out.println("You had " + guessing.size() + " wrong attempts");
    }
}
