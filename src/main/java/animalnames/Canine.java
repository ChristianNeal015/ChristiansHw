package animalnames;

public abstract class Canine extends Animals {
    private String breedType;

    public Canine(String name, String breedType) {
        super(name);
        this.breedType = breedType;
    }

    @Override
    public abstract void makeNoise();

    @Override
    public String toString() {
        return "Canine{" +
                "breedType='" + breedType + '\'' +
                '}';
    }
}
