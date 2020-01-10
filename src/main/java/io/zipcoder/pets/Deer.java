package io.zipcoder.pets;

public class Deer extends Pets {
    private int hooveCount;

    public Deer(String name, int hooveCount) {
        super(name);
        this.hooveCount = hooveCount;
    }
    @Override
    public String speak(){
        return "eiiiiiiiiiggggghhhhhh";
    }

    @Override
    public String toString() {
        return "Deer{" +
                "hooveCount=" + hooveCount +
                '}';
    }
}
