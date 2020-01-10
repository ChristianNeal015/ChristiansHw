package animalnames;

public class Wolf extends Canine {
    public Wolf(String name, String breedType) {
        super(name, breedType);
    }

    @Override
    public void makeNoise() {
        System.out.println("Howllll");
    }

    @Override
    public String toString() {
        return "Wolf{}";
    }
}
