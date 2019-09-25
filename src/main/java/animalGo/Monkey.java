package animalGo;

public class Monkey extends AnimalGo {
    public Monkey(String typesOfFood) {
        super(typesOfFood);
    }
    @Override
    public String eats(){
        return "Bananas";
    }
}
