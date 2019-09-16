import java.util.Scanner;

public class chris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        System.out.println("Enter");
            if (userInput.toLowerCase().equals("call")){
                System.out.println("true");
                System.out.println(userInput);
            }else{
                System.out.println("false");
                System.out.println(userInput);
            }

//        System.out.println(userInput);
            //userInput = userInput.replace('a', 'e');
    }
}
