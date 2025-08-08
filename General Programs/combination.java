public class combination {
    public static void main(String args[]) {
        int candidates[] = {2, 3, 5};
        int target = 8;
        int new_arr[] = new int[10]; 
        findCombinations(candidates, target, 0, new_arr, 0);
    }
    static void findCombinations(int[] candidates, int target, int index, int[] new_arr, int size) {
        if (target == 0) {
         
            System.out.print("Combination: ");
            for (int i = 0; i < size; i++) {
                System.out.print(new_arr[i] + " ");
            }
            System.out.println();
            return;
        }
        if (target < 0 || index == candidates.length) {
            return; 
        }
        new_arr[size] = candidates[index]; 
        findCombinations(candidates, target - candidates[index], index, new_arr, size + 1);
        findCombinations(candidates, target, index + 1, new_arr, size);
    }
}

