import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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

    static void distint_element(){
        String s="hello";
        ArrayList<Character> list=new ArrayList<>();
        int unique=0;
        for(int i=0;i<s.length();i++){
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                if(i<=unique){
                    unique=i;
                }
            }
        }
        if(unique==-1){
            System.out.println(unique);
        }
        else{
        System.out.print(s.charAt(unique));
        }
    }

    static void countword(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=' ' && (i == 0 || str.charAt(i - 1) == ' ')){
                count++;
            }
        }
        System.out.print(count);
    }


    static void anagram() {
        String s = "listen";
        String s1 = "silens";

        if (s.length() != s1.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!map.containsKey(c)) {
                System.out.println("Not an Anagram");
                return;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                System.out.println("Not an Anagram");
                return;
            }
        }

        System.out.println("Is an Anagram");
    }



    public static void main(String args[]){
        int arr[]={10, 20, 20, 10, 10, 20, 5,8,7,7,7 ,20};
        int input[]={1,2,1,3,4,2,3};
        int k=4;
        // count(arr);
        // System.out.println("");
        // calculate_frequency(arr);
        // distint_element(); 
        // countword();
        anagram();
    }
}
