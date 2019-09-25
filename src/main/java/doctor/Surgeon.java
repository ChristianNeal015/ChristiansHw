package doctor;

public class Surgeon extends Doctor {
    private String makeHouseCalls;

    public Surgeon(String worksAtHospital, String makeHouseCalls) {
        super(worksAtHospital);
        this.makeHouseCalls = makeHouseCalls;
    }
    public String makeIncisions(){
        String pokin="that's a cut";
        return pokin;
    }
    @Override
    public String treatPatients(){
       return "Surgery almost done";
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "makeHouseCalls='" + makeHouseCalls + '\'' +
                '}';
    }
}
