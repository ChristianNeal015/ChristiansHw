package animalnames;

public abstract class Feline extends Animals {
    private String breedType;

    public Feline(String name, String breedType) {
        super(name);
        this.breedType = breedType;
    }

    @Override
    public abstract void makeNoise();


    @Override
    public String toString() {
        return "Feline{" +
                "breedType='" + breedType + '\'' +
                '}';
    }
}
