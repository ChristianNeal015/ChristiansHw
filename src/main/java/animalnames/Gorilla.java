package animalnames;

public class Gorilla extends Animals {
    private String breedType;

    public Gorilla(String name, String breedType) {
        super(name);
        this.breedType = breedType;

    }

    @Override
    public String toString() {
        return "Gorilla{" +
                "breedType='" + breedType + '\'' +
                '}';
    }
}
