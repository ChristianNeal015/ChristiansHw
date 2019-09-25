package superhero;

public class Thor extends Superhero {
    public Thor(String wearsTights) {
        super(wearsTights);
    }
    @Override
    public String[] listOfSuperPowers() {
        String[] powers = {"Thunder", "Lightning", "Thor's Hammer"};
        return powers;
    }
}
