package animalnames;

public class Dog extends Canine {
    public Dog(String name, String breedType) {
        super(name, breedType);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
