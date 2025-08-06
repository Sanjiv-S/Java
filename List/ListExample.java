
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Sanjiv");
        list.add("Spiderman");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        
    }
}
