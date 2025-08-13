
import java.lang.reflect.Array;
import java.util.Stack;
import java.util.*;
import java.util.ArrayList;

public class ListExample {
    static void example(Scanner sc){
        System.out.println("Enter the String input:");
        String input=sc.nextLine();
        Stack<Integer> count=new Stack<>();
        Stack<String> str=new Stack<>();
        int open=0;
        for(int i=0;i<input.length();i++){
            char val=input.charAt(i);
            if(Character.isDigit(val)){
                count.push(val-'0');
            }
            else if(val=='['){
                open=i+1;
            }
            else if(val==']'){
                String string=input.substring(open, i);
                int num=count.pop();
                int cnt=0;
                while(cnt<num){
                    System.out.print(string);
                    cnt++;
                }
            }
        }
    }
    static void missing(Scanner sc){
        HashMap<Integer,Boolean> list=new HashMap<>();
        ArrayList<Integer>  list=new ArrayList<>();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        example(sc);
    }
}
