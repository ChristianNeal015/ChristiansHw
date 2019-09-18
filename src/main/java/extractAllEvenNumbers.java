import java.util.Arrays;

public class extractAllEvenNumbers {

    public static void main(String[] args) {
        int[] input = {2, 5, 6, 7, 23, 4, 8, 12, 9};
        System.out.println(extractAllEvenNumbers(input));

    }

    public static String extractAllEvenNumbers(int[] numbers) {
        //Type your code here
         String result = "";
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] % 2 == 0) {
                result += numbers [i] + ",";
            }

        }
        return result.substring(0, result.length() -1);
    }
}
