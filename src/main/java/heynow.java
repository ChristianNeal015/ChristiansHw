public class heynow {
    public String squares(){
        String response = "";
        for (int x = 1; x < 11; x++){
            if (x < 10){
                response += x*x + "\n";
            }else{
                response += x*x;
            }
        }
        return response;
    }
}
