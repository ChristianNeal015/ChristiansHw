package doctor;

public class FamilyDoctor extends Doctor {
    private String makeHouseCall;


    public FamilyDoctor(String worksAtHospital, String makeHouseCall) {
        super(worksAtHospital);
        this.makeHouseCall = makeHouseCall;
    }
    public void giveAdvice(){
        System.out.println("I think the best thing to do is?");
    }
}
