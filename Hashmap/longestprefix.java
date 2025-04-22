import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class longestprefix {
    static void pref(String strs[]){
    HashMap<Character,Integer> map= new HashMap<>();
        int value=1;
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            for(int j=0;j<arr.length;j++){
                if(i==0){
                    map.put(arr[j],value);
                }
                else if(map.containsKey(arr[j])){
                    map.put(arr[j],value+1);
                }
            }
        }
        int maxValueInMap = (Collections.max(map.values()));
        for(Map.Entry <Character,Integer> entry: map.entrySet()){
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
    public static void main(String args[]){
        String strs[]={"flower","flow","flight","fli"};
        pref(strs);
    }

}
