import java.util.Arrays;

public class CombinationSumUnique {
    static void findCombinations(int candidates[], int target, int index, int new_arr[], int size, boolean used[]) {
        if (target == 0) {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(new_arr[i] + (i == size - 1 ? "" : ","));
            }
            System.out.println("]");
            return;
        }

        for (int i = index; i < candidates.length; i++) {
           
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break; 
            }

            
            new_arr[size] = candidates[i];
            findCombinations(candidates, target - candidates[i], i + 1, new_arr, size + 1, used);
        }
    }

    public static void main(String args[]) {
        int candidates[] = {2,5,2,1,2};
        int target = 5;
        Arrays.sort(candidates); 
        int new_arr[] = new int[candidates.length]; 
        boolean used[] = new boolean[candidates.length];

        System.out.println("Unique Combinations:");
        findCombinations(candidates, target, 0, new_arr, 0, used);
    }
}
