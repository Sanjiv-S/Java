import java.util.*;
public class Arrange_biggest_num {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];

    public static void largestnumber(int[] numbers){
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    // Compare the two concatenated numbers
                    String num1 = numbers[j] + "" + numbers[j + 1];
                    String num2 = numbers[j + 1] + "" + numbers[j];
                    if (num1.compareTo(num2) < 0) {    
            
            }
    }
}
    }}