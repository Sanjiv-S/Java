public class strong_number {
    static int calc_fact(int n){
        int value=n;
        for(int i=n-1;i>0;i--){
            value =value*i;
        }
        return value;
    }
    static int split(int n,int sum){
        while(n>0){
            int last = n%10;
            n=n/10;
            sum=sum+calc_fact(last);
        }
        return sum;
    }
    public static void main(String args[]){
        for(int i=1;i<=1000;i++){
            int sumOfFactorials = split(i,0);
            if(sumOfFactorials ==i){
                System.out.println(i+" is a strong number");
            }
        }
        /*else{
            System.out.print(sumOfFactorials+" is not a strong number");
        }*/
    }
}
