package animalnames;

import animal.Animal;

public class Animals {
    private String name;
    private String furType;

    public Animals(String name){
        this.name = name;

    }
    public void makeNoise(){
        System.out.println("I'm making that noise");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
}
