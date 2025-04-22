import java.util.HashMap;
import java.util.Map;
public class freq {
    static void count(int arr[]){
        HashMap<Integer,Integer> map= new HashMap<>();
        int value=1;
        int new_val=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){    
                new_val=map.get(arr[i]);
                map.put(arr[i],new_val+1);
            }
            else{
                map.put(arr[i],value);
                value=1;
            }
        }
         for (Map.Entry<Integer, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()+ " Value: " + e.getValue());
    }

    public static void main(String args[]){
        int arr[]={10, 20, 20, 10, 10, 20, 5, 20};
        count(arr);

    }
}
