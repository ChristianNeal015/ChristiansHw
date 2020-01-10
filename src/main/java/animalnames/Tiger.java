package animalnames;

public class Tiger extends Feline {

    public Tiger(String name, String breedType) {
        super(name, breedType);
    }

    @Override
    public void makeNoise() {
        System.out.println("Growwwwl");
    }

    @Override
    public String toString() {
        return "Tiger{}";
    }
}

