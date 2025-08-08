public class find_index {
    public static void main(String args[]){
        int A[]={2,7,5,7};
        int n=9;
        for(int i =0;i<A.length;i++){
            for(int j=1;j<A.length;j++){
                if(A[i]+A[j]==n){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}

