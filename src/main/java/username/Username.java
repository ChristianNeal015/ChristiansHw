package username;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your username");
            String userInput = scanner1.nextLine();
            if(userInput.equalsIgnoreCase("Bob") || (userInput.equalsIgnoreCase("Alice"))){
                System.out.println("Welcome " + userInput);
                break;
            }

        }
    }
}
