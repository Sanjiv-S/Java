import java.util.ArrayList;
import java.util.List;

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
        case_togle();
    }
}
