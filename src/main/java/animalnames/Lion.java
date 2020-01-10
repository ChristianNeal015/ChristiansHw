package animalnames;

public class Lion extends Feline {
    public Lion(String name, String breedType) {
        super(name, breedType);
    }

    @Override
    public void makeNoise() {
        System.out.println("Roaaaar");
    }
}
