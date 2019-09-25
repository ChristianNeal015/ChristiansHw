package animalGo;

public class Tiger extends AnimalGo {
    public Tiger(String typesOfFood) {
        super(typesOfFood);
    }
    @Override
    public String eats(){
        return "Heavy meats";
    }
}
