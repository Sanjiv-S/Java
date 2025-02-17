public class array {
    public void foreach(){
        int arr[]={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
        for(int i:arr){
            i++;
            System.out.print(i);
            
        }
    }

    public void max_arr(){
        int arr[] = {1,2,3,4,5};
        int max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println("Largest value:"+max);
    }

    public void sec_largest(){
        int arr[] ={1,2,3,4,5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];}
            }
        int sec_max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>sec_max){
                sec_max =arr[i];
            }
        }
        System.out.println("Second largest is:"+sec_max);
        int value =arr[0];
        int arr1[]={2,5,1,3,4};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i]<
            }
        }
    }

    public static void main(String args[]){
        array obj =new array();
        int arr[]={1,2,3,4,5};
        int i;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        for(i=0;i<arr.length;i++){
            arr[i]++;
            System.out.print(arr[i]);
        }
        System.out.println("");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
        for(i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println("");
        obj.foreach();
        System.out.println("");
        obj.max_arr();
        obj.sec_largest();
    }
}
