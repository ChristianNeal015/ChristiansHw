package doctor;

import javax.print.Doc;

public class Doctor {
    private String worksAtHospital;

    public Doctor(String worksAtHospital ){
       this.worksAtHospital = worksAtHospital;
    }
    public String treatPatients(){
        return  "Patients come here";
    }

}
