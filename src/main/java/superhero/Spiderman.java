package superhero;

public class Spiderman extends Superhero {
    public Spiderman(String wearsTights) {
        super(wearsTights);
    }
    @Override
    public String[] listOfSuperPowers() {
        String[] powers = {"Web Shot", "Web Swing", "SpiderBots"};
        return powers;
    }
}
