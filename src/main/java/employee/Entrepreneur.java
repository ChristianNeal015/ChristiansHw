package employee;

public class Entrepreneur extends Person {
    private double investment;
    private double revenue;

    public Entrepreneur(String name, double investment, double revenue) {
        super(name);
        this.investment = investment;
        this.revenue = revenue;
    }
    @Override
    public String toString(){

        return "Entrepreneur's name is : " + this.getName();
    }

    @Override
    public void printProfile() {
        System.out.println("I am an Entrepreneur");
    }

    public double calculateProfits(){
        return investment - revenue;
    }


}
