package person;

import java.util.Scanner;

public class personTest {
    public static void main(String[] args) {
        Scanner product = new Scanner(System.in);
        int[] vars = new int[3];

        for(int i = 0; i < vars.length; i++) {
            System.out.println("Your items please: ");
            vars[i] = product.nextInt();
        }
        System.out.println(vars[0] + vars[1] + vars[2]);
//        int milkPrice = Grocerices.nextInt();
//        int breadPrice = Grocerices.nextInt();
//        int eggsPrice = Grocerices.nextInt();
//
//        System.out.println("Your milk = " + milkPrice);
//        System.out.println("Your bread = " + breadPrice);
//        System.out.println("Your eggs = " + eggsPrice);
//
//        System.out.println("Your total is = " + milkPrice + breadPrice + eggsPrice);


//        Scanner scanner = new Scanner(System.in);
//        Scanner number = new Scanner(System.in);
//        System.out.println("Welcome, what's your name?");
//        String shortyName = scanner.nextLine();
//        System.out.println("You should let me get ya number fr?");
//        String shortyNumber = number.nextLine();
//
//        System.out.println("Nice to meet ya " + shortyName);
//        System.out.println("Yo you should let me get your number fr? " + shortyNumber);

//        Person person1 = new Person("christian", 40);
//        person1.getName();
    }
}
