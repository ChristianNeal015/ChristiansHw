package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class petsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pets> pets = new ArrayList<Pets>();

        int counter = 0;

        System.out.println("Hey how many pets you have ? ");
        int amount = scanner.nextInt();
        for (int x = 0; x < amount; x++) {
            System.out.println("What are they? ");
            String animalType = scanner.next();
            if (animalType.equals("dog")) {
                System.out.println("What's there name? ");
                String dogsName = scanner.next();
                Dog dog = new Dog(dogsName, "Bulldog");
                pets.add(dog);
            } else if (animalType.equals("cat")) {
                System.out.println("What's there name? ");
                String catsName = scanner.next();
                Cat cat = new Cat(catsName, "Brown and Black");
                pets.add(cat);
            } else if (animalType.equals("deer")) {
                System.out.println("What's there name? ");
                String deersName = scanner.next();
                Deer deer = new Deer(deersName, 4);
                pets.add(deer);
            }
        }
        for (Pets petss : pets) {
            System.out.println(petss.speak());
        }
    }
}
//        {
//
//            System.out.println("What's your ");
//            scanner.nextLine();
//            cat.speak();
//            scanner.nextLine();
//            deer.speak();
//            scanner.nextLine();
//            System.out.println("Huuuuuh interesting ");
//        }
//            System.out.println("Whats their name? " );
//            scanner.nextLine();
//
//        System.out.println("What's your favorite thing about them? ");
//        scanner.nextLine();
//        System.out.println("speak for me ");
//        dog.speak();
//        scanner.nextLine();
//        cat.speak();
//        scanner.nextLine();
//        deer.speak();
//        scanner.nextLine();
//        System.out.println("Huuuuuh interesting ");




