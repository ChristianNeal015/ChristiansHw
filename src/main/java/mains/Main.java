package mains;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String correctPassword = "password";
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
//        boolean flag = true;
        while(true){
            System.out.println("What is the password?");
            String userInput = scanner.nextLine();

            if(userInput.equals(correctPassword)){
                System.out.println("You are logged in");
                break;
            }
            counter++;
        }
        System.out.println("You had " + counter + "wrong attempts");
        }

    }




