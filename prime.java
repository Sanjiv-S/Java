public class prime {
        public static void main(String args[]){
            int n =1711;
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
        }
    }
