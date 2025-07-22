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

    static void calculate_frequency(int arr[]){
        int  value=1;
        int existing_value;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                existing_value =map.get(arr[i]);
                map.put(arr[i],existing_value+value);  
            }
            else{
                map.put(arr[i],value);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
                System.out.println("key :"+e.getKey()+"count :"+e.getValue());
            }
    }

    static void distint_element(int input[],int k){
        int start=0;
        int end=k;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            for(int j=start;j<end;j++){
                if()

            }
        }
    }
    public static void main(String args[]){
        int arr[]={10, 20, 20, 10, 10, 20, 5,8,7,7,7 ,20};
        int input[]={1,2,1,3,4,2,3};
        int k=4;
        count(arr);
        System.out.println("");
        calculate_frequency(arr);

    }
}
