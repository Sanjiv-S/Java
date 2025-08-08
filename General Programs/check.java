import java.util.Scanner;
public class check {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int len = str.length();
        char[] stack = new char[len+1];
        int top = -1;
        for(int ind = 0; ind < len ; ind++){
            char ch = str.charAt(ind);
            if( ch == '(' || ch == '{' || ch =='['){
                top = top +1;
                stack[top] = ch;
            }
            else{
                if(top !=-1 && ((ch == ')' && stack[top] != '(')
                || (ch == '}' && stack[top] != '{')
                || (ch == ']' && stack[top] != '[')))
                {
                    System.out.print("False");
                    return;
                }
                top = top-1;
            }
        }
        System.out.print("True");
        input.close();
    }
}
