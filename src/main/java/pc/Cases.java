package pc;

public class Cases extends Pc {
    private String model;
    private String manufacturer;
    private String powerSupply;
    Dimensions dimensions;

    public Cases(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }


    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    @Override
    public String toString() {
        return "Cases{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}

