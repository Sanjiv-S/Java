public class prime {
    static int calc_prime(int number,int n){
        int counts=0;
        for(int i=2;i<=n/2;i++){
            if(number %i==0){
                counts++;
            }
        }
        return counts;
    }
        public static void main(String args[]){
            /*int n =1193;
            int i;
            int flag = 0 ;
            for(i=2;i<n/2;i++){
                if(n%i==0){
                    flag++;
                }
            }
            if(flag ==0){
                System.out.println(n+" number is a prime number:");
            }
            else{
                System.out.println(n+" number is not a prime number");
            }
        }*/
            System.out.print(calc_prime(222, 222));
    }
}
