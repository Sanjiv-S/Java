import java.util.HashMap;

public class frequency {
    static void sort(){
        int arr[] ={10,5,4,2};
        int n=arr.length;
        int temp;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void freq(){
        String fre = "Thunderthun";
        char arr[] = fre.toCharArray();
        int n = arr.length;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : arr) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (char key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
    public static void main(String args[]){
       sort();
       System.out.println(); 
       freq();
    }
}
