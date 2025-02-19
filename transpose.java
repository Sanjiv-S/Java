public class transpose {
    public void transpose_array(){
        int arr[][]={{1,2,3,5},{4,5,6,11},{7,8,9,22},{66,78,9,54}};
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
    public void add_element(){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n =arr.length;
        int c[]=new int[5];
        int k=0;
        int sum=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                    c[k]=arr[i][j];
                    k++;
                    }    
                }
        for (int i = 0; i < k; i++) {
            sum += c[i];
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        transpose obj =new transpose();
        obj.transpose_array();
        System.out.println();
        obj.add_element();
    }
}
