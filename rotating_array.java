public class rotating_array {
    public static void main(String args[]){
        int row =0;
        int col =0;
        int curr=0;
        int prev=0;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r=arr.length;
        int l=arr[0].length;
        while(row<r && col<arr[0].length){
            if(row+1==r || col+1==arr[0].length){
                break;
            }
            prev =arr[row+1][col];
            for(int i=0;i<r;i++){
                curr=arr[row][i];
                arr[row][i]=prev;
                prev=curr;
            }
            for(int i=0;i<l;i++){
                curr=arr[i][l-1];
                arr[i][l-1]=prev;
                prev=curr;
            }
            for(int i=l;i>row;i--){
                curr=arr[l][i];
                arr[l][i]=prev;
                prev=curr;
            }
            for(int i=r;i>col;i--){
                curr=arr[i][col];
                arr[i][col]=prev;
                prev=curr;
            }
           
            
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    }
}
}
