public class sort {
    static void sort012(int[] arr) {
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>=arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void main(String args[]){
        int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
    }
}
