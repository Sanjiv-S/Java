import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
    
    static void findAnagram(){
        String arr[]={"eat","tea","tan","ate","nat","bat"}; 
        HashMap<String,LinkedHashSet<String>> map=new HashMap<>();
        for(String s:arr){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(map.containsKey(sortedString)){
                 map.get(sortedString).add(s);
            } 
            else {
            LinkedHashSet<String> set = new LinkedHashSet<>();
            set.add(s);
            map.put(sortedString, set);
        }
    }
    for (LinkedHashSet<String> group : map.values()) {
        System.out.println(group);
    }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=1;j<arr.length;j++){
        //         char[] charArray = arr[i].toCharArray();
        //         Arrays.sort(charArray);
        //         String sortedString = new String(charArray);
        //         char[] charArray1 =arr[j].toCharArray();
        //         Arrays.sort(charArray1);
        //         String sortedString1 = new String(charArray);
        //         if(sortedString.equals(sortedString1)){
        //             set.add(arr[i]);
        //             set.add(arr[j]);
        //         }
        //     }
        //     System.out.print(set);
        //     System.out.println();
        // }

    //     for(int i=0;i<arr.length;i++){
    //         int count=0;
    //         for(char ch:arr[i].toCharArray()){
    //             map.put(ch,map.getOrDefault(ch, 0)+1);
    //             if(i>0 && map.containsKey(ch)){
    //                 count++;
    //             }
    //         }
    //         if(i==0 || count==arr[i].length()){
    //                 System.out.print(arr[i]+" ");
    //             }
    // }
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
        // anagram();
        findAnagram();
    }
}
