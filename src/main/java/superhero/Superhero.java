package superhero;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Superhero {
    private String wearsTights;

    public Superhero(String wearsTights){
        this.wearsTights = wearsTights;
    }
    public String[] listOfSuperPowers(){
        String[] powers = {"Energy Shot", "Plasma Rays", "Unlimited Strength"};
    return powers;
    }
}
