package employee;

public class Personality {
    public String thinkType;
    public String favColor;

    public Personality(String thinkType, String favColor) {
        this.thinkType = thinkType;
        this.favColor = favColor;
    }

    @Override
    public String toString() {
        return "Personality{" +
                "thinkType='" + thinkType + '\'' +
                ", favColor='" + favColor + '\'' +
                '}';
    }
}
