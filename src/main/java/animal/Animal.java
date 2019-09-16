package animal;

public class Animal {
    public int eyes;


    public Animal(int eyes) {
        this.eyes = eyes;
    }
    public void makeNoise(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "eyes='" + eyes + '\'' +
                '}';
    }
}
