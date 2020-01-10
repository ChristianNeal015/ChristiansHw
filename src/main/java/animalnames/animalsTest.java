package animalnames;

public class animalsTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla("Silver", "Silverback Gorilla");
        Tiger tiger = new Tiger("Stripes", "Bangal Tiger");
        Animals[] animal = {gorilla, tiger};
        System.out.println(tiger);
        System.out.println(gorilla);
    }
    public static void getAnimalName(Animals[] animal){
        for (Animals a:animal) {
            System.out.println(a.getName());

        }
    }
}
