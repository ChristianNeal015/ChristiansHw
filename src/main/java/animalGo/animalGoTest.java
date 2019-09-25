package animalGo;

public class animalGoTest {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey("fruits");
        Tiger tiger1 = new Tiger("meats");

        System.out.println(tiger1.eats());
        System.out.println(monkey1.eats());

    }
}
