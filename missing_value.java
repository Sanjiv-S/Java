public class missing_value {
        static int missingNumber(int arr[]) {
            int n=arr.length;
            int result=0;
            int temp=0;
            for(int k=0;k<arr.length-1;k++){
              for (int j = 0; j < n - k - 1; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }}
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=i){
                    result=i;
                    break;
                }
            }
            return result;
        }
        public static void main(String args[]){
            int arr[]={
                1
            };
            System.out.println(missingNumber(arr));
        }
    }

