import java.util.Arrays;

public class swapArrays {
    public static void main(String[] args) {
        String[] arr = {"A1","B2","C3"};
        System.out.println(Arrays.toString(swap(arr)));

    }
    public static String[] swap(String[] stringArray) {
        String string1 = stringArray[0];
        String string2 = stringArray[stringArray.length - 1];
        stringArray [0] = string2;
        stringArray[stringArray.length - 1] = string1;

        return stringArray;
    }

}
