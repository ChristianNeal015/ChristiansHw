package doctor;

public class doctorTest {
    public static void main(String[] args) {
        FamilyDoctor doc1 = new FamilyDoctor("The Doc is here!", "I advise you too");
        Surgeon surg1 = new Surgeon("The surgeon says it will be fine", "hey Now");

        System.out.println(doc1);
        System.out.println(surg1.treatPatients());
    }
}
