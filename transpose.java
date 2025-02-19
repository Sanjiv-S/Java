public class transpose {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int row_start=0;
        int col_start=0;
        int row_end=arr.length;
        int col_end=arr[0].length;
        for(int i=0;i<=row_end;i++){
            for(int j=i;j<col_end;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < row_end; i++) {
            for (int j = 0; j < col_end; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
