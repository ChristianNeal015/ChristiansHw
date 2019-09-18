public class printGivenString {
        public static void main(String[] args) {
            System.out.println(printGivenStringTimesNumberGiven("Ha", 3));
        }
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String awnser = "";
        for (int i = 0; i < n; i++) {
            awnser += str;
        }
        return awnser;
    }
}
