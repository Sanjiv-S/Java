public class find_abundant {
    static int abundant(int n,int sum){
        int value=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum>n){
            value=1;
        }
        return value;
    }
    public static void main(String args[]){
        int arr[][] ={
            {12,4566,7890},
            {6543,8987,4567},
            {9654,9874,8523}};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(abundant(arr[i][j], 0)==1){
                    System.out.println(arr[i][j]+" is an abundant value");
                    count++;
                }
    }
}
        if(count%2==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
}}
