public class duplicate {
   static void twopointer(int arr[]) {
        int target=7;
        int value=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
             value=arr[i]; 
             if(value==target){
                count++;
            }
            // System.out.println(value);
            for(int j=i+1;j<arr.length;j++){
                value+=arr[j];
                if(value==target){
                count++;
                break;
            }
            }
            //  System.out.println(value);
        }
        System.out.println(count);
        }

        static void sum(){
            int arr[][]={{1,2,3},{4,5,6},{7,8,9},{2,38,4}};
            int max_sum=0;
            int sum=0;
            int row=0;
            for(int i=0;i<arr.length;i++){
                sum=0;
                for(int j=0;j<arr[i].length;j++){
                    sum+=arr[i][j];
                    if(sum>max_sum){
                        row=i;
                        max_sum=sum;
                    }
                }
            }
            System.out.print(row+" "+max_sum);

        }

    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // // String str=sc.nextLine();
        // int new_value=0;
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<str.length();i++){
        //     if(map.containsKey(str.charAt(i))){
        //         new_value=map.get(str.charAt(i));
        //         map.put(str.charAt(i), new_value+1);
        //     }
        //     else{
        //         map.put(str.charAt(i),1);
        //     }
        // }
        // System.out.print(map);
        // System.out.println();
        int arr[]={3,4,7,2,3,5};
        // twopointer(arr);
        int m=2;
        int n=3;
        int arr1[][]=new int[m][n];
        int count=0;
        if((m*n)==arr.length){
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                    arr1[i][j]=arr[count];
                    count++;
                }
            }
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[0].length;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
        }
    }
        System.out.println();
        sum();
    }
}
