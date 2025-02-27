public class twisted_prime {
    public static int count=1;
    static int calc_prime(int number){
        if(number<2) return 1;
        for(int i=2;i*i<=number;i++){
            if(number %i==0){
                return 1;
            }
        }
        return 0;
    }
    static int calc_count(int n){
        while(n/10!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    static void prime(int n){
        String str ="";
        int m=calc_count(n);
        
        for(int j=1;j<=m;j++){
            int rem=n%10;
            str = str+rem;
            int quo=n/10;
            n=quo;
        }
        int number = Integer.valueOf(str);
        if(calc_prime(number)==0){
            System.out.println(number+" its twisted prime");
    }
        else{
            System.out.println(number+" its not a twisted prime");
    }
}
    public static void main(String args[]){
        prime(11934);
    }
}