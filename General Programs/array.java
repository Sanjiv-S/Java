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
    }
    public void consecutive_num(){
        int arr[]= {1,1,0,1,1,0,0,1,0,1,1,1,1};
        int prev= 0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else if(arr[i]==0){
                if(prev<=count){
                    prev = count;
                }
                count=0;
            }
            else{
                System.out.println("no such value");
            }
        }
        if(prev>=count){
            System.out.println("num of consecutive one's:"+prev);
        }
        else{
            System.out.println("num of consecutive one's:"+count);
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
        obj.consecutive_num();
    }
}
