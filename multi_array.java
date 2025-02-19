import java.util.Scanner;
public class multi_array {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int row =sc.nextInt();
        System.out.print("Enter the no of columns");
        int col =sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the values:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
                
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
       
    }
}

