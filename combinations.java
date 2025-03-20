// public class combinations {
//     static void first(int candidates[],int target,int n,int sum,int val){
//         System.out.print("candidates:");
//         for(int i=0;i<n;i++){
//             sum=candidates[i]+sum;
//             if(sum<target){
//                 System.out.print(candidates[i]+" ");
//             }
//             else if(sum>target){
//                 val=target-(sum-candidates[i]);
//                 System.out.print(val);
//                 break;
//             }
//         }
//     }
//     static void second(int candidates[],int target, int n, int sum,int val){
//         System.out.print("candidates:");
//         for(int i=0;i<n;i++){
//             if(candidates[i]==target){
//                 System.out.print(candidates[i]);
//             }
//     }}
//     static void third(int candidates[],int target, int n, int sum,int val){
//         System.out.print("candidates:");
//         for(int i=0;i<n;i++){
//             if(candidates[i]!=target && target%candidates[i]==0){
//                 while(sum!=target){
//                     System.out.print(candidates[i]);
//                     sum=candidates[i]+sum;
//                 }
//             }
//     }
//     }
//         public static void main(String args[]){
//             int sum=0;
//             int candidates[] = {2,3,5};
//             int target=8;
//             int n = candidates.length;
//             int val=0;
//             first(candidates, target, n, sum, val);
//             System.out.println();
//             second(candidates, target, n, sum, val);
//             System.out.println();
//             third(candidates, target, n, sum, val);
//         }
//     }
public class combinations {
    static void first(int candidates[], int target, int n, int sum, int val, int new_arr[], int size) {
        System.out.print("Combination: ");
        for (int i = 0; i < n; i++) {
            sum += candidates[i];
            if (sum < target) {
                new_arr[size] = candidates[i];
                size++;
            } else if (sum > target) {
                val = target - (sum - candidates[i]);
                new_arr[size] = val;
                size++;
                break;
            }
        }

        // Print the valid combination
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(new_arr[i] + (i == size - 1 ? "" : ","));
        }
        System.out.println("]");
    }

    static void second(int candidates[], int target, int n, int sum, int val, int new_arr[], int size) {
        System.out.print("Combination: ");
        for (int i = 0; i < n; i++) {
            if (candidates[i] == target) {
                new_arr[size] = candidates[i];
                size++;
            }
        }

        // Print valid combinations
        if (size > 0) {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(new_arr[i] + (i == size - 1 ? "" : ","));
            }
            System.out.println("]");
        }
    }

    static void third(int candidates[], int target, int n, int sum, int val, int new_arr[], int size) {
        System.out.print("Combination: ");
        for (int i = 0; i < n; i++) {
            if (candidates[i] != target && target % candidates[i] == 0) {
                sum = 0;
                size = 0;
                while (sum + candidates[i] <= target) {
                    new_arr[size] = candidates[i];
                    sum += candidates[i];
                    size++;
                }
                break;
            }
        }

        // Print valid combinations
        if (size > 0) {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(new_arr[i] + (i == size - 1 ? "" : ","));
            }
            System.out.println("]");
        }
    }

    public static void main(String args[]) {
        int sum = 0;
        int candidates[] = {2, 3, 5};
        int target = 8;
        int n = candidates.length;
        int val = 0;
        int new_arr[] = new int[10]; // Array for storing results

        first(candidates, target, n, sum, val, new_arr, 0);
        second(candidates, target, n, sum, val, new_arr, 0);
        third(candidates, target, n, sum, val, new_arr, 0);
    }
}
