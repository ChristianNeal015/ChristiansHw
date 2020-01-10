package pc;

import static pc.Pc.*;

public class pcTest {
    public static void main(String[] args) {
        Cases cool = new Cases("H420", "Fuji", "240", new Dimensions(20, 25, 5));
        MotherBoard motha = new MotherBoard("BJ-300", "Pentium", 4, 6, "v2.44");
        Monitor acer = new Monitor();
        Dimensions crazy = new Dimensions(20, 25, 5);
        Pc hardWare = new Pc(cool, motha, acer);


        System.out.println("Welcome to worstBuy's PC section!!!!");
        System.out.println("Below is a description of our deal of the day!!!");
        hardWare.description();
        System.out.println(hardWare);
        hardWare.powerUp();

    }
}
