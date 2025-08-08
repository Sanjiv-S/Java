import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class str {
    public static void main(String args[]){
        String str = "Hello World";
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','A','e','E','i','I','o','O','u','U'
        ));

        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
