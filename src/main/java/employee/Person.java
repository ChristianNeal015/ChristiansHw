package employee;

public abstract class Person {
    private String name;
    protected char sex;
    private String pronoun;

    public Person(String name) {
        this.name = name;
        this.pronoun = pronoun;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract void printProfile();

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
