public class third_max {
    static int find_max(int max,int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    static int second_max(int max,int arr[][],int second){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>second && arr[i][j]<max){
                    second=arr[i][j];
                }
            }
        }
        return second;
    }
    static int third_max(int arr[][],int second,int third){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>third && arr[i][j]<second){
                    third=arr[i][j];
                }
            }
        }
        return third;
    }
        public static void main(String args[]){
            int arr[][]={{1,2,3,},{4,5,6},{11,8,9}};
            int first_max=find_max(0,arr);
            int sec_max=second_max(first_max,arr,0);
            int thir_max=third_max(arr, sec_max, 0);
            System.out.println(thir_max+" is the Third max value");
            if(first_max==sec_max || sec_max==thir_max){
                System.out.print("there is no third amx value");
            }
    }
}
