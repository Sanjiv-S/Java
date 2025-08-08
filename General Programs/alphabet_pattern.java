public class alphabet_pattern {
    public void alph_pattern(){
        char arr[]={'A','B','C','D','E','F','G'};
        int n=4;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<=i+count;j++){
                System.out.print(arr[j]);
            }
            System.out.println("");
            count++;
        }
    }
    public void reverse_alph(){
        char arr[]={'A','B','C','D','E'};
        int n =arr.length;
        int count =1;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=n-count;j--){
                System.out.print(arr[j]);
            }
            System.out.println("");
            count++;
        }
    }
    public static void main(String args[]){
        alphabet_pattern obj =new alphabet_pattern();
        obj.alph_pattern();
        System.out.println("");
        obj.reverse_alph();
    }
}
