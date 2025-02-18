public class shift_array {
    public static void main(String args[]){
        int i=0;
        int A[]={10,20,5,1,3,2};
        int n=A.length;
        int num =3;
        int count=1;
        while(count<=num){
            int temp=A[n-1];
            for(i=n-1;i>0;i--){
                A[i] = A[i-1];
            }
            A[0] =temp;
            count++;
        }
        for(int j:A){
            System.out.print(j+" ");
        }
    }
}
