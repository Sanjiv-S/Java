import java.util.Scanner;
import java.util.HashSet;
public class palindrom {
    static void decode(Scanner sc){
        System.out.println("Enter the Input");
        String str=sc.next();
        int count=0;
        char ch;
        String output="";
        for(int i=0;i<str.length();i++){
            if(i!=str.length()-1 && str.charAt(i)=='1'){
                count++;
            }
            else if(i==str.length()-1 && str.charAt(i)=='1'){
                count++;
                ch=(char)(64+count);
                count=0;
                output+=Character.toString(ch);
            }
            else{
                ch=(char)(64+count);
                count=0;
                output+=Character.toString(ch);
            }
    }
        System.out.println(output);
    }
    public static void main(String args[]){
        HashSet<Character> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int value=1221;
        int temp=value;
        int reversed=0;
        int count=3;
        while(value>0){
            int rem=value%10;
            reversed+=(rem*Math.pow(10,count));
            value=value/10; 
            count--;
        }
        System.out.println(reversed + " "+temp);
        if(reversed==temp){
            System.out.println("its a pallindrome");
        }
        else{
            System.out.println("It is not a pallindrome");
        }
        System.out.println("Enter the String:");
        String str=sc.next();
        char[] charArray=str.toCharArray();
        for(int i=0;i<str.length();i++){
            set.add(charArray[i]);
        }
        System.out.println(set.toString());
        decode(sc);
    }
    

}
