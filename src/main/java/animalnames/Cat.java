package animalnames;

public class Cat extends Feline{

    public Cat(String name, String breedType) {
        super(name, breedType);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
