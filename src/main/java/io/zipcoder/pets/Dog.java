package io.zipcoder.pets;

public class Dog extends Pets {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public String speak(){
        return "Bark! Bark!! Bark!";
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
