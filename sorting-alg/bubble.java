public class bubble {
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={64, 34, 25, 12, 22, 11, 90};
        sort(arr);
    }
}
