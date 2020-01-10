package person;

public class Person {
    private String name;
    private double age;

    public String getName(){
        return name;
    }
//    public void setName(){
//        this.name = name;
//    }
    public void printName(String name){
        System.out.println(name);
    }
    public Person(String name, double age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
