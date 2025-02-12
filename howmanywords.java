import java.util.Scanner;
public class howmanywords {
    public static int howmanywords(String s){
        String[] arr = s.split(" ");
        int count = 0;
        for(String a :  arr){
            for(int i = 0; i<a.length(); i++){
                 char str=a.charAt(i);
            if(a.matches("[a-zA-Z]+")){
                count +=1;
                if (i)
            }
        }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        howmanywords h = new howmanywords();
        System.out.println(howmanywords.howmanywords(s));
    }
}
