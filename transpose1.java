public class transpose1 {
    public static void spiral(){
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        int top=0;
        int left=0;
        int right=arr.length-1;
        int bottom=arr[0].length-1;

        while (top<=bottom && left<=right) { 
            for(int i=left;i<=right;i++){
                System.err.print(arr[top][i]+" ");
            }
            top++;
            for(int j=top;j<=bottom;j++){
                System.out.print(arr[j][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int k=right;k>=left;k--){
                    System.out.print(arr[bottom][k]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>left;l--){
                    System.out.print(arr[l][left]+" ");
                }
                left++;
            }
        }
    }
    static void snakepattern(){
         int arr[][]={
            {1,2,3,4},
            {4,5,6,7},
            {7,8,9,10}};
            int n=arr.length;
            int m=arr[0].length;
            int row=0;
            while(row<n){
                if(row%2==0){
                    for(int i=0;i<m;i++){
                        System.out.print(arr[row][i]+ " ");
                }
                row++;
                }
                else{
                    for(int i=m-1;i>=0;i--){
                        System.out.print(arr[row][i]+ " ");
                }
                row++;
                }
            }
            }
    static void pattern(){
        int arr[][]={
            {1,1,1,1},
            {1,0,1,1},
            {1,1,1,1}
        };
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<arr[0].length;k++){
                        arr[i][k]=0;
                    }
                    for(int k=0;k<arr.length;k++){
                        arr[k][j]=0;
                    }
                    count=1;
                }
                if(count==1){
                    break;
                }
                

            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int [][] arr={
            {1,6,7},
            {9,18,15},
            {21,8,14}
        };
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        } 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
    }
    System.out.println();
}
    spiral();
    System.out.println("");
    snakepattern();
    System.out.println("");
    pattern();
}
}


