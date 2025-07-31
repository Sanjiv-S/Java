import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class spiral_matrix {
    static void rotate_clockwise(){
        int matrix[][]={
            {1,2,3,9},{4,5,6,4},{7,8,9,0}
        };
        int row=matrix.length;
        int col=matrix[0].length;
        int temp=0;
        for(int i=0;i<row;i++){
            for(int j=i;j<col-1;j++){
                if(i!=j){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
    }}
    static void spiral(){
        int matrix[][]={
            {1,2,3,9},
            {4,5,6,4},
            {7,8,9,0}
        };
        List<Integer> result = new ArrayList<>();
        int top=0;
        int left=0;
        int row=matrix.length-1;
        int col=matrix[0].length-1;
        while (top <= row && left <= col) {
            for (int i = left; i <= col; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= row; i++) {
                result.add(matrix[i][col]);
            }
            col--;
            if (top <= row) {
                for (int i = col; i >= left; i--) {
                    result.add(matrix[row][i]);
                }
                row--;
            }
            if (left <= col) {
                for (int i = row; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.print(result);
    }
    static void add(){
        String s="123";
        String str="457";
        int i=Integer.parseInt(s);
        int j=Integer.parseInt(str);
        int sum=i+j;
        System.out.print(sum);
    }
    static void case_togle(){
        String s="Hi heLLo";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                System.out.print(Character.toLowerCase(s.charAt(i)));
                System.out.print((char)(s.charAt(i)+32));
            }
            else{
                System.out.print(Character.toUpperCase(s.charAt(i)));
                System.out.print((char)(s.charAt(i)-32));
            }
        }

    }
    static void count_vowels(){
        String s="Hello $";
         Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','A','e','E','i','I','o','O','u','U'
        ));
        Set<Character> spl = new HashSet<>(Arrays.asList('!','@','#','$','%','^','&','*'));
        int vowel=0;
        int consonant=0;
        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                vowel++;
            }
            else{
                if(!spl.contains(s.charAt(i))){
                    consonant++;
                }
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }

    static void fibonacci(int n, int a, int b, int count) {
    if (count >= n) return;

    System.out.print(a + " ");
    fibonacci(n, b, a + b, count + 1);
}


    static void printnum(int n,int num){
        if(num<=n){
            System.out.println(num);
            printnum(n,++num);
        }
    }

    static boolean check_palindrome(String s,int start_ind,int end_ind){
        if(s.length()%2==0){
            if(s.charAt(end_ind)!=s.charAt(start_ind)){
                return false;
            }
            else{
                if(end_ind>=start_ind){
                    check_palindrome(s, start_ind+1, end_ind-1);
                }
                else{
                    return true;
                }
            }
    }
        return false;
    }

    static int zeroes(int num,int count){ 
        int last_digit=num%10;
        if(num>0){
            if(last_digit==0){
                return zeroes(num/10,count+1);
            }else{
                return zeroes(num/10,count);
            } 
        }
        return count; 
    }

    
    public static void main(String args[]){
        // int matrix[][]={
        //     {1,2,3,9},{4,5,6,4},{7,8,9,0}
        // };
        // int row=matrix.length;
        // int col=matrix[0].length;
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(matrix[i][j]);
        //     }
        // }
        // rotate_clockwise();
        // System.out.println();
        // spiral(); 
        // add();
        // case_togle();
        // count_vowels();
        
        int n=5;
        int num=0;
        fibonacci(n,0, 1, 0);
        // System.out.print(fibonnaci(n));
        printnum(n,num);
       System.out.println( check_palindrome("hhoohh", n, num));
       System.out.println(zeroes(1023408010, 0)); 
    }
}
