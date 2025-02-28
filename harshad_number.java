public class harshad_number {
    static int split(int n,int sum){
        while(n>0){
            int rem =n%10;
            n =n/10;
            sum=sum+rem;
        }
        return sum;
    }
    public static void main(String args[]){
        int first=10;
        int last=15;
        for(int i=first;i<=last;i++){
            if(i%split(i,0)==0){
                System.out.println(i+" is a harshad number");
            }
        }
    }
}
