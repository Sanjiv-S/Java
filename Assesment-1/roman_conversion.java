import java.util.HashMap;
import java.util.Map;

public class roman_conversion {
    public static void main(String args []){
        String s="MCMXCIV";
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        char arr[]=s.toCharArray();
        int new_value=0;
        Map.Entry<Character, Integer>[] entries = values.entrySet().toArray(new Map.Entry[0]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<entries.length;j++){
                Character key =entries[j].getKey();
                if(arr[i]== key){
                    Integer value =entries[j].getValue();
                    new_value=value+new_value;
                    break;
                }}
                if(i>0){
                if((arr[i]=='V' || arr[i]=='X')&&(arr[i-1]=='I')){
                    new_value=new_value-2;    
                }
                else if((arr[i]=='L' || arr[i]=='C')&&(arr[i-1]=='X')){
                    new_value=new_value-20;    
                }
                else if((arr[i]=='D' || arr[i]=='M')&&(arr[i-1]=='C')){
                    new_value=new_value-200;    
                }
            }
        }
    
        System.out.println(new_value);
    }
    
}
