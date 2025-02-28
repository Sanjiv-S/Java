public class swap_matrix {
    public static void main(String args[]){
        int arr[][]={
            {5,4,7},
            {1,8,3},
            {9,6,2}
        };
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    temp = arr[i][j];
                    arr[j][i] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
}}
