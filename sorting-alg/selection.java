public class selection {
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=temp;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={23,43,552,3,1,5,0,2};
        sort(arr);
    }
}
