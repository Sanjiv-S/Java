public class adding_array {
   
    public static void main(String args[]){
        int A[] ={5,1,3,7};
        int B[] ={9,7,7,7,9};
        int n=A.length;
        int quotient=0;
        int sum =0;
        int new_value []= new int[5];
        for(int i =0;i<n;i++){
            for(int j=i;j<=i;j++){
                if(quotient ==0){
                    sum= A[i]+B[j];
                }
                else{
                    sum = A[i]+B[j]+quotient;
                }
            }
            new_value [i]= sum % 10;
            quotient =sum/10;
        }
        for (int num : new_value) {
            System.out.print(num + " ");
    }
}
}