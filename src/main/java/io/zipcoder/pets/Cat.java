package io.zipcoder.pets;

public class Cat extends Pets {
    private String furPattern;

    public Cat(String name, String furPattern) {
        super(name);
        this.furPattern = furPattern;
    }
    @Override
    public String speak(){
        return "Meow Meow Meeeeeeeow!";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "furPattern='" + furPattern + '\'' +
                '}';
    }
}
