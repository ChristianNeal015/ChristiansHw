package superhero;

public class superHeroTest {
    public static void main(String[] args) {
    Spiderman spiderman1 = new Spiderman("red");
    Thor thor = new Thor("Grey");

    String[] getThePowers = spiderman1.listOfSuperPowers();
        for(int x = 0; x < getThePowers.length; x++){
            System.out.println(getThePowers[x]);
        }
        getThePowers = thor.listOfSuperPowers();
        for(int y = 0; y < getThePowers.length; y++){
            System.out.println(getThePowers[y]);
        }
    }
}
