public class duplicate {
    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 1, 2, 9};
        int new_array[] = new int[arr.length];
        int new_array_index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    
                    boolean found = false;
                    for (int k = 0; k < new_array_index; k++) {
                        if (new_array[k] == arr[i]) {
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        new_array[new_array_index++] = arr[i];
                    }
                }
            }
        }

        
        for (int k = 0; k < new_array_index; k++) {
            System.out.print(new_array[k] + " ");
        }
    }
}
